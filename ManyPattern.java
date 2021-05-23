import java.util.Scanner;

public class ManyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter number of rows = ");
        int num = sc.nextInt();
        System.out.println("Enter any number for pattern = ");
        int ch = sc.nextInt();
        if (ch == 1) {
            for (int i = 0; i < num + 1; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (ch == 2) {
            for (int i = 0; i < num + 1; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < num + 1; i++) {
                for (int j = 0; j < num - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < num + 1; i++) {
                for (int j = 0; j < num-i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }}finally{
            sc.close();
        }
    }
}
