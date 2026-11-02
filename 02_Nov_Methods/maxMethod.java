public class maxMethod {

    public static void maxOfThreeNum(int a, int b, int c) {
        // System.out.println(Math.max((Math.max(a, b)), c));

        if (a > b && a > c)
            System.out.println(a);
        else if (b > a && b > c)
            System.out.println(b);
        else
            System.out.println(c);

    }

    public static void main(String[] args) {
        maxOfThreeNum(2, 3, 4);
    }
}
