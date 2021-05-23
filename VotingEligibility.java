import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        System.out.print("Enter your age = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0 &&num <= 18) {
            System.out.println("You are CHILD!!! NOT allowed to vote");
        } else if (num > 18 && num < 150) {
            System.out.println("You are allowed to vote");
        } else {
            System.out.println("Please Enter valid age");
        }
        sc.close();
    }
}
