package lt.vtvpmc.ems.akademijait.jonas.municipality;

import lt.vtvpmc.municipality.IllegalCitizenException;
import lt.vtvpmc.municipality.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TestMunicipality {

    @Test
    void shouldRegisterCitizen() throws IllegalCitizenException {
        Person testPerson1 = new Person("John", "Black", LocalDate.of(2018, 11, 15),
                20000.0);
        MyMunicipality testMunicipality = new MyMunicipality();
        int beforeRegisteringNewCitizen = testMunicipality.getCitizenCount();
        testMunicipality.registerCitizen(testPerson1);
        int afterRegisteringNewCitizen = testMunicipality.getCitizenCount();
        assertEquals(1, afterRegisteringNewCitizen);
        //Second option
        assertTrue(afterRegisteringNewCitizen > beforeRegisteringNewCitizen);

    }

    @Test
    void shouldReturnTrueIfPersonIsAlreadyACitizen() throws IllegalCitizenException {
        Person testPerson1 = new Person("John", "Black", LocalDate.of(2018, 11, 15),
                20000.0);
        Person testPerson2 = new Person("John", "Black", LocalDate.of(2018, 11, 15),
                20000.0);
        MyMunicipality testMunicipality = new MyMunicipality();
        testMunicipality.registerCitizen(testPerson1);
        boolean isCitizen = testMunicipality.isRegisteredCitizen(testPerson2);
        assertTrue(isCitizen);

    }

    @Test
    void shouldFindOldestPerson() throws IllegalCitizenException {
        Person testPerson1 = new Person("John", "Black", LocalDate.of(2016, 11, 15),
                20000.0);
        Person testPerson2 = new Person("Steve", "White", LocalDate.of(2010, 11, 15),
                20000.0);
        Person testPerson3 = new Person("Ana", "Fox", LocalDate.of(2008, 11, 15),
                20000.0);
        Person testPerson4 = new Person("Donald", "Obama", LocalDate.of(2017, 11, 15),
                20000.0);
        MyMunicipality testMunicipality = new MyMunicipality();
        testMunicipality.registerCitizen(testPerson1);
        testMunicipality.registerCitizen(testPerson2);
        testMunicipality.registerCitizen(testPerson3);
        testMunicipality.registerCitizen(testPerson4);

        Person oldestPerson = testMunicipality.findOldestPerson();
        assertEquals("Ana", oldestPerson.getFirstName());

    }

    @Test
    void totalIncomeInTaxes() throws IllegalCitizenException {
        double testTaxes = 0;
        Person testPerson1 = new Person("John", "Black", LocalDate.of(2016, 11, 15),
                2000000.0);
        Person testPerson2 = new Person("Steve", "White", LocalDate.of(2010, 11, 15),
                10000.0);
        Person testPerson3 = new Person("Ana", "Fox", LocalDate.of(2008, 11, 15),
                20000.0);
        Person testPerson4 = new Person("Donald", "Obama", LocalDate.of(2017, 11, 15),
                20000.0);

        MyMunicipality testMunicipality = new MyMunicipality();
        testMunicipality.registerCitizen(testPerson1);
        testMunicipality.registerCitizen(testPerson2);
        testMunicipality.registerCitizen(testPerson3);
        testMunicipality.registerCitizen(testPerson4);

        testTaxes = testMunicipality.totalIncomeInTaxes();

        assertEquals(326000.0, testTaxes);
    }

    @Test
    void getCitizenCount() throws IllegalCitizenException {

        int numberOfCitizens = 0;
        Person testPerson1 = new Person("John", "Black", LocalDate.of(2016, 11, 15),
                2000000.0);
        Person testPerson2 = new Person("Steve", "White", LocalDate.of(2010, 11, 15),
                10000.0);
        Person testPerson3 = new Person("Ana", "Fox", LocalDate.of(2008, 11, 15),
                20000.0);
        Person testPerson4 = new Person("Donald", "Obama", LocalDate.of(2017, 11, 15),
                20000.0);

        MyMunicipality testMunicipality = new MyMunicipality();
        testMunicipality.registerCitizen(testPerson1);
        testMunicipality.registerCitizen(testPerson2);
        testMunicipality.registerCitizen(testPerson3);
        testMunicipality.registerCitizen(testPerson4);

        numberOfCitizens = testMunicipality.getCitizenCount();
        assertEquals(4, numberOfCitizens);
    }
}