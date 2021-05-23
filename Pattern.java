import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int sen = sc.nextInt();
        for (int i = 0; i < sen; i++) {
            for (int j = 0; j < sen; j++) {
                if (i == 0 || i == sen - 1) {
                    System.out.print(sen+" ");
                } else if (j == 0 || j == sen - 1) {
                    System.out.print(sen+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
