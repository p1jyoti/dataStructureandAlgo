public class breakStatement {
    public static void main(String[] args) {
        System.out.println("Break Statement");

        // Write a program to print the highest factor of a number n other than n itself

        // Step 1 : find the factors of n
        int n = 60;

        int highest_factor = 1;

        // [ Not a optimise code]

        // for (int i = 1; i < n; i++) {
        //     if (n % i == 0) {
        //         highest_factor = i;
        //         // System.out.println(i); // i is a factor
        //     }
        // }
        // System.out.println(highest_factor);

        // Method 2 : reverse

        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                highest_factor = i;
                break;

            }
        }

        System.out.println(highest_factor);



    }
}
