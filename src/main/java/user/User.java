package user;

import accounts.Account;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
   private ArrayList<Account> account;


    public User(String username, String password/*,ArrayList account**/) {
        this.username = username;
        this.password = password;
        //this.account = account;
    }


  /* public ArrayList<Account> getAccount() {
            return account;
        }


    public void setAccount(ArrayList<Account> account) {
            this.account = account;
        }**/


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }



}
