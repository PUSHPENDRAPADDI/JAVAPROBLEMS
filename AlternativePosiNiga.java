public class AlternativePosiNiga {
    public static void main(String[] args) {
        int[] num = { 2, -3, 4, 5, -1, -3,4 };
        int i = 0, j = num.length-1;
        while (i <= j) {
            if (num[i] < 0 && num[j] > 0) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            } else if (num[i] > 0 && num[j] < 0) {
                i++;
                j--;
            } else if (num[i] > 0) {
                i++;
            } else if (num[j] < 0) {
                j--;
            }
        }
        int k =0;
        while (k<num.length && i<num.length) {
            int temp = num[k];
            num[k] = num[i];
            num[i]=temp;
            k=k+2;
            i++;
        }
        for (int j2 = 0; j2 < num.length; j2++) {
            System.out.println(num[j2]);
        }
    }
}
