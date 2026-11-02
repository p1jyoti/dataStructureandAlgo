public class pattern5 {
    public static void main(String[] args) {

        int n = 8;
        int a = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(" " + a);
                a += 1;
            }
            System.out.println();
        }
    }
}
