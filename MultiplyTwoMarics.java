public class MultiplyTwoMarics {
    public static void main(String[] args) {
        int mat1[][] = { { 1, 1, 1, 1 },
                         { 2, 2, 2, 2 },
                         { 3, 3, 3, 3 },
                         { 4, 4, 4, 4 } };
        int mat2[][] = { { 1, 1, 1, 1 }, 
                       { 2, 2, 2, 2 }, 
                       { 3, 3, 3, 3 }, 
                       { 4, 4, 4, 4 } };
        int res[][] = new int[4][4];
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                res[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}
