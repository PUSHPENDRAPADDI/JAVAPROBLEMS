public class GoodPairs {
    public static void main(String[] args) {
        int[] num = { 1,1, 1, 1 };
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (i < j && num[i] == num[j]) {
                    count++;
                    System.out.println(i + "," + j);
                }
            }
        }
        System.out.println(count);
    }
}
