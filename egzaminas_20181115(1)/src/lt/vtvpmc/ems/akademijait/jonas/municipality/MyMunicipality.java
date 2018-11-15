package lt.vtvpmc.ems.akademijait.jonas.municipality;

import lt.vtvpmc.municipality.IllegalCitizenException;
import lt.vtvpmc.municipality.Municipality;
import lt.vtvpmc.municipality.Person;

public class MyMunicipality implements Municipality {


    @Override
    public void registerCitizen(Person person) throws IllegalCitizenException {

    }

    @Override
    public boolean isRegisteredCitizen(Person person) {
        return false;
    }

    @Override
    public Person findOldestPerson() {
        return null;
    }

    @Override
    public double totalIncomeInTaxes() {
        return 0;
    }

    @Override
    public int getCitizenCount() {
        return 0;
    }
}
