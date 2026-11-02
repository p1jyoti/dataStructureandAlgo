public class passByValue {

    public static void change(int x) {
        // here x is seperate variable
        x = 10;
        // System.out.println(x);

    }

    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(x); // pass by Value [i only pass the value not the variable]
        System.out.println(x); // here it prints the main x not change func x

    }
}
