public class primeNumber {
    public static void main(String[] args) {
        // System.out.println("Prime numbers");
        // numbers that has only 2 factors 1 and itself

        // 7 : 1,7

        int n = 8;
        boolean flag = false; // prime Number

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                // System.out.println("Composite Number");
                break;
            }
        }

        // System.out.println("Prime Number");

        if (n == 1) {
            System.out.println("Neither Prime nor Composite");

        } else {

            if (flag == false) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Composite Number");
            }

        }
    }
}
