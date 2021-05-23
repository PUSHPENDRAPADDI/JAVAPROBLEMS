import java.util.Scanner;
public class Telephone {
    public static void main(String[] args) {
        System.out.print("Enter calls = ");
        Scanner sc = new Scanner(System.in);
        double call = sc.nextInt();
        double charge = 0;
        if (call <= 100) {
            System.out.println("No bill below 100 calls");
        }
        else if (call >= 100 && call<200) {
            charge = (call - 100)*1;
        }
        else if (call >= 200 && call<300) {
            charge = 100+ (call - 200)*0.05;
        }
        else if (call >= 300 && call<500) {
            charge = 110 +(call - 300)*0.02;
        }
        else if (call >= 500) {
            charge = 116+(call - 500)*0.10;
        }
        double total_amount = 130 + charge;
        System.out.println("Your telephone bill is "+total_amount);
        sc.close();
    }
}
