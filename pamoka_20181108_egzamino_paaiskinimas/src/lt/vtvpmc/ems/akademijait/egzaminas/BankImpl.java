package lt.vtvpmc.ems.akademijait.egzaminas;

import java.util.ArrayList;
import java.util.List;

import lt.itakademija.exam.Account;
import lt.itakademija.exam.AccountCreateException;
import lt.itakademija.exam.Bank;
import lt.itakademija.exam.Currency;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.Customer;
import lt.itakademija.exam.CustomerCreateException;
import lt.itakademija.exam.InsufficientFundsException;
import lt.itakademija.exam.Money;
import lt.itakademija.exam.Operation;
import lt.itakademija.exam.PersonCode;
import lt.itakademija.exam.PersonName;
import lt.itakademija.exam.SequenceGenerator;

public class BankImpl implements Bank{

    private final CurrencyConverter currencyConverter;
    private SequenceGenerator customerSequence = new SequenceGenerator();
    private SequenceGenerator accountSequence = new SequenceGenerator();
    private SequenceGenerator operationSequence = new SequenceGenerator();
    private final List<Customer> customers;


    public BankImpl(CurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
        this.customers = new ArrayList<>();
    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {
        if(customer == null || currency == null) {
            throw new NullPointerException();
        }
        if(!customers.contains(customer)) {
            throw new AccountCreateException("Customer does not exits.");
        }
        Account account = new Account(accountSequence.getNext(), customer, currency, new Money(0.0));
        customer.addAccount(account);
        return account;
    }

    @Override
    public Customer createCustomer(PersonCode personCode, PersonName personName) {
        if(personCode == null || personName == null) {
            throw new NullPointerException();
        }
        for(Customer customer : customers) {
            if(customer.getPersonCode().equals(personCode)) {
                throw new CustomerCreateException("Customer already exists...");
            }
        }
        Customer customer = new Customer(customerSequence.getNext(), personCode, personName);
        customers.add(customer);
        return customer;
    }

    @Override
    public Money getBalance(Currency currency) {
        Money balance = new Money(0.0d);
        for(Customer customer: customers) {
            for(Account account: customer.getAccounts()) {
                if(account.getCurrency().equals(currency)) {
                    balance = balance.add(account.getBalance());
                } else {
                    balance = balance.add(currencyConverter.convert(account.getCurrency(), currency, account.getBalance()));
                }
            }
        }
        return balance;
    }

    @Override
    public Operation transferMoney(Account debitAccount, Account creditAccount, Money debitAmount) {
        if(debitAccount.getBalance().isLessThan(debitAmount)) {
            throw new InsufficientFundsException("Not enough funds");
        }
        debitAccount.setBalance(debitAccount.getBalance().substract(debitAmount));
        final Money creditAmount = currencyConverter.convert(debitAccount.getCurrency(),
                creditAccount.getCurrency(), debitAmount);
        creditAccount.setBalance(creditAccount.getBalance().add(creditAmount));
        return new Operation(operationSequence.getNext(), debitAccount, creditAccount, debitAmount);
    }

}