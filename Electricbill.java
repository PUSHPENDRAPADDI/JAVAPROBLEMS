import java.util.Scanner;
public class Electricbill {
    public static void main(String[] args) {
        System.out.print("Enter unit = ");
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextInt();
        double charge = 0;
        if (unit >0 &&unit <= 50) {
            charge = unit*0.05;
        }
        else if (unit >50 &&unit <= 150) {
            charge = 2.5 + (unit-50)*0.75;
        }
        else if (unit >150 &&unit <= 250) {
            charge = 77.5 + (unit-150)*1.20;
        }
        else if (unit >250) {
            charge = 197 +(unit-250)*1.50;
        }
        double surcharge = (20*charge)/100;
        double total_amount = charge+surcharge;
        System.out.println("Your amount after adding charge("+charge+") and surcharge("+surcharge+") is = "+total_amount);
        sc.close();
    }
}
