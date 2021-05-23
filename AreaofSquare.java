import java.util.Scanner;

public class AreaofSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter side of square = ");
        double side = sc.nextInt();
        double area = side*side;
        System.out.println("The area of Square is " + area);
        }finally{
            sc.close();
        }
    }
}
