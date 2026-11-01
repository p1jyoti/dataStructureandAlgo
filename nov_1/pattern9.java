/*
1
AB
123
ABCD
*/

public class pattern9 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%2==0) { // i because the pattern is depended on i not j
                    System.out.print(" " + (char)(j+64));
                } else{
                    System.out.print(" " +j);
                }
            }
            System.out.println();
        }
    }
}
