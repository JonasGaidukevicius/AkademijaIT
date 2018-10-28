package lt.vtvpmc.sender;

public class SurasauZinias {
/*
    ADAPTER
    Naudojama tada, kai:
    1) veiksma atliekanti klase turi metoda, kurio parametras yra interfeiso tipo ir per paduota
    parametra yra kvieciamas jo igyvendintas interfeiso metodas.
    2) reikalinga panaudoti naujos (kitos) klases metoda, o ne igyvendinta interfeiso metoda
    Toks pakeitimas reikalingas

    Problematika yra ta, kad veiksma atliekanti klase turi metoda, kuriam yra paduodamas interfeiso tipo objektas ir
    pacio principo pakeisti negalima - i sita metoda vis tiek turi buti paduotas interfeiso tipo objektas.
     *//*


    //INTERFEISAS
    public interface SmsProvider{
        boolean sendMessage(long number, String text);
    }

    //KLASE, kuri yra implementavusi interfeisa ir igyvendinusi metoda
    public class OldSmsProvider implements SmsProvider{
        public boolean sendMessage(long number, String text) {
            System.out.println(number + ":" + text);
            return true;
        }
    }

    //VEIKIANTI KLASE, kuri turi metoda, kuriam paduodamas interfeiso tipo objektas ir per kuri veliau yra kvieciamas
    //igyvendintas interfeiso metodas
    public class MessageSender {

        public boolean sendMessages(SmsProvider provider) {
            return provider.sendMessage(80300000, "Labas rytas!")
                    && provider.sendMessage(370250211, "Labas rytas!")
                    && provider.sendMessage(584395839, "Labas rytas!");
        }
    }

    //NAUJA KLASE, kurios metoda dabar noreciau naudoti
    public class NewProvider {
        public boolean sendShortMessage(String phoneNumber, String message) {
            System.out.println("@ " + phoneNumber + ": " + message);
            return true;
        }
    }
    */
/*
    Tada kuriamas adapteris, kad ji butu galima paduoti i veikiancios klases metoda, kaip interfeiso tipa, bet jame
     interfeiso metodas jau yra kitaip ispildytas ir yra pritaikyta kviesti sios klases metoda.
     *//*

    public class NewToOldAdapter implements SmsProvider { //implementuoju interfeisa, kad butu tinkamo tipo
        private NewProvider newProvider; //sioje klaseje sukuriu lauka naujos klases tipo, kurioje yra reikiamas metodas
        //konstruktorius, kurio pagalba priskiriu naujos klases tipo laukui reiksme
        public NewToOldAdapter(NewProvider newProvider) {
            this.newProvider = newProvider;
        }
        //igyvendimamas interfeiso metodas
        public boolean sendMessage(long number, String text) {
            // jo viduje adaptuoju senojo metodo parametrus naujojo metodo parametrams ir per naujos klases lauka
            // iskvieciu naujos klases metoda
            return newProvider.sendShortMessage(Long.toString(number), text);
        }
    }
    */
/*
    Teste parasau, kad sukuriamas MessageSender tipo objektas ir kvieciamas jo metodas.
    Kaip parametras yra paduodamas ne senasis interfeiso tipo obejktas OldSmsProvider, o naujasis, kuris yra
    adapteris - NewToOldAdapter. O pastarajam yra paduodamas naujos klases, kur yra reikiamas metodas, objektas.
     *//*

    @Test
    public void canSendMessages() {
        MessageSender sender = new MessageSender();
        boolean result = sender.sendMessages(new NewToOldAdapter(new NewProvider()));
        assertTrue(result);
    }

    //Senuoju variantu yra taip:
    @Test
    public void canSendMessagesInOldWay(){
        MessageSender sender1 = new MessageSender();
        boolean result1 = sender1.sendMessages(new OldSmsProvider());
        assertTrue(result1);
    }
}
