import java.util.Scanner;
public class Income {
    public static void main(String[] args) {
        System.out.print("Enter Income in lakes = ");
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax = 1;
        if (income < 2.5) {
            System.out.println("No Tax Required");
        }
        else if (income>=2.5 || income < 5.0) {
            tax = 5*(income-2.5)/100;
            System.out.println("Your tax is "+tax);
        }
        else if (income>=5.0 || income < 10.0) {
            tax = 20*(income-2.5)/100;
            System.out.println("Your tax is "+tax);
        }
        else if (income>=10.0) {
            tax = 30*(income-2.5)/100;
            System.out.println("Your tax is "+tax);
        }
        sc.close();
    }
}
