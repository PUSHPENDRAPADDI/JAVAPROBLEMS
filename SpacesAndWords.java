import java.util.Scanner;
public class SpacesAndWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence = ");
        String sen = sc.nextLine();
        char ch;
        int Cs=0,Cw=0;
        for (int i = 0; i < sen.length(); i++) {
            ch = sen.charAt(i);
            if (ch == 32) {
                Cs++;
            }
            else{
                Cw++;
            }
        }
        System.out.println(Cs+" is Spaces");
        System.out.println(Cw+" is Words");
        sc.close();
    }
}
