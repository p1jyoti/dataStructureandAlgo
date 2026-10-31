public class ap {
    public static void main(String[] args) {
        // AP : 4,7,10,13,16

        int n = 5;
        int a = 4;
        int d = 3;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a+=d;
        }


        // Formula based

        for (int i = 4; i <= 3*n+1; i+=3) {
            System.out.println(i);
        }
    }
}
