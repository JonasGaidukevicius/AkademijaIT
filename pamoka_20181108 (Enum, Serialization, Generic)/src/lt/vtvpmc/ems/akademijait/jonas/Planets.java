package lt.vtvpmc.ems.akademijait.jonas;

public enum Planets {
    Mercury(1, "Maza"), Venus(2, "Didele"), Earth(3, "Normali"), Mars(4, "lanbai didele");
    private int planetNumber;
    private String planetSize;



    Planets(int planetNumber, String planetSize) {
        this.planetNumber = planetNumber;
        this.planetSize = planetSize;
    }

    public int getPlanetNumber() {
        return planetNumber;
    }

    public String getPlanetSize() {
        return planetSize;
    }
}
