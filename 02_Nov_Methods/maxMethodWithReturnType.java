public class maxMethodWithReturnType {
    
    public static int maxOfTwo(int a, int b) {
        if (a > b)
            return a;
        else
            return b;

    }

    public static void main(String[] args) {
        int max1 = maxOfTwo(2, 3);
        System.out.println(max1);
    }
}
