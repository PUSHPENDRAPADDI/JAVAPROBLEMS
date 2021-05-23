import java.util.Scanner;

public class CreatMatrics {
    public static void main(String[] args) {
        int mat1[][] = { { 1, 1, 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 4, 4, 4 },
                { 4, 4, 4, 4, 4, 4, 4 } };
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter row ");
            int row = sc.nextInt();
            System.out.println("Enter column ");
            int col = sc.nextInt();
            System.out.println("Enter elements ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat1[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println(" ");
            }
        } finally {
            sc.close();
        }
    }

}
