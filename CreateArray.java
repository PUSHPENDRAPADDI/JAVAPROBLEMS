import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter the size of Array :- ");
        n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of Array :- ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("The Elements of Array is :- ");
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }}finally{
            sc.close();
        }
    }
}