public class DuplicateElementInArray {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 4, 5, 2, 2, 2, 2, 3, 1, 4 };
        int max = 5, min = 1;
        int arr2[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr[i]]++;
        }
        for (int j = min; j < arr2.length; j++) {
            if (arr2[j] > 1) {
                System.out.println(j + " Repeates " + arr2[j] + " times");
            }
        }
    }
}
