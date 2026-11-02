public class RhombusPattern {
    // Solved in 1st attempt
    public static void main(String[] args) {
        // rhombus pattern
        int n = 4;
        // int a = n;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; i + j <= n; j++) {
                System.out.print("  ");
            }
            // Either two Trianle or Whole Star Square
            // for (int k = 1; k <= i; k++) {
            //     System.out.print(" *");
            // }
            // for (int k = 1; k <= a; k++) {
            //     System.out.print(" *");
            // }
            for (int k = 1; k <= n; k++) {
                System.out.print(" *");
            }
            // a--;
            System.out.println();
        }
    }
}
