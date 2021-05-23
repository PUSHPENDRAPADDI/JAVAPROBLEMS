import java.util.Scanner;

public class VolumesF {
    public float volume(float s) {
        float vol = s * s * s;
        return vol;
    }

    public float volume(float r, float pi) {
        float vol = 4 / 3 * (pi * r * r * r);
        return vol;
    }

    public float volume(float l, float b, float h) {
        float vol = l * b * h;
        return vol;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'c' for cube 's' for sphere and 'c' for cuboid =  ");
        String ch = sc.nextLine();
        if (ch.charAt(0) == 'c') {
            System.out.print("Enter side of cube = ");
            float side = sc.nextFloat();
            VolumesF ob = new VolumesF();
            float r = ob.volume(side);
            System.out.println("Volume of cube is " + r);
        } else if (ch.charAt(0) == 's') {
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
