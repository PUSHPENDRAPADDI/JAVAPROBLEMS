import java.util.Scanner;
public class ISBNNumber {
    public static void main(String[] args) {
        // num = 1401601499;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for ISBN = ");
        int num = sc.nextInt();
        int dupnum = num, temp = 0, sum = 0, mul = 1;
        for (int i = 10; i > 0; i--) {
            temp = dupnum % 10;
            mul = temp * i;
            sum = sum + mul;
            dupnum = dupnum / 10;
        }
        if (sum % 11 == 0) {
            System.out.print("The ISBN is correct");
        } else {
            System.out.print("The is not correct");
        }
        sc.close();
    }
}
