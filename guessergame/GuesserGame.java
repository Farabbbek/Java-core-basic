package guessergame;

import java.util.Scanner;

public class GuesserGame {

    public static void main(String[] args) {
        // Write your code here 💖
        String art = """
         ,-.
         .:\\ '`-.
        |:|  __ b
         `;-(
        ,'  |
        ( \\|||_
        ,-----(.-''--``-------.
        /_______`'______________\\
        /                      SSt\\
        """;
        System.out.println("Welcome to the Word Guesser Game!");
        System.out.println(art);
        System.out.println("\nYou have 5 attempts remaining to guess the secret word: _ _ _ _");
        String word = "java";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int attempt = 5;
            while (attempt > 0) {
                String secret = scanner.nextLine();

                if (secret.equalsIgnoreCase(word)) {
                    System.out.println("Correct! Press [p] to play again!");
                    break;
                }

                if (attempt == 1) {
                    System.out.println("Game over) Press [p] to play again!");
                    break;
                }

                attempt--;
                System.out.println("You have " + attempt + " attempts remaining to guess the secret word: _ _ _ _");
            }

            String again = scanner.nextLine();
              if (again.equalsIgnoreCase("p")) {
                System.out.println(art);
                System.out.println("\nYou have 5 attempts remaining to guess the secret word: _ _ _ _");
            } else {
                System.out.println("Thank you for playing!");
                break;
            }
        }

    }
}
