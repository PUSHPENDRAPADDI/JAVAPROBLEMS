
public class matrix {
    public static void main(String[] args) {
        int num[][] = { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };
        int s1 = 0, s2 = 0;
        for (int i = 0, j = 0; i < num.length; i++, j++) {
            if (i == j) {
                s1 += num[i][j];
            }
        }
        for (int i = 0, j = num.length-1; i < num.length; i++, j--) {
            if (i + j == num.length - 1) {
                s2 += num[i][j];
            }
        }
        System.out.println(Math.abs(s1 - s2));
    }
}