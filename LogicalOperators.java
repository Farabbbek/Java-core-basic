
import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {
        System.out.println("Medical Checkup Center");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter you weight in kg: ");
        Double weight = scanner.nextDouble();
        System.out.print("Enter your height in meters: ");
        Double height = scanner.nextDouble();

        if (weight > 55 && height > 1.70) {
            System.out.println("Congrats! you are healthy.");
        } else {
            System.out.println("You need to improve your health.");
        }

        scanner.close();

    }
}
