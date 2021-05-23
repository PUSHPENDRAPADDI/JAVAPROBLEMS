import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age = ");
            int num = sc.nextInt();
            if (num <= 12) {
                System.out.println("You are CHILD!!!");
            } else if (num > 12 && num < 19) {
                System.out.println("You are TEENAGER");
            } else {
                System.out.println("You are MAN");
            }
        } finally {
            sc.close();
        }
    }
}
