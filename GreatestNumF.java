import java.util.Scanner;
public class GreatestNumF {

    public void great(int x,int y, int z) {
        if (x>y && x>z) {
            System.out.print(x+" is greatest");
        }
        else if (y>x && y>z) {
            System.out.print(y+" is greatest");
        }
        else if (z>x && z>y) {
            System.out.print(z+" is greatest");
        }else{
            System.out.print("Enter valid entry");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter three numbers for find greatest = ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        GreatestNumF ob = new GreatestNumF();
        ob.great(num1,num2,num3);
        sc.close();
    }
}
