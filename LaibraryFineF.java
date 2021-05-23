import java.util.Scanner;

public class LaibraryFineF {
    int acc_num;
    String author, title;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Enter Title = ");
        title = sc.nextLine();
        System.out.print("Enter account number = ");
        acc_num = sc.nextInt();
        System.out.print("Enter Author name = ");
        author = sc.nextLine();
    }

    public void cal() {
        System.out.print("Enter number of days you late = ");
        int day = sc.nextInt();
        int f = day * 2;
        System.out.println("Fine is " + f);
    }

    public void display() {
        System.out.println("Accession" + "\t" + "Title" + "\t" + "Author name");
        System.out.print(acc_num + "\t" + title + "\t" + author);
    }

    public static void main(String[] args) {
        LaibraryFineF ob = new LaibraryFineF();
        ob.input();
        ob.cal();
        ob.display();
    }
}