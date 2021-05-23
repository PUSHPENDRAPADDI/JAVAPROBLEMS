import java.util.Scanner;

public class DrivingPermit {
    public static void main(String[] args) {
        System.out.print("Enter your age = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 18) {
            System.out.println("You are CHILD!!! NOT allowed to drive");
        } else if (num > 18 && num < 85) {
            System.out.println("You are allowed to drive");
        } else {
            System.out.println("You are to old");
        }
        sc.close();
    }
}
