import java.util.Scanner;

public class AlphTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Num = ");
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("A ");
                }
                System.out.println();
            }
        } finally {
            sc.close();
        }
    }
}
