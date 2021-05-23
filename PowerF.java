import java.util.Scanner;

public class PowerF {

    public int fact(int x,int y) {
        int f = 1;
        for (int i = 0; i < y; i++) {
            f = f * x;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.print("Enter number for power = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Enter number for power = ");
        int num2 = sc.nextInt();
        PowerF ob = new PowerF();
        int r = ob.fact(num,num2);
        System.out.println("Power is " + r);
        sc.close();
    }
}
