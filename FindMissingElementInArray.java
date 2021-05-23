public class FindMissingElementInArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,6,7,8,9};
        int n = num[num.length-1];
        int sumTotal = n*(n+1)/2,sum=0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sumTotal- sum);
    }
}
