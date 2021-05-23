import java.util.Scanner;

public class DeficientNumber {

    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Enter number for checking number is deficient or not = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum < num) {
            System.out.println("Number is Deficient");
        } else {
            System.out.println("Number is not Deficient");
        }
        sc.close();
    }
}
