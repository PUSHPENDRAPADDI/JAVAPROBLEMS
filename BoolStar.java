import java.util.Scanner;
public class BoolStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num = ");
        int num = sc.nextInt();
        System.out.println("Hit any key or Enter ");
        boolean ch = sc.nextBoolean();
        if (ch == true) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else{
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num-i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
