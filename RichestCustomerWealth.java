public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[] account[] = {{1,2,3},{3,4,1}};
        int sum = 0,max=0;
        for (int i = 0; i < account.length; i++) {
            for (int j = 0; j < account[i].length; j++) {
                sum = sum + account[i][j];
            }
            if (max < sum) {
                max = sum;
            }
            sum = 0;
        }
        System.out.println("The Wealth of a richest customer is :- "+max);
    }
}
