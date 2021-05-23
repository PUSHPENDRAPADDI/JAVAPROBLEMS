import java.util.Scanner;
public class GetKthColumn {
    public static void main(String[] args) {
        int mat1[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter column number = ");
        int row = sc.nextInt();
        for (int i = 0; i < 4; i++) {
            if (i == row) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}
