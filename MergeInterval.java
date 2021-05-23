public class MergeInterval {
    public static void main(String[] args) {
        int[] num[] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num[i].length - 1; j++) {
                if (num[i][j + 1] >= num[i + 1][j]) {
                    System.out.println(num[i][j] + "," + num[i + 1][j + 1]);
                    i++;
                    // j++;
                } else {
                    System.out.println(num[i][j]+","+num[i][j+1]);
                }
            }
        }
    }
}
