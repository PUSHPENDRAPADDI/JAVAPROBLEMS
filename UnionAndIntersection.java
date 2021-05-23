// This Programm is only for sorted array
public class UnionAndIntersection {
    void printUnion(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.println(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.println(arr2[j]);
                j++;
            } else if (arr1[i] == arr2[j]) {
                System.out.println(arr2[j]);
                j++;
                i++;
            }
        }
        while (i < m) {
            System.out.println(arr1[i]);
            i++;
        }
        while (j < n) {
            System.out.println(arr2[j]);
            j++;
        }
    }

    void printIntersection(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.println(arr1[i]);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        UnionAndIntersection ob = new UnionAndIntersection();
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 6, 7, 20 };
        int m = arr1.length;
        int n = arr2.length;
        System.out.println("Union of two arrays is ");
        ob.printUnion(arr1, arr2, m, n);
        System.out.println("");

        System.out.println("Intersection of two arrays is ");
        ob.printIntersection(arr1, arr2, m, n);

    }
}
