import java.util.Scanner;
public class VowelConsonent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter to check = ");
        String sc = s.nextLine();
        sc = sc.toUpperCase();
        int Cv=0,Cc=0,Cs=0,Cd =0;
        char ch;
        for (int i = 0; i < sc.length(); i++) {
            
            ch = sc.charAt(i);
            int x = (int)ch;
            if (x>=65 && x<=90) {
                if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                    Cv++;
                }
                else{
                    Cc++;
                }
            }else if(x>=48 && x<=57){
                Cd++;
            }
            else{
                Cs++;
            }
        }
        System.out.println("No of Vowel "+Cv);
        System.out.println("No of Consonent "+Cc);
        System.out.println("No of Digits "+Cd);
        System.out.println("No of Special Character "+Cs);
        s.close();
    }
}
