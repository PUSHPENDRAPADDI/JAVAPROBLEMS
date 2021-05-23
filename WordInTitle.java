import java.util.Scanner;

public class WordInTitle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = "hii its me pushpendra";
        sen = sen + " ";
        char ch;
        String wd = "";
        for (int i = 0; i < sen.length(); i++) {
            ch = sen.charAt(i);
            if (ch != 32) {
                wd = wd + ch;
            } else {
                for (int j = 0; j < wd.length(); j++) {
                    if (j == 0) {
                        char ch2 = wd.charAt(0);
                        System.out.print((ch2+32) +" ");
                    } else {
                        // System.out.print(wd + " ");
                        wd = "";
                    }
                }
            }
        }
        sc.close();
    }
}