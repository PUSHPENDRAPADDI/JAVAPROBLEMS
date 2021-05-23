import java.util.Scanner;

public class AddMinus {
    public static void main(String[] args) {
        System.out.print("Enter three number for sum = ");
        Scanner sc = new Scanner(System.in);
        try {

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int sum = num1 + num2 + num3;
            int sub = num1 - num2 - num3;
            System.out.println("The sum is = " + sum);
            System.out.print("The substraction is = " + sub);
        } finally {
            sc.close();
        }
    }
}
