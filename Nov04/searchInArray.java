public class searchInArray {
    public static void main(String[] args) {
        int x = 0;
        int[] arr = { 1, 2, 5, 6, 7, 3 };
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }

        if (flag == true) {
            System.out.println("Found");
        } else {
            System.out.println(" Not Found");
        }
    }
}
