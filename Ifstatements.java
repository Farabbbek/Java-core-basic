import java.util.Scanner;

public class Ifstatements {
    public static void main(String[] args){
        System.out.println("Police officer");
        System.out.println("Hello, why are you out walking at night?");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWhat is your age? ");
        int age = scanner.nextInt();

        if(age < 18){
            System.out.println("You are underage, you should be at home!");
        } else {
            System.out.println("You are an adult, you can walk around.");
        }

        System.out.println("\nWhat is your car name? ");
        String carName = scanner.nextLine();
        scanner.nextLine();

        if(carName.equals("TOYOTA")){
            System.out.println("I prefer Toyota cars.");
        } else {
            System.out.println("Nice car!");
        }

        scanner.close();
        
    }
}
