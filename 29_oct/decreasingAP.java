
public class decreasingAP {
    public static void main(String[] args) {
        // print this series 99,95,91 .. upto alll terms which are positive
        /*
         * 99 , 95 , 91
         * a = 99
         * d = 4
         * 99 , 95 , 91 , 87 , 83 ... upto 1 /0
         * methods 2 using formula or extra variable
         * Formula is best for unknown squnece
         * Variable for known seqence
         * 
         */

        int a = 99;
        int d = 4;
        for (int i = a; i >= 1; i -= 4) {

            System.out.println(a);
            a -= d;

        }

        
    }
}
