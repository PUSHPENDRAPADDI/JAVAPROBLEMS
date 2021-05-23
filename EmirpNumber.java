import java.util.Scanner;
public class EmirpNumber {
    public static void main(String[] args) {
        System.out.print("Enter number for checking EmirpNumber = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = 0, numO = num, temp, count;
        while (numO != 0) {
            temp = numO % 10;
            num2 = num2 * 10 + temp;
            numO = numO / 10;
        }
        count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0 && num2 % i == 0) {
                count = count + 1;
            }
        }
        if (count >= 1) {
            System.out.println(num + "is not EmirpNumber");
        } else {
            System.out.println(num + " is EmirpNumber");
        }
        sc.close();
    }
}
