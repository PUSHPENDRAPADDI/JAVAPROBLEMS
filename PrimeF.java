import java.util.Scanner;

public class PrimeF {

    public void pri(int num) {
        int i = 2, flag = 0;
        while (i <= num / 2) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
            i++;
        }
        if (flag == 0) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number for prime = ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        PrimeF ob = new PrimeF();
        ob.pri(num1);
        sc.close();
    }
}