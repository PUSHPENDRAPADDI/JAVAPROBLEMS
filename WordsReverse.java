import java.util.Scanner;

public class WordsReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter sentence = ");
        String sen = sc.nextLine();
        sen = " "+sen;
        char ch;
        String wd = "";
        for (int i = sen.length()-1; i >=0; i--) {
            ch = sen.charAt(i);
            if (ch != 32) {
                wd = wd + ch;
            } else {
                for (int j = wd.length()- 1; j >= 0; j--) {
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
