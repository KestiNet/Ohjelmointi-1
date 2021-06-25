package l12;

/**
 * Esimerkkej‰ matriisesita, moniulotteisista taulukoista
 * @author Esa Kesti
 * @version 30 Jul 2020
 */
public class Matriisit {

    
    /**
     * t‰ytt‰‰ diagonaalin halutulla luvulla
     * @param mat3
     * @param tayttoluku
     */
    public static void taytaDiagonaali(int[][] mat3, int tayttoluku) {
        for (int i = 0; i < mat3.length; i++) {
            mat3[i][i] = tayttoluku;
        }
    }
    
    /**
     * tulostaa matriisin
     * @param matriisi tulostettava matriisit
     */
    public static void tulosta2(int[][] matriisi) {
        for (int ir = 0; ir < matriisi.length; ir++) {
            for (int is = 0; is < matriisi[ir].length; is++)
                System.out.printf("%2d", matriisi[ir][is]);
            System.out.println();
             
        }
        
    }
    
   
    
    
    
    /**
     * tulostaa matriisin
     * @param matriisi tulostettava matriisi
     */
    public static void tulosta(int[][] matriisi) {
        for (int ir = 0; ir < matriisi.length; ir++) {
            int[] rivi = matriisi[ir];
            for (int is = 0; is < rivi.length; is++)
                System.out.printf("%2d", rivi[is]);
            System.out.println();
             
        }
        
    }
    
    /**
     * @param args ei k‰ytˆss‰
     */
    public static void main(String[] args) {
        int[][] mat = new int [3][4];
        mat[0][0] = 55;
        mat[2][2] = 7;
        System.out.println(mat[0][0]);
        int [][] mat2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                
        };
        System.out.println(mat2[2][1]);
        System.out.println("Matriisin mat pituus " + mat.length);
        System.out.println("Matriisin mat[2] pituus " + mat[2].length);
        
        tulosta(mat);
        tulosta2(mat2);
        
        int [][] mat3 = new int[10][10];
        taytaDiagonaali(mat3, 9);
        System.out.println();
        tulosta(mat3);
    }

    }


