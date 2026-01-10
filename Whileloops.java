import java.util.Scanner;

public class Whileloops {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num = scanner.nextInt();
        
        System.out.println("Using while loop");
        int i = 0;
        while(i <= num ){
            System.out.println(i);
            i++;
        }

        System.out.println("\nUsing while loop reverse:");
        int j = num;
        while(j >= 0){
            System.out.println(j);
            j--;
        }


    }
    
}
