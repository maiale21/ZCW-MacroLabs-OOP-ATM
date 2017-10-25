package inputoutput;

import user.UserFactory;
import user.UserInput;

public class Display {

    public void start() {
        String userInput = UserInput.getString("Welcome, are you a new user? (type Yes or No)");
        if ("Yes".equals(userInput)) {
            System.out.println("Let's get you added\n");
            UserFactory.createNewUser();
        } else if ("No".equals(userInput)) {
            System.out.println("Please Login");
        }


        System.out.println("How would you like to proceed dipshit?");
        String accountOptions = "Withdraw\n2: Deposit\n3: View Balance\n4: Transfer\n5: Create Account\n6: You Suck";
        int Input = UserInput.getInteger(accountOptions);

        switch (Input) {
            case 1:
                System.out.println("Withdraw");
                break;

            case 2:
                System.out.println("Deposit");
                break;

            case 3:
                System.out.println("Balance");
                break;

            case 4:
                System.out.println("4: Transfer");
                break;

            case 5:
                System.out.println("5: Create Account");
                break;
            default:

                System.out.println("You still suck");
                break;
        }

    }

}
