public class FirstRepeatingElement {
    public static void main(String[] args) {
        int k=0;
        int num[] = { 4, 5, 3, 1, 2, 3, 1, 1, 2, 6 };
        // int[] num2 = num;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i]==num[j]) {
                    k++;
                    break;
                }
            }
            if(k>0){
                break;
            }
            System.out.println(num[i]);
        }
        
    }
}
