import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter radius of circle = ");
        double radius = sc.nextInt();
        double area = 3.14*(radius*radius);
        System.out.println("The area of Circle is "+area);
        }finally{
            sc.close();
        }
    }
}
