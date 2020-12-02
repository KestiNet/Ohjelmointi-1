package Demo7;

/**
 * @author Esa Kesti
 * @version 21 Nov 2020
 */
public class Matriisi {
    
    /**
     * Käy läpi taulukon alkiot ja tulostaa ne matriisiin
     * @param mat3
     */
   public static void tulosta(double [][] mat3) { 
        for (int i = 0; i < mat3.length; i++) { 
            for (int j = 0; j < mat3.length; j++) 
                System.out.print(mat3[i][j] + " "); 

            System.out.println(); 
        } 
}

    
    /**
     * Laskee annettujen matriisien vastinluvut yhteen
     * @param mat1 luvut
     * @param mat2 luvut
     * @return mat3 palauttaa yhteenlaskettujen taulukoiden vastinluvut kolmanteen taulukkoon
     */
    public static double[][] summaa(double[][] mat1, double[][] mat2) {
    
        int koko = 3;
        double mat3 [][] = new double [koko][koko];
        for (int i = 0; i < mat1.length; i++) {
            for ( int j = 0; j < mat1.length; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return mat3;
    }
  

    /**
     * @param args Ei käytössä
     */
    public static void main(String[] args) {
        double mat1[][] = {{1,2,3},{2,2,2},{4,2,3}};
        double mat2[][] = {{9,2,8},{1,2,5},{3,19,-3}};
        double mat3[][] = summaa(mat1,mat2);
        tulosta(mat3);
    }


    
    }
    


