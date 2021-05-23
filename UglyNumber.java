import java.util.Scanner;
public class UglyNumber {
    public static void main(String[] args) {
        System.out.print("Enter number for checking number is ugly or not = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
            System.out.println("Number is Ugly Number");
        } else {
            System.out.println("Number is not Ugly Number");
        }
        sc.close();
    }
}
