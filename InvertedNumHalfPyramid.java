import java.util.Scanner;

public class InvertedNumHalfPyramid {
    public static void main(String[] args) {
        System.out.print("Enter number for pattern = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                if (j >= i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
