public class passingArrayThroughMethod {

    public static void change(int[] x) { // reference variable 
        
        x[1] = 80;
    }

    public static void main(String[] args) {

        int[] x = { 8, 8, 9, 0, 6 };
        System.out.println(x[1]);

        // int x = 10;
        change(x);

        System.out.println(x[1]);
    }
}
