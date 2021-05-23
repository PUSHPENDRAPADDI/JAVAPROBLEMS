import java.util.Scanner;

public class TableUpto {
    public static void main(String[] args) {
        System.out.print("Enter the number for table = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            System.out.println("Table of "+i);
            for (int j = 1; j < 11; j++) {
                System.out.println(j * num);
            }
        }
        sc.close();
    }
}
