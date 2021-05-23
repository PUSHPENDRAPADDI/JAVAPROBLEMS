public class ConsicutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 3, 10, 4, 20, 24, 2 };
        int count = 1, max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean chk = (arr[i] + 1) == (arr[i + 1]);
            if (chk == true) {
                count = count + 1;
                if (max < count) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}
