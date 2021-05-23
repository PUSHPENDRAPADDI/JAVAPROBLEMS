import java.util.Scanner;

public class ExistElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for search = ");
        int num = sc.nextInt();
        int mat1[] = new int[10];
        System.out.println("Enter 10 Elements for Array ");
        for (int i = 0; i < mat1.length; i++) {
            mat1[i] = sc.nextInt();
        }
        int flag = 0;
        for (int i = 0; i < mat1.length; i++) {
            if (num == mat1[i]) {
                flag = flag + 1;
            }
        }
        if (flag > 0) {
            System.out.println(num + " is Exist " + flag + " times");
        } else {
            System.out.println("Not exist");
        }
        sc.close();
    }
}
