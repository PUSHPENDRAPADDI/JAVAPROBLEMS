public class RatioPosiNige {
    public static void main(String[] args) {
        double p=0,n=0,z=0;
        int num[] ={1,1,0,-1,-1};
        for (int i = 0; i < num.length; i++) {
            if (num[i]>0) {
                p++;
            }else if(num[i]<0){
                n++;
            }else{
                z++;
            }
        }
        System.out.println(p/num.length);
        System.out.println(n/num.length);
        System.out.println(z/num.length);
    }
}
