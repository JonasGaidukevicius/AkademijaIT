package lt.vtvpmc.ems.akademijait.jonas;

public class CreditBankAccount extends BankAccount{

    private String number;
    private double balance;
    private double creditLimit;


    //konstruktorius
    public CreditBankAccount(String number){
        super(number);

    }

    public CreditBankAccount(String number, double creditLimit){
        super(number);
        this.creditLimit = creditLimit;
    }



    public void debit(double amount) {
        if(this.balance + this.creditLimit - amount >= 0){
            this.balance -= amount;
        }



    }
}
