public class LargestSumContiguous {
    public static void main(String[] args) {
        int[] num = { -32, -13, 114, -1, -2, 1, 5, -3 };
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 < j; j2++) {
                    sum += num[j2];
                }
                if (sum > max_sum) {
                    max_sum = sum;
                }
            }
        }
        System.out.println("Maximum contiguous sum is " + max_sum);
    }
}