import java.util.Scanner;

public class Symmetrical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string = ");
        String name = sc.nextLine();
        int flag = 0, mid= 0,start1 = mid;
        int j = name.length();
        if (j%2 == 0) {
            mid = j/2;
        }
        else{
            mid = j/2;
        }
        sc.close();
        int start2 = mid;
        for (start1 = 0; start1 < mid; start1++) {
            if (name.charAt(start1) == name.charAt(start2)) {
                start2++;
            }
            else{
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("String is Symmetrical");
        } else {
            System.out.println("String is not Symmetrical");
        }
    }
}
