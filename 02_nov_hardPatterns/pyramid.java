// own method
public class pyramid {
    public static void main(String[] args) {

       

        /*Method 1 */

        /*
        int m = 4;
        int n = 7;
        for (int i = 1; i <= m; i++) {

            for (int j = 1; j<=n; j++) {
                System.out.print("#");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
            */

        /*METHOD 2 */

        int n = 4;

        for (int i = 1; i <= n; i++) {
         

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
         
            }
            for (int l = 1; l <=i-1; l++) {
                System.out.print("*");
            }
            

            System.out.println();
        }

        
    }
}
