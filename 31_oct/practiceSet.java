public class practiceSet {
    public static void main(String[] args) {

        // predict the output
        int x = 1;

        while (x == 1) {
            x = x - 1; // post increment
            System.out.println(x); // 0
        }

        /*
         * int j=10;
         * while (j=10) { // doesnot work cuz its not a condition but can work in c
         * System.out.println(j);
         * j = j + 1;
         * }
         */
        // infinite loop
        
        while ('a' < 'b') {
            System.out.println("Its true");
            break;
        }
    }
}
