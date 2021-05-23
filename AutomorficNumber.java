import java.util.Scanner;

public class AutomorficNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for Automoefic number = ");
        int num = sc.nextInt();
        int count = 0, numo = num, sum = 0, sum2 = 0, ponum = num * num, ponum2 = 0;
        while (num != 0) {
            num = num / 10;
            count -= 1;
            while (count != 0) {
                ponum2 = ponum % 10;
                sum = sum * 10 + ponum2;
                ponum = ponum / 10;
                count += 1;
                ponum2 = 0;
            }
        }
        while (sum != 0) {
            sum2 = (sum2 * 10) + sum % 10;
            sum = sum / 10;
        }
        if (sum2 == numo) {
            System.out.print("The number is Automorfic");
        } else {
            System.out.print("The number is not Automorfic");
        }
        sc.close();
    }
}