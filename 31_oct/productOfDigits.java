public class productOfDigits {
    public static void main(String[] args) {
        // non zero digit

        int n = 543;
        int product = 1;

        while (n != 0) {

            product = product * (n % 10);
            System.out.println("Pro " + product);
            n /= 10;
        }

        System.out.println(product);

    }
}
