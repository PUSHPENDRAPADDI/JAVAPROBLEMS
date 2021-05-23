public class NumSmallerThanCurrent {
    public static void main(String[] args) {
        int[] num = { 8, 1, 2, 2, 3 };
        int[] res = new int[num.length];
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            int min = num[i];
            for (int j = 0; j < num.length; j++) {
                if (num[j] < min) {
                    count++;
                }
            }
            res[i] = count;
            count = 0;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ",");
        }
    }
}
