import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter sentence = ");
        String sen = sc.nextLine();
        sen = sen + " ";
        char ch;
        String wd = "";
        for (int i = 0; i < sen.length(); i++) {
            ch = sen.charAt(i);
            if (ch != 32) {
                wd = wd + ch;
            } else {
                int l = wd.length();
                for (int j = l - 1; j >= 0; j--) {
                    System.out.print(wd.charAt(j));
                }
                System.out.print(" ");
                wd = "";
            }
        }}finally{
            sc.close();
        }
    }
}
