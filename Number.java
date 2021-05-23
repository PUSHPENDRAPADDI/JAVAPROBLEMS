import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.print("Enter number for pattern = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(i+1);
        }
        sc.close();
    }
}
