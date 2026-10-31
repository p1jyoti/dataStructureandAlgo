public class sumOfDigit {
    public static void main(String[] args) {
        // print sum of digit of a given number
        int n = 543;
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            // System.out.println("SUM : " + sum);
            n/=10;
        }

        System.out.println(sum);




    }
}
