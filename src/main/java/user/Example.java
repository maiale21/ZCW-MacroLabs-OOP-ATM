package user;

import java.util.Scanner;

public class Example {
}

class ConsoleInput {
    private String message;
    ConsoleInput(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}

class Console {
    public void sendMessage(ConsoleInput input) {
        System.out.println(input.getMessage());
    }
    public ConsoleInput getMessage(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        return new ConsoleInput(message);
    }
}
