public class May24Calendar {
    public static void main(String[] args) {
        // May 1st is 水曜日
        String[] days = { "火", "水", "木", "金", "土", "日", "月" };
        int today = 5;
        System.out.println(days[today % 7] + "曜日");
    }
}

