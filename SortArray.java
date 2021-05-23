import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] num = new int[6];
            System.out.println("Enter the Elements of Array :- ");
            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }
            System.out.println("The Array is :- ");
            for (int i = 0; i < num.length; i++) {
                int temp = num[i];
                for (int j = i; j < num.length; j++) {
                    if (temp > num[j]) {
                        temp = num[j];
                        num[j] = num[i];
                        num[i] = temp;
                    }
                }
            }
            for (int i = 0; i < num.length; i++) {
                System.out.println(num[i]);
            }
        } finally {
            sc.close();
        }
    }

}
