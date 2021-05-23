public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] num = { 1, 1,2,2};
        int n = num.length/2;
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + "," + num[n + i] + ",");
        }
    }
}
