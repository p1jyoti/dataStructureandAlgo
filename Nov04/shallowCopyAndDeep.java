import java.util.Arrays;

public class shallowCopyAndDeep {
    public static void main(String[] args) {

        int x = 4; // 4 byte

        int[] arr = { 1, 2, 3, 4, 5 }; // 20 byte contiguous memory
        System.out.println(arr[0]);

        // int[] a = arr; // a is shallow of arr

        // a[0] = 1000;
        // System.out.println(a[0]);
        // can change and change orginal array

        /* DEEP COPY - doesn't change original copy */

        int[] deepCopy = Arrays.copyOf(arr, arr.length);
        deepCopy[0] = 100;

        System.out.println(deepCopy[0]);
        System.out.println(arr[0]);

    }

}
