package lt.vtvpmc.ems.akademijait.strategija;

public class BadBehavior implements Behavior {
    @Override
    public String answer(String message) {

        if(message.contains("sausainis")){
            return "kad yra gera ir nori sausainio";
        } else{
            return "Rūpus miltai, kur sausainis";
        }

    }
}
