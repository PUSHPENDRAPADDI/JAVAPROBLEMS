public class ProductMatrics {
    public static void main(String[] args) {
        int mat1[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };
        int pro = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                pro = pro * mat1[i][j];
            }
        }
        System.out.print(pro);
    }
}

