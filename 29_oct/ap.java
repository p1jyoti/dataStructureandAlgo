
public class ap {
    public static void main(String[] args) {

        // display ap - 2,5,8,11 upto 'n' terms

        // a = a+(n-1)d
        // s = n/2( 2a + (n-1)d )

        int n = 10;

        for (int i = 2; i <= 3 * (n - 1); i += 3) {
            System.out.println(i);
        }

        int a = 2;
        int d = 3;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a += d;
        }

        

    }
}
