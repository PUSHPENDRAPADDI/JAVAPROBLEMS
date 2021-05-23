import java.util.Scanner;
import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        char ch = 'y';
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = sc.nextLine();
        System.out.println("!------ Welcome " + name + " to the dice rolling game -------!");
        while (ch == 'y') {
            Random rand = new Random();
            int x = rand.nextInt(6);
            if (x == 1) {
                System.out.println("-------");
                System.out.println("|     |");
                System.out.println("|  0  |");
                System.out.println("|     |");
                System.out.println("-------");
            } else if (x == 2) {
                System.out.println("-------");
                System.out.println("|     |");
                System.out.println("|0   0|");
                System.out.println("|     |");
                System.out.println("-------");
            } else if (x == 3) {
                System.out.println("-------");
                System.out.println("|  0  |");
                System.out.println("|  0  |");
                System.out.println("|  0  |");
                System.out.println("-------");
            } else if (x == 4) {
                System.out.println("-------");
                System.out.println("|0   0|");
                System.out.println("|     |");
                System.out.println("|0   0|");
                System.out.println("-------");
            } else if (x == 5) {
                System.out.println("-------");
                System.out.println("|0   0|");
                System.out.println("|  0  |");
                System.out.println("|0   0|");
                System.out.println("-------");
            } else if (x == 6) {
                System.out.println("-------");
                System.out.println("|0   0|");
                System.out.println("|0   0|");
                System.out.println("|0   0|");
                System.out.println("-------");
            }
            System.out.println("Enter y for again roll dice");
            ch = sc.next().charAt(0);
        }
        sc.close();
    }
}
