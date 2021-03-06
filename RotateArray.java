public class RotateArray {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int temp = num[num.length-1];
        for (int i = num.length - 1; i > 0; i--) {
                num[i] = num[i - 1];
        }
        num[0]=temp;
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
// both are right 

public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
            Collections.rotate(a, k);
            
            List<Integer> result = new ArrayList<Integer>();
            for(int i = 0 ;i<queries.size();i++){
                result.add(a.get(queries.get(i)));
            }
            return result;
        }
