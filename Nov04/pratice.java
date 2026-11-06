public class pratice {
    public static void main(String[] args) {

        /* Multiply the odd indexed by 2 and 10 to even index */

        int[] arr = { 2, 34, 6, 27, 4, 1 };

        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);

            if (i % 2 == 0) {
                System.out.println(arr[i] + " " + arr[i] * 2);
            } else {
                System.out.println(arr[i] + " " + (arr[i] + 10));
            }
        }
    }
}
