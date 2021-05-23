public class MoreThanNk {
    public static void main(String[] args) {
        int[] num = { 3, 1, 2, 2, 1, 2, 3, 3 };
        int k = 4, count = 0, lim = num.length / k;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                }
            }
            if (count > lim) {
                System.out.println(num[i]);
            }
            count = 0;
        }
    }
}
