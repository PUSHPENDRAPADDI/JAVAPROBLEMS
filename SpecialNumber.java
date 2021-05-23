import java.util.Scanner;
public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check wether number is special or not = ");
        int num = sc.nextInt();
        int temp = 0, sum = 0, pow = 1,numo = num;
        while (num != 0) {
            temp = num % 10;
            while (temp != 0) {
                pow = pow * temp;
                temp = temp - 1;
            }
            sum = sum + pow;
            pow = 1;
            num = num / 10;
        }
        if (sum == numo) {
            System.out.print("The number is Special");
        } else {
            System.out.print("The number is not Special");
        }
        sc.close();
    }
}
