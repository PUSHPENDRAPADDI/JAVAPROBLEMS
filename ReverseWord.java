import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter string = ");
        String name = sc.nextLine();
        int len = name.length();
        for (int i = len-1; i >= 0; i--) {
             System.out.print(name.charAt(i));
        }}finally{
            sc.close();
        }
    }
}