package encapsulation;

import encapsulation.utils.InputHelper;

public class Main {
    public static void main(String[] args) {
        String input = InputHelper.getInput("Enter something: ");
        System.out.println("You entered: " + input);
        input = InputHelper.getInput("Enter something else: ");
        System.out.println("You entered: " + input);
    }
}
