import java.util.Scanner;
public class StringProblem {
    public static void main(String[] args) {
        System.out.print("Enter Name = ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String letter = "Dear Sunny, \n\tYou are ousome Bro!! \nThanks";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace(" ", "_"));
        System.out.println(name.indexOf(" "));
        System.out.println(letter);
        sc.close();
    }
}
