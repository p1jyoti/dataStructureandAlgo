
/*

Array is a linear Data Structure

*/

public class arrayBasic {
    public static void main(String[] args) {
        System.out.println("Arrays");

        int[] arr = { 1, 2, 3, 4, 5, 7 };
        // System.out.println(arr); //

        // Indexing

        System.out.println(arr[0]);
        System.out.println(arr[3]);

        // updating Elements : mutuable
        arr[3] = 89;
        System.out.println(arr[3]);

        /* METHOD 2 */

        int[] arr2 = new int[4]; // can put 4 elements

        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

    }
}