import java.util.Scanner;

public class SolidDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number for pattern = ");
            int num = sc.nextInt();
            for (int i = 0; i <= num; i++) {
                for (int j = 0; j <= num + i; j++) {
                    if (j >= num - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i <= num; i++) {
                for (int j = 0; j <= 2 * num - i; j++) {
                    if (j >= i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } finally {
            sc.close();
        }
    }
}
