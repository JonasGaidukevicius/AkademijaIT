package lt.vtvpmc.oopbank;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditBankAccountTest {

    @Test
    public void shouldHaveBankAccountNumber() {
        CreditBankAccount creditBankAccount = new CreditBankAccount("LT1");

        assertEquals("LT1", creditBankAccount.getNumber());
    }

    @Test
    public void shouldAllowDepositing() {
        CreditBankAccount creditBankAccount = new CreditBankAccount("");
        
        creditBankAccount.credit(100.0);
        
        assertEquals(100.0, creditBankAccount.getBalance(), 0.01);
    }
    
    @Test
    public void shouldNotAllowCreditingNegativeAmount() {
        CreditBankAccount creditBankAccount = new CreditBankAccount("");
        
        creditBankAccount.credit(-10.0);
        
        assertEquals(0.0, creditBankAccount.getBalance(), 0.01);
    }
    
    @Test
    public void shouldAllowDebitingAnAccount() {
        CreditBankAccount creditBankAccount = new CreditBankAccount("");
        
        creditBankAccount.credit(10.0);
        creditBankAccount.debit(2.0);
        
        assertEquals(8.0, creditBankAccount.getBalance(), 0.01);
    }
    
    @Test
    public void shouldAllowSettingCreditLimit() {
        CreditBankAccount creditBankAccount = new CreditBankAccount(
                "", 
                100.0
        );
        
        creditBankAccount.debit(60.0);
        
        assertEquals(-60.0, creditBankAccount.getBalance(), 0.01);
    }
    
    @Test
    public void shouldAllowWithdrawingUpToCreditLimit() {
        CreditBankAccount creditBankAccount = new CreditBankAccount(
                "",
                10.0
        );
        
        creditBankAccount.debit(11.0);
        
        assertEquals(0.0, creditBankAccount.getBalance(), 0.01);
    }

}
