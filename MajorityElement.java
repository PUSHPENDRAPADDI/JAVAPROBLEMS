import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int num[] = { 7, 2, 7, 3, 7, 2, 7, 7 };
        int count = 0;
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            if (num[i] == num[num.length - 1]) {
                count++;
            }
        }
        if (count > num.length / 2) {
            System.out.println(num[num.length / 2] + " is major element");
        } else {
            System.out.println("Not major element");
        }
    }
}
