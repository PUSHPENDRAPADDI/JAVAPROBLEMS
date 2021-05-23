public class RunLengthEncoded {
    public static void main(String[] args) {
        int[] num={1,2,2,3};
        for (int i = 1; i < num.length; i+=2) {
            for (int j = 1; j < num[i]; j++) {
                System.out.println(num[i]);
            }
        }
    }
}
