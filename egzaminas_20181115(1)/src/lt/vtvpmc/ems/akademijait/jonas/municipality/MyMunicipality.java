package lt.vtvpmc.ems.akademijait.jonas.municipality;

import lt.vtvpmc.municipality.IllegalCitizenException;
import lt.vtvpmc.municipality.Municipality;
import lt.vtvpmc.municipality.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MyMunicipality implements Municipality {

    private final static Logger logger = LoggerFactory.getLogger(MyMunicipality.class);
    List<Person> listOfCitizens;

    public MyMunicipality() {
        listOfCitizens = new ArrayList<>();
    }


    @Override
    public void registerCitizen(Person person) throws IllegalCitizenException {
        LocalDate currentDate = LocalDate.now();

        if (person == null) {
            logger.error("Provided person is null");
            throw new NullPointerException("Provided person is null");
        }

        if ((person.getFirstName() == null || person.getFirstName() == "") || (person.getLastName() == null
                || person.getFirstName() == "") || person.getDateOfBirth() == null || person.getDateOfBirth().isAfter(currentDate)
                || person.getYearlyIncome() < 0) {
            logger.error("Provided person is not eligable for citizenship");
            throw new IllegalCitizenException(person);
        }

        if (isRegisteredCitizen(person)) {
            logger.error("Provided person is already a citizen");
        } else {
            listOfCitizens.add(person);
            logger.info("Provided person is added to list of the citizens");
        }
    }

    @Override
    public boolean isRegisteredCitizen(Person person) {
        if (person == null) {
            logger.error("Provided person is null");
            throw new NullPointerException("Provided persno is null");
        }

        if (listOfCitizens.contains(person)) {
            logger.info("Provided person is the list of citizens");
            return true;
        } else {
            logger.info("Provided person is not in the list of citizens");
            return false;
        }

    }

    @Override
    public Person findOldestPerson() {
        if (listOfCitizens.size() == 0) {
            logger.error("The list of citizens is empty");
            throw new IllegalArgumentException("The list of citizens is empty");
        }
        Person oldestPerson = listOfCitizens.get(0);
        for (Person currentPerson : listOfCitizens) {
            if (oldestPerson.getDateOfBirth().isAfter(currentPerson.getDateOfBirth())) {
                oldestPerson = currentPerson;
            }
        }
        logger.info("The oldest citizen is found");
        return oldestPerson;
    }

    @Override
    public double totalIncomeInTaxes() {
        double totalIncomeInTaxesAmount = 0;
        for (Person currentPerson : listOfCitizens) {
            if (currentPerson.getYearlyIncome() < 14000) {
                totalIncomeInTaxesAmount += 0;
            } else if (currentPerson.getYearlyIncome() > 1000000) {
                totalIncomeInTaxesAmount += currentPerson.getYearlyIncome() * 0.16;
            } else {
                totalIncomeInTaxesAmount += currentPerson.getYearlyIncome() * 0.15;
            }
        }
        logger.info("Total amount of tax income has been calculated");
        return totalIncomeInTaxesAmount;
    }

    @Override
    public int getCitizenCount() {
        logger.info("The total number of citizens is calculated");
        return listOfCitizens.size();
    }
}
