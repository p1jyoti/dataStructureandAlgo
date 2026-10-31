public class continueStatement {
    
    public static void main(String[] args) {

        // skip the iteration in a loop

        // for (int i = 1; i <= 100; i++) {
        // if (i == 18 || i == 14) {
        // continue;
        // }
        // if (i % 2 == 0 || i % 3 == 0) {

        // System.out.println(i);
        // }

        // }

        // Dont print odd

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.err.println(i);
        }
    }
}
