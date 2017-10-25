package accounts;

public class Account {

   // public static int accountCounter;

    private double balance;
    private String type;
    private int accountNumber;

    public Account(){

    }

    public Account(double balance, String type, int accountNumber){
        this.balance = balance;
        this.type = type;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public void withdraw(double withdrawAmount){

        this.balance -= withdrawAmount;
    }

    public void deposit(double depositAmount){

        this.balance += depositAmount;
    }

    /*public double checkBalance(){

        return
    }**/
}
