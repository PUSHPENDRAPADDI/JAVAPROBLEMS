import java.util.Scanner;
public class PassorNot {
    public static void main(String[] args) {
        System.out.println("Enter number of three subject :- ");
        Scanner sc = new Scanner(System.in);
        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();
        float per = ((sub1+sub2+sub3)/300)*100;
        if ((sub1<33 || sub2<33 || sub3 < 33)) {
            if (per <40) {
                System.out.println("You fail with percentage " +per);
            }
            else if (per > 40) {
                System.out.println("You have less mark in subject with percentage " +per);
            }
        }
        else if (sub1>33 && sub2>33 && sub3 > 33) {
            if(per <40){
                System.out.println("You have less percent than passing "+per);
            }
            else if (per >= 40) {
                System.out.println("You PASS with percentage " +per);
            }
        }
        sc.close();
    }
}
