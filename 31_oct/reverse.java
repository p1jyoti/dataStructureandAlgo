public class reverse {
    public static void main(String[] args) {

        int n = 457;
        int reverseNum = 0;
        int lastDigit;

        while (n != 0) {
            lastDigit = n % 10;
            System.out.println(lastDigit);
            reverseNum =  reverseNum * 10 + lastDigit; // 70
            System.out.println(reverseNum);

            n /= 10;

        }

        System.out.println(reverseNum);

    }
}
