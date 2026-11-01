/*
1
0 1
1 0 1 
0 1 0 1 
1 0 1 0 1 

*/

/* public class pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // i is odd
                if (i % 2 == 1) {
                    // j is odd then print 1
                    if (j % 2 == 1) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
                // i is even
                else {
                    if (j % 2 == 0) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}

*/

//  more compact and efficient

public class pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                // if ((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0))

                if ((i + j) % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");

            }
            System.out.println();
        }
    }
}
