public class May24ForQuestion {
    public static void main(String[] args) {
        for (int i = 100; i < 200; i++) {
            if (i % 13 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("-------");

        for (int i = 200; i < 400; i++) {
            if (i % 16 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
