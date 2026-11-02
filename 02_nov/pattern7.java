public class pattern7 {
    public static void main(String[] args) {
        // Vertically Flipped Number Triangle

        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; i + j <= n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }
}
