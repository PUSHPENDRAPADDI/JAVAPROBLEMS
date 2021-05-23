import java.util.Scanner;

public class KthMaxMin {
    public static void kthSmallest(int num[], int k) {
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
        int len = num.length - 1;
        System.out.println(k + "rd smallest element is " + num[k - 1]);
        System.out.print(k + "rd largest element is " + num[len - (k - 1)]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num[] = new int[9];
            System.out.println("Enter 9 Elements of Array :- ");
            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }
            int k = 3;
            kthSmallest(num, k);
        } finally {
            sc.close();
        }
    }
}
