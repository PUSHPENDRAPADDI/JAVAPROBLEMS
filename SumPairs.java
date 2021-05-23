public class SumPairs {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 2, 4, 2, 5, 5, 3, 4 };
        int sum = 5;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if ((num[i] + num[j] == sum)) {
                    System.out.println("The pairs is " + num[i] + "," + num[j]);
                }
            }
        }
    }
}
