public class FactorialOfLargest {
    public static void main(String[] args) {
        int n = 10, q = 2, len = 1, x = 0, num = 0;
        int[] arr = new int[100000];
        arr[0] = 1;
        while (q <= n) {
            x = 0;
            num = 0;
            while (x < len) {
                arr[x] = arr[x] * q;
                arr[x] = arr[x] + num;
                num = arr[x] / 10;
                arr[x] = arr[x] % 10;
                x++;
            }
            while (num != 0) {
                arr[len] = num % 10;
                num = num / 10;
                len++;
            }
            q++;
        }
        len--;
        while (len>=0) {
            System.out.print(arr[len]);
            len-=1;
        }
    }
}
