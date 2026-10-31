public class whileLoop {
    public static void main(String[] args) {

        int  j = 1;
        while (j<=10) {
            System.out.println(j);
            j++;
        }


        int i = 1;
        for(;i<=10;i++ ) // mandatory 3 places
            System.out.println(i);

        // do while loop : run one time irrespective of the condition

        int k=1;

        do { 
            System.out.println(k);
            k++;
        } while (k>2);
    }
}
