import java.util.Scanner;

public class nums_calF {
    public void cal(int num, String ch) {
        if (ch == "s") {
            System.out.print(num);
        } else {
            System.out.print(num);

        }
    }

    public void cal(int a, int b, char ch) {
        if (ch == 'p') {
            int pro = a * b;
            System.out.print(pro);
        } else {
            int sum = a + b;
            System.out.println(sum);
        }
    }

    public void cal(String s1, String s2) {
        if (s1 == s2) {
            System.out.print("strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'a' for first 'b' for second and 'c' for third =  ");
        String ch = sc.nextLine();
        if (ch.charAt(0) == 'a') {
            System.out.print("Enter charecter = ");
            String ch1 = sc.nextLine();
            System.out.print("Enter number = ");
            int num = sc.nextInt();
            nums_calF ob = new nums_calF();
            ob.cal(num, ch1);
        } else if (ch.charAt(0) == 'b') {
            System.out.print("Enter radius of sphere = ");
            float radius = sc.nextFloat();
            float pi = 22 / 7;
            VolumesF ob = new VolumesF();
            float r = ob.volume(radius, pi);
            System.out.println("Volume of sphere is " + r);
        } else if (ch.charAt(0) == 'u') {
            System.out.print("Enter length , breadth and height of cuboid = ");
            float length = sc.nextFloat();
            float breadth = sc.nextFloat();
            float height = sc.nextFloat();
            VolumesF ob = new VolumesF();
            float r = ob.volume(length, breadth, height);
            System.out.println("Volume of cube is " + r);
        }
        sc.close();
    }
}
