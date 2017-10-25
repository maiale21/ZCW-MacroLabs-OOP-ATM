package user;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static int getInteger(String prompt) {
        return getDouble(prompt).intValue();
    }

    public static Double getDouble(String prompt) {
        System.out.println(prompt);
        Double userInput = scanner.nextDouble();
        return userInput;

    }
}
