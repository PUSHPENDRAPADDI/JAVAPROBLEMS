public class Monotonic {
    public static void main(String[] args) {
        int mat1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, flag = 0;
        if (mat1[0] < mat1[1]) {
            for (int i = 0; i < (mat1.length) - 1; i++) {
                if (mat1[i] < mat1[i + 1]) {

                } else {
                    flag = flag + 1;
                }
            }
        } else {
            for (int i = 0; i > (mat1.length) - 1; i++) {
                if (mat1[i] < mat1[i + 1]) {
                } else {
                    flag = flag + 1;
                }
            }
        } 
        if (flag == 0) {
            System.out.print("Array is monotonic");
        } else {
            System.out.println("Array is not monotonic");
        }
    }
}