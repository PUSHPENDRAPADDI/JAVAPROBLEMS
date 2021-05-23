import java.util.Scanner;

public class NameInPattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter name = ");
        String sen = sc.nextLine();
        for (int i = 0; i < sen.length(); i++) {
            for (int j = 0; j <= sen.length(); j++) {
                if (j == sen.length() - i) {
                    System.out.print(sen.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }}finally{
            sc.close();
        }
    }
}
