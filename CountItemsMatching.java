public class CountItemsMatching {
    public static void main(String[] args) {
        String[] item[] = { { "phone", "silver", "pixel" }, { "computer", "silver", "lenovo" },
                { "phone", "gold", "iphone" } };
        String val = "silver";
        int count = 0;
        for (int i = 0; i < item.length; i++) {
            for (int k = 0; k < item[i].length; k++) {
                if (item[i][k] == val) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
