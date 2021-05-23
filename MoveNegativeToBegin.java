public class MoveNegativeToBegin {

    public static void main(String[] args) {
        int num[] = { -1, -3, 3, -4, 21, 91 };
        int j = 0, temp;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                if (i != j) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ",");
        }
    }
}
