public class TriDiagonal {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i - j == 0 || i - j == 1 || i - j == -1) {
                    System.out.print(j + 1 + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
