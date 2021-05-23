public class MergeTwoArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 7, 9 };
        int arr2[] = { 2, 4, 6, 8 };
        int arr3[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        for (; i < arr1.length; i++) {
            arr3[k++] = arr1[i];
        }
        for (; j < arr2.length; j++) {
            arr3[k++] = arr2[j];
        }
        for (int j2 = 0; j2 < arr3.length; j2++) {
            System.out.println(arr3[j2]);

        }
    }
}
