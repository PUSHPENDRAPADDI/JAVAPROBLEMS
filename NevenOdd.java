import java.util.Scanner;

public class NevenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter number for pattern = ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i%2==0) {
                System.out.println(i+" is even");
            }
            else{
                System.out.println(i+" is odd");
            }
        }}finally{
            sc.close();
        }
    }
}
