import java.util.*;

public class GuessNum {
    public static void main(String[] args) {
        Random rand = new Random();
        int cnum = rand.nextInt(10);
        boolean win = true;
        int count = 0;
        while (win != false) {
            count++;
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess the number between 0 to 10 = ");
            int gnum = sc.nextInt();
            if (gnum > cnum) {
                System.out.println("To high Guess low");
            }
            else if (gnum < cnum) {
                System.out.println("To low Guess high");
            }
            else if (gnum == cnum) {
                System.out.println("You win!!!! in "+count+" times");
                win = false;
            }
            sc.close();
        }
    }
}
