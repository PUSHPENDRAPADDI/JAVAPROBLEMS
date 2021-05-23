import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter the numbers of three subject = ");
        float sub1 = sc.nextInt();
        float sub2 = sc.nextInt();
        float sub3 = sc.nextInt();
        float cgpa = (sub1+sub2+sub3)/30;
        System.out.println("Your cgpa is = " + cgpa);
        }finally{
            sc.close();
        }
    }
}
