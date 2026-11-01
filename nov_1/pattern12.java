/*
1
13
135
1357                                                                                    
*/

public class pattern12 {
    public static void main(String[] args) {
        int n = 4;

        int d = 2;
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + a);
                a += d;
                // System.out.print(" " + ((2*j)-1));
            }
            System.out.println();
        }
    }
}
