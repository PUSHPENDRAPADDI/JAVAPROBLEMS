import java.util.Scanner;
public class ASCIICode {
    public static void main(String[] args) {
        System.out.println("Enter your chracter for ASCII code = ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.println("ASCII code is "+ascii);
        sc.close();
    }
}
