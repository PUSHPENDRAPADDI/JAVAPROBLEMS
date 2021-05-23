import java.util.Scanner;
public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check wether number is duck or not = ");
        int num = sc.nextInt();
        int count = 0, temp=0;
        while (num != 0) {
            temp = num % 10;
            num = num / 10;
            if (temp == 0) {
                count++;
            }
        }
        if (temp != 0 && count >0) {
            System.out.print("It is duck number");
        }
        else{
            System.out.print("It is not duck number");
        }
        sc.close();
    }
}
