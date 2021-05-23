import java.util.Scanner;

public class NameInPattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter name = ");
        String sen = sc.nextLine();
        sen = sen + " ";
        for (int i = sen.length() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(sen.charAt(j));
            }
            System.out.println();
        }}finally{
            sc.close();
        }
    }
}
