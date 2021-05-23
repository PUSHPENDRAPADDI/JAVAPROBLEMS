import java.util.Scanner;

public class FaultyCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number = ");
        int num2 = sc.nextInt();
        System.out.print("Enter operater for perform = ");
        char op = sc.next().charAt(0);
        if (op == '*') {
            if (num1 == 45 && num2 == 3) {
                System.out.println("555");
            } else {
                System.out.println(num1 * num2);
            }
        } else if (op == '+') {
            if (num1 == 56 && num2 == 9) {
                System.out.println("77");
            } else {
                System.out.println(num1 + num2);
            }
        } else if (op == '/') {
            if (num1 == 56 && num2 == 6) {
                System.out.println(" 4");
            } else {
                System.out.println(num1 / num2);
            }
        } else {
            System.out.println("Enter valid entry");
        }
        sc.close();
    }
}
