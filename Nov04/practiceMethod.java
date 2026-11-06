public class practiceMethod {
    public static void main(String[] args) {

        int[] arr = { 2, 34, 6, 27, 4, 1 };
        print(arr);

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                System.out.println(arr[i] + " " + arr[i] * 2);
            } else {
                System.out.println(arr[i] + " " + (arr[i] + 10));
            }
        }

    }
}
