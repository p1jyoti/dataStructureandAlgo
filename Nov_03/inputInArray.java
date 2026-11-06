import java.util.Scanner;

public class inputInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            // int x = sc.nextInt();
            // arr[i] = x;

            arr[i] = sc.nextInt();
        }

        // printing the array elements

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
