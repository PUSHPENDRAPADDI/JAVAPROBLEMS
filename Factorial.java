import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        System.out.print("Enter number for Factorial = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i >0; i--) {
            fact = fact *i;
        }
        System.out.println("The factorial is = "+fact);
        sc.close();
    }
}
