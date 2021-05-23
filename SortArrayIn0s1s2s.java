import java.util.Arrays;

public class SortArrayIn0s1s2s {
    public static void main(String[] args) {
        int num[] = { 0, 1, 2, 0, 1, 0, 1, 2, 1, 0, 2 };
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ",");
        }
    }
}
