import java.util.Scanner;

public class InitialName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence = ");
        String sen = sc.nextLine();
        char ch;String wd="";
        for (int i = 0; i < sen.length(); i++) {
            ch = sen.charAt(i);
            if (ch != 32) {
                wd = wd+ch;
            }else{
                System.out.print(wd.charAt(0)+".");
                wd = "";
            }
        }
        System.out.print(wd);
        sc.close();
    }
}
