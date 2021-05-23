import java.util.Scanner;

public class HollowFullPyramid {
    public static void main(String[] args) {
        System.out.print("Enter number for pattern = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num + i; j++) {
                if (j == num - i || j==num+i || i==num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
