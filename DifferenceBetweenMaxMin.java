public class DifferenceBetweenMaxMin {
    public static void main(String[] args) {
        int num[] = {-1,-3,3,47,21,91};
        int max = 0, min = num[0], res = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        res = max - min;
        System.out.println("The Range of Array is :- " + res);
    }
}
