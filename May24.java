public class May24 {
    public static void main(String[] args) {
        for (int k = 1; k <= 9; k++) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("------");

        for (int k = 1; k <= 9; k++) {
            System.out.print(4 * k + " ");
        }
        System.out.println();
        System.out.println("------");

        for (int k = 1; k <= 9; k++) {
            System.out.print(9 * k + " ");
        }
        System.out.println();
        System.out.println("------");

        int m;
        m = 1;
        for (int k = 1; k <= 9; k++) {
            System.out.print(m * k + " ");
        }
        System.out.println();
        System.out.println("------");

        m = 4;
        for (int k = 1; k <= 9; k++) {
            System.out.print(m * k + " ");
        }
        System.out.println();
        System.out.println("------");

        m = 9;
        for (int k = 1; k <= 9; k++) {
            System.out.print(m * k + " ");
        }
        System.out.println();
        System.out.println("------");

        int n = 1;
        while (n < 4) {
            for (int k = 1; k <= 9; k++) {
                System.out.print(n * k + " ");
            }
            System.out.println();
            n++;
        }
    }
}
