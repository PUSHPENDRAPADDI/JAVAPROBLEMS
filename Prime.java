import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter Number for checking prime or not = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
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
        sc.close();
    }
}
