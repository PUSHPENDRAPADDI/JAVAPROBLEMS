public class Cumulative{
    public static void main(String[] args) {
        int mat1[] = {1, 2, 3, 4,5,6,7,8,9,10}, sum = 0;
        for (int i = 0; i < mat1.length; i++) {
            sum = sum + mat1[i];
        }
        System.out.print(sum+" ");
    }
}
