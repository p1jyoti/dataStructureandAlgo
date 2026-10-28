import java.util.Scanner;

public class profitandLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Cost price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter the Selling price: ");
        double sp = sc.nextDouble();

        double p = sp - cp;

        if (sp == cp) {
            System.out.println("No Profit and Loss");
        } else if (sp > cp) {
            System.out.println("Your have a profit" + p);
        } else {
            System.out.println("Loss : " + p);
        }

    }
}
