import java.util.Scanner;
public class NivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter number for checking NivenNumber = ");
        int num = sc.nextInt();
        int num2 = 0, temp = 0, numO = num;
        while (numO != 0) {
            temp = numO % 10;
            num2 = +temp;
            numO = numO / 10;
        }
        if (num % num2 == 0) {
            System.out.println("It is NivenNumber");
        } else {
            System.out.println("It is not a NivenNumber");
        }}finally{
            sc.close();
        }
    }
}
