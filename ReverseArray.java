import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        int num[] = new int[10];
        System.out.println("Enter 10 Elements of Array ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int len = num.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = num[i];
            num[i] = num[(len - 1) - i];
            num[(len - 1) - i] = temp;
        }
        System.out.println("The Reverse Array is :- ");
        for (int i = 0; i < len; i++) {
            System.out.println(num[i]);
        }}finally{
            sc.close();
        }
    }
}
