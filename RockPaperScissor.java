import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        String chan = "rps";
        System.out.print("Enter how many times you want to play = ");
        int turn = sc.nextInt();
        while (turn != 0) {
            System.out.println("Enter first letter of your choice = ");
            char player = sc.next().charAt(0);
            Random rand = new Random();
            int ch = rand.nextInt(3);
            char choice = chan.charAt(ch);
            System.out.println("Choice is " + choice);
            System.out.println("player is " + player);
            if (player == 'r' && choice == 'p' || player == 'p' && choice == 's' || player == 's' && choice == 'r') {
                System.out.println("Player loss the game");
            } else if (player == 'r' && choice == 's' || player == 'p' && choice == 'r'
                    || player == 's' && choice == 'p') {
                System.out.println("Player win the game");
            } else if (player == choice) {
                System.out.println("Match is draw because " + player + " = " + choice);
            } else {
                System.out.println("Please enter valid entry");
            }
            turn -= 1;
            System.out.println("You have " + turn + " chances more");
        }}finally{
            sc.close();
        }
    }
}
