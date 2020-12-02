package Demo7;

/**
 * @author Esa Kesti
 * @version 26 Nov 2020
 */
public class testi {
    /**
     * @param mat1
     * @param mat2
     * @return mat3
     */
    public static double[][] summaa(double[][] mat1, double[][] mat2) {
        int i = 0, j = 0;
        int koko = 3;
        double mat3 [][] = new double [koko][koko];
        for ( i = 0; i < mat1.length; i++) {
            for ( j = 0; j < mat1.length; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return mat3;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        double mat1[][] = {{1,2,3},{2,2,2},{4,2,3}};
        double mat2[][] = {{9,2,8},{1,2,5},{3,19,-3}};
        double mat3[][] = summaa(mat1,mat2);
        
        System.out.println("La somme des matrices données : ");
        for(int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                System.out.print(mat3[i][j] + "   ");
            }
            System.out.println();
        } 
    }
}