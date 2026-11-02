public class pattern3 {
    public static void main(String[] args) {
        // Star Plus
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (n/2+1 == i || n/2+1 == j) {
                    System.out.print(" *");
                }else{
                    System.out.print(" #");
                }

            }
            System.out.println();
        }
    }
}
