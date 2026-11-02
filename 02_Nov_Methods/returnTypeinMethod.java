public class returnTypeinMethod {

    public static int num() {
        return 4;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int isGreater(int a) {
        System.out.println("Hello");
        if (a > 0)
            return 5;
        else
            return 10;
    }

    public static void main(String[] args) {
        int a = num();
        System.out.println(a);

        int sum1 = sum(5, 9);
        System.out.println(sum1);

        num(); // standalone call [no return]

        System.out.println(4 + num()); // the function is also int datatype; we can use it for holding a value

        int x = isGreater(7);
        System.out.println(4 + x);

    }
}
