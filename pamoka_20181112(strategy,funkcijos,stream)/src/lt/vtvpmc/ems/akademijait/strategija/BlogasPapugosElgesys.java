package lt.vtvpmc.ems.akademijait.strategija;

public class BlogasPapugosElgesys implements Elgesys {

    @Override
    public String papugosElgesys(String zodis) {
        if(zodis.equals("Labas")){
            return "Rūpus miltai";
        } else if(zodis.equals("Visogero")){
            return "Velniai rautų";
        } else if(zodis.equals("Sausainis")){
            return "Noriu sausainio";
        }

        return "Velnias";
    }
}
