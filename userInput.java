import java.util.Scanner;

public class userInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.print("\nEnter you age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        System.out.print("\nEnter your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your GPA is " + gpa);

        System.out.print("\nAre you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Student status: " + isStudent);
        
        scanner.close();

    }
}
