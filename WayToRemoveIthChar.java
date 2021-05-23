import java.util.Scanner;

public class WayToRemoveIthChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string = ");
        String name = sc.nextLine();
        System.out.println("Enter position For remove = ");
        int num = sc.nextInt();
        for (int i = 0; i < name.length(); i++) {
            if (i == num) {
            }
            else{
                System.out.print(name.charAt(i));
            }
        }
        sc.close();
    }
}
