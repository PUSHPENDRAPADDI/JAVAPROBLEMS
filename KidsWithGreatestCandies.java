public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        int[] candies = { 4, 2, 1, 1, 2 };
        int extraCandies = 1, max = candies[0];
        boolean[] output = new boolean[candies.length];
        for (int i = 0; i < output.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < output.length; i++) {
            if (candies[i] + extraCandies >= max) {
                output[i] = true;
            } else {
                output[i] = false;
            }
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + ",");
        }
    }
}