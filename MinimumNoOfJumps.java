public class MinimumNoOfJumps {
    public static void main(String[] args) {
        int[] num = { 1, 4, 3, 2, 6, 7 };
        int jumps = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                i = i + num[i];
                jumps = i;
            }
        }
        System.out.println(jumps);
    }
}