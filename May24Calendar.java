public class May24Calendar {
    public static void main(String[] args) {
        // May 1st is 水曜日
        String[] days = { "火", "水", "木", "金", "土", "日", "月" };
        int today = 5;
        System.out.println(days[today % 7] + "曜日");

        System.out.println("------------");

        // Jan 1st is 月曜日

        String[] days1 = { "日", "月", "火", "水", "木", "金", "土" };
        int[] m = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // 三月四日
        int month = 3;
        int date = 4;

        int today1 = 0;
        for (int a = 0; a < month; a++) {
            today1 = today1 + m[a];
        }
        today1 = today1 + date;
        System.out.println(days1[today1 % 7] + "曜日");
    }
}
