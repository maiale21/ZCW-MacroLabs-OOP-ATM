package accounts;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void withdrawTest(){

        Account test = new Account();
        test.setBalance(1000);
        double withdrawal = 500;
        double expected = 500;

        test.withdraw(withdrawal);
        double actual = test.getBalance();

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void depositTest(){

        Account test = new Account();
        test.setBalance(2000);
        double deposit = 700;
        double expected = 2700;

        test.deposit(deposit);
        double actual = test.getBalance();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void checkBalanceTest(){

        
    }
}
