import java.util.Scanner; 
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter principle rate ande time = ");
        double pre = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double SI = pre*rate*time;
        System.out.println("Simple interest is : " + SI);
        }finally{
            sc.close();
        }
    }
}
