import java.lang.Math;
public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] arr = {-1,6,2,0,7,9};
        int max = arr[0];
        int min = arr[0];
        int pro = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0) {
                int temp = min;
                min = max;
                max = temp;
            }max = Math.max(arr[i],max*arr[i]);
            min = Math.min(arr[i],min*arr[i]);

            if (max>pro) {
                pro = max;
            }
        }
        System.out.println(pro);
    }
}
