public class otherArrayDataType {
    public static void main(String[] args) {

        char[] arr = { 'a', 'b', 'c' };
        System.out.println(arr[0]);

        char ch = '\0'; // zero ascii value =>
        System.out.println((int) ch);

        int x = 0; // null
        System.out.println((char) x);

        String x1 = "Ram is a good Boy";
        System.out.println(x1);

        String[] x2 = { "Isha", "Nisha", "Disha" };
        // System.out.println(x2);

        // Iterating through an array of String
        for (int i = 0; i < x2.length; i++) {
            System.out.println(x2[i]);
        }

        double[] d = { 34.32, 234.34, 24.2, 0.4 };
        System.out.println(d[9]);
    }
}
