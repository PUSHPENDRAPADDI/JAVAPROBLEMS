import java.util.Scanner;
import java.lang.Math;

public class AreaF {

    public double area(Double s1, double s2, double s3) {
        double s = (s1+s2+s3)/2;
        double area = Math.pow((s*(s-s1)*(s-s2)*(s-s3)), 1/2);
        return area;
    }

    public int area(int s1, int s2, int h) {
        int area = 1/2*(h*(s1+s2));
        return area;
    }

    public double area(Double d1, Double d2) {
        double area = 1/2*(d1*d2);
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter 's' for scalene triangle 't' for trapezium and 'r' for rhombus =  ");
        String ch = sc.nextLine();
        if (ch.charAt(0) == 's') {
            System.out.print("Enter sides of triangle = ");
            double side1 = sc.nextDouble();
            double side2 = sc.nextDouble();
            double side3 = sc.nextDouble();
            AreaF ob = new AreaF();
            double r = ob.area(side1, side2, side3);
            System.out.println("Area of triangle is " + r);
        } else if (ch.charAt(0) == 't') {
            System.out.print("Enter two sides and height of trapezium = ");
            int side1 = sc.nextInt();
            int side2 = sc.nextInt();
            int height = sc.nextInt();
            AreaF ob = new AreaF();
            int r = ob.area(side1, side2, height);
            System.out.println("Area of trapeium is " + r);
        } else if (ch.charAt(0) == 'r') {
            System.out.print("Enter two diagonals of rombus = ");
            double diagonal1 = sc.nextDouble();
            double diagonal2 = sc.nextDouble();
            AreaF ob = new AreaF();
            double r = ob.area(diagonal1, diagonal2);
            System.out.println("Are of rombus is " + r);
        }}finally{
            sc.close();
        }
    }
}
