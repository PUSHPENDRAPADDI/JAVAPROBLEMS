import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        int div = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number to check whether number is composite or not = ");
            int num = sc.nextInt();
            int num2 = num / 2;
            for (int i = 2; i < num2; i++) {
                if (num % i == 0) {
                    div = 1;
                }
            }
            if (div == 1) {
                System.out.print(num + " is composite");
            } else {
                System.out.print(num + " is not composite");
            }
        } finally {
            sc.close();
        }
    }
}
