public class CommonElementInSorted {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5, 6, 7 };
        int[] arr2 = { 2, 3, 5, 6, 7, 20 };
        int[] arr3 = { 2, 3, 5, 6, 7, 8, 20 };
        int[] temp = new int[10];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                temp[k] = arr1[i];
                i++;
                k++;
            }
        }
        for (int l = 0; l < k; l++) {
            for (int l2 = 0; l2 < arr3.length; l2++) {
                if (temp[l] == arr3[l2]) {
                    System.out.println(temp[l]);
                }
            }
        }
    }
}
