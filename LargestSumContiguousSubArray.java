public class LargestSumContiguousSubArray {
    public static void main(String[] args) {
        int[] num = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += num[k];
                }
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
