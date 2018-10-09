package lt.vtvpmc.ems.akademijait.jonas;

public class BankAccount {

    protected String number;
    protected double balance;

    //konstruktorius
    public BankAccount(String number){
        this.number = number;
    }



    public void credit(double amount) {
        if(amount > 0){
            this.balance += amount;
        }

    }

    public void debit(double amount) {
        if(this.balance - amount >= 0){
            this.balance -= amount;
        }



    }

    public double getBalance(){
        return this.balance;
    }

    public String getNumber(){
        return this.number;
    }
}
