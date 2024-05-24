public class May24ForQuestion {
    public static void main(String[] args) {

        int rest1 = 50 % 9;

        for (int h = 50 + (9 - rest1) + 4; h < 100; h = h + 9) {
            System.out.print(h + ", ");
            System.out.print(h - 4 + " + 4, ");
            System.out.print((h - 4) / 9 + " * 9 + 4, ");
            System.out.println();
        }

        System.out.println();
        System.out.println("-------");

        int rest = 100 % 13;

        for (int h = 100 + (13 - rest); h < 200; h = h + 13) {
            System.out.print(h + " ");
        }

        System.out.println();
        System.out.println("-------");

        System.out.println(rest);

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
