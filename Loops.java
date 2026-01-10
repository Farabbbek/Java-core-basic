
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num = scanner.nextInt();
        System.out.println("Using for loop:");

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

        System.out.println("\nUsing for loop reverse:");
        for(int i = num; i >= 0;i--){
            System.out.println(i);
        } 

        scanner.close();

    }
}
