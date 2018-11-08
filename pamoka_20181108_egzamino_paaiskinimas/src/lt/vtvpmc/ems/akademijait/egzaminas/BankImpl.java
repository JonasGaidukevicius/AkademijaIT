package lt.vtvpmc.ems.akademijait.egzaminas;

import lt.itakademija.exam.*;

import java.util.ArrayList;
import java.util.List;

public class BankImpl implements Bank {

    private SequenceGenerator customerSequence = new SequenceGenerator();
    private List<Customer> customers = new ArrayList<>();

    public BankImpl(CurrencyConverter currencyConverter) {
    }

    @Override
    public Customer createCustomer(PersonCode personCode, PersonName personName) {
        if(personCode == null || personName == null){
            throw new NullPointerException();
        }
        for (Customer customer: customers) {
            if(customer.getPersonCode().equals(personCode)){
                throw new CustomerCreateException("Customer already exists");
            }
        }
        Customer customer = new Customer(customerSequence.getNext(), personCode, personName);
        customers.add(customer);
        return customer;
    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {
        return null;
    }

    @Override
    public Operation transferMoney(Account account, Account account1, Money money) {
        return null;
    }

    @Override
    public Money getBalance(Currency currency) {
        return null;
    }
}
