public class VrticalConcentration {
    public static void main(String[] args) {
        String mat1[][] = { {"Sunny", "Hum", "Paddi" }, { "Achhaa", "Dost", "Bimaar" },{"How","Are","You"}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat1[i][j] +mat1[i+1][j]+" ");
            }
            System.out.println("");
        }
    }
}
