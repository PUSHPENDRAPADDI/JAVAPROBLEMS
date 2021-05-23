import java.util.Scanner;

public class AgeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter current year = ");
            int cyear = sc.nextInt();
            System.out.print("Enter birth year = ");
            int byear = sc.nextInt();
            int age = cyear - byear;
            System.out.println("Your age is " + age);
        } finally {
            sc.close();
        }
    }
}
