import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        // numbers from 1 to 100

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // even numbers from 1 to 100

        for (int i = 1; i <= 100; i++) {
            if (i%2==0) {
                System.out.println("Even " + i);
            }else{
                System.out.println(i);
            }
        }

        // Table of 17

        int n = 17;

        for (int i = 1; i < 11; i++) {
            System.out.print(n);
            System.out.print("X");
            System.out.print(i);
            System.out.println(n*i);
        }

        // print all tge odd numbers di visib le by 3 from 1 to 100

        for (int i = 0; i < 101; i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }

        
    }
}
