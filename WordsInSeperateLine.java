import java.util.Scanner;

public class WordsInSeperateLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence = ");
        String sen = sc.nextLine();
        sen = " " + sen;
        char ch;
        String wd = "";
        for (int i = 0; i < sen.length(); i++) {
            ch = sen.charAt(i);
            if (ch != 32) {
                wd = wd + ch;
            } else {
                System.out.println(wd);
                wd = "";
            }
        }
        sc.close();
    }
}
