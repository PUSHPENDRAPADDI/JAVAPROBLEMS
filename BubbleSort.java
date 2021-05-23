public class BubbleSort {
    public static void main(String[] args) {
        int num[] = {5,4,3,2,1,9,8,7,6}, temp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[j];
                    num[j] = num[i];
                    num[i]=temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
