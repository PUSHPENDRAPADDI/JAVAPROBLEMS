import java.util.Scanner;

public class FactorialF {
    public int fact(int x) {
        int f = 1;
        for (int i = 1; i < x; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.print("Enter number for factorial = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        FactorialF ob = new FactorialF();
        int r = ob.fact(num);
        System.out.println("Factorial is " + r);
        sc.close();
    }
}
