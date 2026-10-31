public class primeNumberUsingFunction {
    public static void main(String[] args) {
        int n = 97;
        boolean flag = false; // prime Number

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (flag == false) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Composite Number");
        }

    }
}
