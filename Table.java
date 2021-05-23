import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        System.out.print("Enter the number for table = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<11; i++){
            System.out.println(i*num);
        }
        sc.close();
    }
}
