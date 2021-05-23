import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter your Second number = ");
        int num2 = sc.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("First number is "+num1);
        System.out.println("Second number is "+num2);
        sc.close();
    }
}
