import java.util.Scanner;

public class WordInSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence = ");
        String sen = sc.nextLine();
        System.out.print("Enter word = ");
        String w = sc.nextLine();
        sen = sen + " ";
        char ch;
        String wd = "";
        int f = 0;
        for (int i = 0; i < sen.length(); i++) {
            ch = sen.charAt(i);
            if (ch != 32) {
                wd = wd + ch;
            } else {
                if (wd.equals(w)) {
                    f++;
                }
                wd = "";
            }
        }
        System.out.print("frequency is " + f);
        sc.close();
    }
}
