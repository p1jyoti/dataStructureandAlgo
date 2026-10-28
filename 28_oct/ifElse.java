import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        // WAP to find even and odd

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // take a postivite integer input and tell if it is divisible by 5 or not

        if (n % 5 == 0) {
            System.out.println("It is divisible by 5 ");
        } else {
            System.out.println("It is not divisible by 5 ");
        }

        // print the absolute number [Method 1]

        if (n > 0) {
            System.out.println(n);
        } else {
            System.out.println(-n);
        }

        // [Method 2]

        if (n < 0)
            n = -n;
        System.out.println(n);

        // Take a real number input and check if it is an integer or n ot

        double x = sc.nextDouble();
        double num = (int) x;

        if (x == (int) x)
            System.out.println("Its a real number");

        // if(x-num > 0)System.out.println("Its a not real number");


    }
}