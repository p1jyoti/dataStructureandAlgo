
public class pattern8 {
    /*
     * RIGHT ANGLED TRIANGLE / Isosceles
     * Pattern 1
     * 1
     * 12
     * 123
     * 1234
     * 
     * pattern 2
     * A
     * AB
     * ABC
     * ABCD
     */

    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // System.out.print(" " + j); // numbers
                System.out.print(" " + (char) (j + 64)); // alphabet
            }
            System.out.println();

        }

    }

}
