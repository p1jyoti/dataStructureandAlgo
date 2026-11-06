
public class loopInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 67 };

        System.out.println("Size of Array " + arr.length);
        for (int i = 0; i <= 5; i++) {
            System.out.print(arr[i] + " ");
        }
        // int i = 0;
        // while (i <= 5) {
        // System.out.print(arr[i] + " ");
        // i++;
        // }
        System.out.println();

        int n = arr.length; // index 0 to n-1
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        int[] arr2 = new int[7]; // default is 0

        for (int i = 0; i < 7; i++) {
            System.out.println(arr2[i]);
        }

        // double of each element
        int[] arr3 = { 2, 3, 46, 7 }; // default is 0

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(2 * arr3[i]);
        }

    }
}
