/*
AAAA
BBBB
CCCC
DDDD

*/
public class pattern6 {
    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        // For Char Numbers
        for (int i = 65; i <= 65+m ; i++) {
            for (int j = 65; j <=65+ n; j++) {
                System.out.print(" " +(char)i);
            }
            System.out.println();
        }
    }
    
}
