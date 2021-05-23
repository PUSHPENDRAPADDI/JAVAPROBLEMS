public class MaxMinArray {
    public static void main(String[] args) {
        int num[] = { -5,1000,1, 2, 3, 4, 5, 16, 7, 8, 9, 10 };
        int max = 0, min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("The minimum number in the array is :- " + min);
        System.out.println("The maximum number in the array is :- " + max);
    }
}
