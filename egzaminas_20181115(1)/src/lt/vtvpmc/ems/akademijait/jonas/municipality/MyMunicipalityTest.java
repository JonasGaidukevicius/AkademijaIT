package lt.vtvpmc.ems.akademijait.jonas.municipality;

import lt.vtvpmc.municipality.AbstractMunicipalityTest;
import lt.vtvpmc.municipality.Municipality;

public class MyMunicipalityTest extends AbstractMunicipalityTest {
    @Override
    public Municipality getMunicipality() {
        return new MyMunicipality();
    }
}
