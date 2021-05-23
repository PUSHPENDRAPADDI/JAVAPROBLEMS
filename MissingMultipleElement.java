public class MissingMultipleElement {
    public static void main(String[] args) {
        int[] num = {6,7,9,11,12,15,16,17,18,19};
        int max = 19,min = 6;
        int[] num2 = new int[max+1];
        for (int i = 0; i < num.length; i++) {
            num2[num[i]]=1;
        }
        for (int i = min; i < num2.length; i++) {
            if (num2[i]!=1) {
                System.out.println(i);
            }
        }
    }
}
