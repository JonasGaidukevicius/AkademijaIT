package lt.vtvpmc.ems.akademijait.jonas;

public class Preke {
    protected String pavadinimas;
    protected double kainaBePVM;
    protected double kainaSuPVM;





    public void setKainaSuPVM(double kainaBePVM) {
        this.kainaSuPVM = kainaBePVM * 1.21;
    }

    public double getKainaKainaSuPVM() {
        return this.kainaSuPVM;
    }
}

