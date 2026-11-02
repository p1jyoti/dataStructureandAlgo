public class permutation {

    public static int fact(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 12;
        int r = 5;

        int nfact = fact(n);
        int rfact = fact(r);

        int nrfact = fact(n - r);

        int nCr = nfact / (rfact * nrfact);
        int nPr = nfact / nrfact;

        System.out.println(nCr);
        System.out.println(nPr);

    }
}

/*
 * nCr = n!/r!(n-r)!
 * nPr = n!/(r-n)!
 */