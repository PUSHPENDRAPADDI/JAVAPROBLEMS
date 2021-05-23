import java.util.Scanner;
public class FullNumPyramid {
    public static void main(String[] args) {
        System.out.println("Enter number for pattern = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num+i-1; j++) {
                if (j>=num-i) {
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
