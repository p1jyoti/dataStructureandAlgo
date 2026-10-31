public class countDigits {
    public static void main(String[] args) {

        // Write a program to count the number of digit in given number

        int n = 0;

        int count = 0;

        if (n == 0) {
            count++;
        }

        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);

    }
}