public class SubArrayWithSum0 {
    public static void main(String[] args) {
        int[] num = { 4, 1, 2, -3, 5 };
        int flag = 0;
        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            for (int j = i; j < num.length; j++) {
                sum += num[j];
                if (sum == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                break;
            }

        }
        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
