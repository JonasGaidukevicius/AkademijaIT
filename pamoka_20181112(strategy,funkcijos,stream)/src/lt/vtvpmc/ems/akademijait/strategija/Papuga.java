package lt.vtvpmc.ems.akademijait.strategija;

public class Papuga {

    private Elgesys elgesys;

    public Papuga(Elgesys elgesys){
        this.elgesys = elgesys;
    }

    public void papugaKalba(String zodis){
        System.out.println("Poli " + elgesys.papugosElgesys(zodis));
    }


}
