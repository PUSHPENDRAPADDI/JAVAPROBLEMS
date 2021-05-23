import java.util.Scanner;
import java.util.Random;

public class SnakeWaterGun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String cho = "swg";
            System.out.println("Enter how many time you want to play the game :- ");
            int turn = sc.nextInt();
            while (turn != 0) {
                System.out.println("Enter 's' for snake 'w' for water 'g' for gun :- ");
                char you = sc.next().charAt(0);
                Random rand = new Random();
                int ch = rand.nextInt(3);
                char comp = cho.charAt(ch);
                System.out.println("This is me " + you);
                System.out.println("This is computer " + comp);
                if (you == comp) {
                    System.out.println("Game tie");
                } else if (you == 's' && comp == 'w' || you == 'g' && comp == 's' || you == 'w' && comp == 'g') {
                    System.out.println("You win");
                } else if (you == 's' && comp == 'g' || you == 'g' && comp == 'w' || you == 'w' && comp == 's') {
                    System.out.println("Computer Win the game!");
                } else {
                    System.out.println("Please enter valid entry");
                }
                turn = turn - 1;
                System.out.println("You have " + turn + " chances more");
            }
        } finally {
            sc.close();
        }
    }
}
