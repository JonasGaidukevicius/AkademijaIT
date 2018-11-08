package lt.vtvpmc.ems.akademijait.jonas;

public enum Planets {
    Mercury(1), Venus(2), Earth(3), Mars(4);
    private int planetNumber;

    Planets(int planetNumber) {
        this.planetNumber = planetNumber;
    }

    public int getPlanetNumber() {
        return planetNumber;
    }
}
