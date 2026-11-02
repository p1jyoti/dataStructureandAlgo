// Solvingwith maths 

/*
Patter 
****
***
**
*
*/

public class pattern2 {
    public static void main(String[] args) {

        int n = 4;
        int a = n; // number of starts to be printed in each line

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= a; j++) {
                System.out.print(" *");
            }
            a -= 1;
            System.out.println();
        }
    }
}
