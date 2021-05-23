import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter principle rate ande time = ");
            double pre = sc.nextDouble();
            double rate = sc.nextDouble();
            double time = sc.nextDouble();
            double CI = pre * (Math.pow((1 + rate / 100), time));
            System.out.println("Compound interest is : " + CI);
        } finally {
            sc.close();
        }
    }
}
