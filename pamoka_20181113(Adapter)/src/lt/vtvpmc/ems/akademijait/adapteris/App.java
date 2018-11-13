package lt.vtvpmc.ems.akademijait.adapteris;

public class App {

    public static void main(String[] args)
    {
        //YRA klase, kuri turi veikianti metoda, kuriam yra paduodamas interfeiso tipo objketas!!!
        //Dabar cia nera tos klases, kuri butu igyvendinusi Megaphone interfeisa
        //As turiu kita klase, kuri galetu atlikti darba (LoudSpeaker), bet ji nieko nezino apie interfeisa ir
        //jos turimas metodas yra kitoks.
        //kaip as galiu ta metoda "idarbinti"?
        //Man reikalingas adapteris, kuri butu realizaves interfeiso metoda ir tuo paciu pritaikydamas jo veikima naujam metodui

        String result = User.shout(
                new LoudSpeakerToMegaphoneAdapter(
                        new LoudSpeaker()));

        System.out.println(result);
    }


}
