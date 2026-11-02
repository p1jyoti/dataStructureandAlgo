public class swap2Numbers {

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 8;
        System.out.println(x + " " + y);

        swap(x, y);

    }
}
