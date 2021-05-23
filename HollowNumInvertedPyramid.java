import java.util.Scanner;

public class HollowNumInvertedPyramid {
    public static void main(String[] args) {
        System.out.print("Enter number for pattern = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num + i; j++) {
                if (j == i || j == num || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
