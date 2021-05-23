import java.util.Scanner;
public class CheckWebsite {
    public static void main(String[] args) {
        System.out.println("Enter your website = ");
        Scanner sc = new Scanner(System.in);
        String web = sc.nextLine();
        if (web.endsWith(".com")) {
            System.out.println("Comersial Website");
        }
        else if (web.endsWith(".org")) {
            System.out.println("Organisational Website");
        }
        else if (web.endsWith(".in")) {
            System.out.println("Indian Website");
        }
        else{
            System.out.println("Its Your Personal");
        }
        sc.close();
    }
}
