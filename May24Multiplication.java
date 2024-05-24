public class May24Multiplication {
    public static void main(String[] args) {
        int n;
        for (int t = 1; (n = 9 * t) < 100; t++) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int j = 9 * 1; j < 100; j += 9) {
            System.out.print(j + " ");
        }
    }

}
