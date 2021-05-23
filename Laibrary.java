public class Laibrary {
    public static void main(String[] args) {
        int day = 10, charge=0;
        if (day >0 && day <=5) {
            charge = day*40;
        }
        if (day >5 && day <=10) {
            charge = day*65;
        }
        if (day >10) {
            charge = day*80;
        }
        System.out.println("Your fine is "+charge+"(paise) for "+day+" late");
    }
}
