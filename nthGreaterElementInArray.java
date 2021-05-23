import java.util.Arrays;
import java.util.Scanner;
public class nthGreaterElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter number for greatest element = ");
        int num2 = sc.nextInt(); 
        int num[] = {18, 7, 6, 2, 15};
        Arrays.sort(num);
            System.out.println(num[num.length-num2]);
        }finally{
            sc.close();
        }
    }
}
