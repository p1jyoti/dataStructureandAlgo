
public class maxOfThreeBuiltIn {
    public static void main(String[] args) {
        int x = 22;
        int y = 13;
        int z = 90;
        int a = 99;

        System.out.println(Math.max((Math.max(x, y)), z)); // max of 3

        System.out.println(Math.max(Math.max((Math.max(x, z)), y), a)); // max of 4

        

    }
}
