import java.util.Scanner;

public class fourDigit {
    public static void main(String[] args) {

        // Tell if a number is 4 digit or not

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 999 && n < 10000) {
            System.out.println("Its a 4 digit number");
        } else {
            System.out.println("Not a 4 digit number");
        }

    }
}
