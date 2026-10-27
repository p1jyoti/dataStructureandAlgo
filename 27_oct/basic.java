
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

        int x = 5;
        System.out.println(x + 9);

        int y; // declaration
        y = 40; // initialization
        System.out.println(y);

        y = 90; // re-initilization
        System.out.println(y);

        y = y * 2;
        System.out.println(y);

        // input from the user

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.err.println(num);

        // square of a number

        System.out.print("Enter a num : ");
        int num2 = sc.nextInt();
        int square = num2 * num2;

        System.out.print("Your Square is: ");
        System.out.println(square);

        // sum of three number
        System.out.print("Enter a num : ");
        int n1 = sc.nextInt();

        System.out.print("Enter a num : ");
        int n2 = sc.nextInt();

        System.out.print("Enter a num : ");
        int n3 = sc.nextInt();

        System.out.println("Result: " + (n1 + n2 + n3));

        // Simple interest
        double principle = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double simpleInterest = (principle * rate * time) / 100;
        System.out.println("Your Interest will be : " + simpleInterest);


        
    }
}
