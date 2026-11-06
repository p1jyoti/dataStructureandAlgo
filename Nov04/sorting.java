import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {

        // sort - ascending order

        int[] arr = { 6, 2, 1, 6, 8, 9, -3 };

        print(arr);

        Arrays.sort(arr);

        print(arr);

    }

    public static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
