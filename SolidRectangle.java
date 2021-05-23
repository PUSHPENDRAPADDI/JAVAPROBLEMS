import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter number for pattern = ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num + 3; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }}finally{
            sc.close();
        }
    }
}
