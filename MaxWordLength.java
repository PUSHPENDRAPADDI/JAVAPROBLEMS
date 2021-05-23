import java.util.Scanner;

public class MaxWordLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter sentence = ");
        String sen = sc.nextLine();
        sen = sen + " ";
        char ch;
        String wd = "", max = "";
        for (int i = 0; i < sen.length(); i++) {
            ch = sen.charAt(i);
            if (ch != 32) {
                wd = wd + ch;
            } else {
                if (wd.length() > max.length()) {
                    max = wd;
                    wd = "";
                }
            }
        }
        System.out.println(max + " is largest word");
        System.out.println(max.length() + " is max length");
    }finally{
        sc.close();
    }
    }
}
