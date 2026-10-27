
public class charData {
    public static void main(String[] args) {

        char ch = 'A';
        System.out.println(ch);


        // all charcters are stored in a ASCII values
        // where a = 97 ; A = 65

        int x = ch; // implicit typecasting
        System.out.println(x);

        char seven = '7'; // the integer is stored as a char
        System.out.println(seven);


        int y = (int)ch; // explicit typecasting
        System.out.println(y);

        int ch2 = '3';
        System.out.println((int)ch2);

        // integer to char

        int r = 69;
        char ch4 = (char)r;
        System.out.println(ch4);

        // relational

        System.out.println(5<3);
        System.out.println(5>3);
        System.out.println(5>=3);
        System.out.println(5<=3);
        System.out.println(5==3);


        boolean bool = true;
        System.out.println(bool);

    }
}
