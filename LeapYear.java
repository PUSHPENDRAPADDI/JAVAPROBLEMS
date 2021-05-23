import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter year for checking leap year = ");
            int year = sc.nextInt();
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Yes its leap Year");
                    } else {
                        System.out.println("No its not a leap year");
                    }
                } else {
                    System.out.println("Yes its leap year");
                }
            } else {
                System.out.println("No its not leap Year");
            }
        } finally {
            sc.close();
        }
    }
}
