import java.util.Scanner;

public class MaxMinWordLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter sentence = ");
            String sen = sc.nextLine();
            sen = sen + " ";
            char ch;
            String wd = "", wdm = "", max = "", min = "pushpendghjkrayadva";
            for (int i = 0; i < sen.length(); i++) {
                ch = sen.charAt(i);
                if (ch != 32) {
                    wd = wd + ch;
                    wdm = wdm + ch;
                } else {
                    if (wd.length() > max.length()) {
                        max = wd;
                        wd = "";
                    }
                    if (wdm.length() < min.length()) {
                        min = wdm;
                        wdm = "";
                    }
                }
            }
            System.out.println(max + " is largest word");
            System.out.println(max.length() + " is max length");
            System.out.println(min + " is smallest word");
            System.out.println(min.length() + " is min length");
        } finally {
            sc.close();
        }
    }
}
