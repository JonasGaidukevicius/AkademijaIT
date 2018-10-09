package lt.vtvpmc.oopbank;


public class CreditBankAccount extends BankAccount {
    
    private double creditLimit;
    
    public CreditBankAccount(String number) {
        super(number);
    }
    
    public CreditBankAccount(String number, double creditLimit) {
        super(number);
        this.creditLimit = creditLimit;
    }

    @Override
    public void debit(double amount) {
        if (this.balance + this.creditLimit - amount >= 0) {
            this.balance -= amount;    
        }
    }

}
