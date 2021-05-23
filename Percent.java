import java.util.Scanner;

public class Percent {
    public static void main(String[] args) {
        System.out.println("Enter the number of five subjects = ");
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int sum = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total obtained marks is = "+ sum);
        float per = sum*100/500;
        System.out.print("The percentage is = " + per);
        sc.close();
    }
}
