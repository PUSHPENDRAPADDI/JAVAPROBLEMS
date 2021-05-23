public class DefangingIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1.1";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                System.out.print("[.]");
            }else{
                System.out.print(address.charAt(i));
            }
        }
    }
}
