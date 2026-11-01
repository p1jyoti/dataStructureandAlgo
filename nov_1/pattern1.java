
/*
    Pattern 1: 
    Here m and n are seperate

    ****
    ****
    ****
*/

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Rows and Columns : ");
        int m = sc.nextInt();
        int n = sc.nextInt();


        for (int i = 1; i <=m ; i++) {
            
            for (int j = 1; j <= n; j++) {
                    System.out.print( " *");
            }
            System.out.println();
        }




        
    }
}
