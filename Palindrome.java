import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string = ");
        String name = sc.nextLine();
        int flag = 0;
        int j = name.length() - 1;
        for (int i = 0; i <= j; i++) {
            if (name.charAt(i) != name.charAt(j)) {
                flag = 1;
            }
            j--;
            break;
        }
        if (flag == 0) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
        sc.close();
    }
}
