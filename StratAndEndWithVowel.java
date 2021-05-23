import java.util.Scanner;

public class StratAndEndWithVowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence = ");
        String sen = sc.nextLine();
        sen = sen + " ";
        int count = 0;
        char ch;
        String wd = "";
        for (int i = 0; i < sen.length(); i++) {
            ch = sen.charAt(i);
            if (ch != 32) {
                wd = wd + ch;
            } else {
                ch = wd.charAt(0);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
                wd = "";
            }
        }
        System.out.println(count);
        sc.close();
    }
}
