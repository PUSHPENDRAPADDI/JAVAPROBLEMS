import java.util.Scanner;

public class FirstLetterOfWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence = ");
        String sen = sc.nextLine();
        sen = " " + sen;
        char ch;
        for (int i = 0; i < sen.length(); i++) {
            ch = sen.charAt(i);
            if (ch == 32) {
                System.out.print(sen.charAt(i+1) + ".");
            }
        }
        sc.close();
    }
}
