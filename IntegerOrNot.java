import java.util.Scanner;
public class IntegerOrNot {
    public static void main(String[] args) {
        System.out.println("Enter your number = ");
        Scanner sc = new Scanner(System.in);
        System.out.println("The number is "+sc.hasNextInt());
        sc.close();
    }
}
