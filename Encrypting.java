import java.util.Scanner;
public class Encrypting {
    public static void main(String[] args) {
        System.out.println("Enter your grade = ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = (char)(ch + 8);
        System.out.println(ch);
        sc.close();
    }
}
