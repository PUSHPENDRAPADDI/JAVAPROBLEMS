public class AddTwoMatrics {
    public static void main(String[] args) {
        int mat1[][] = {{1,1,1,1},
                        {2,2,2,2},
                        {3,3,3,3},
                        {4,4,4,4}};
        int mat2[][] = {{1,1,1,1},
                        {2,2,2,2},
                        {3,3,3,3},
                        {4,4,4,4}};
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                System.out.print(mat1[i][j] + mat2[i][j]);
            }
            System.out.println();
        }

    }   
}
