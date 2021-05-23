import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter number = ");
        int num = sc.nextInt();
        int num2=num,num3=num,temp = 0, count = 0, sum=0, pow=1;
        while (num != 0) {
            num = num/10;
            count = count+1;
        }
        while (num2!=0) {
            pow = 1;
            temp = num2%10;
            for (int i = count; i > 0; i--) {
                pow = pow * temp;
            }
            sum = sum + pow;
            num2 = num2/10;
        }
        if (sum == num3) {
            System.out.println(sum+" is armstrong number");
        }
        else{
            System.out.println(sum+" is not armstrong number");
        }}finally{
            sc.close();
        }
    }
}
