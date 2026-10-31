public class sumOfEvenDigit {
    public static void main(String[] args) {

        int n = 98909;
        int sum = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0) {
                System.out.println("Inside condition Last Digit "+ lastDigit);
                sum = sum + lastDigit;
                System.out.println("Sum of Digit " + sum);
            }
            n /= 10;
        }

        System.out.println(sum);
    }
}
