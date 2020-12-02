package Demo6;

/**
 * @author Esa Kesti
 * @version 28 Aug 2020
 */
public class Kolmas {
    
    /**
     * @param luvut
     * @param keskiarvo
     */
    public static  void miidi (double luvut[], double keskiarvo) {
        
        double diff = Integer.MAX_VALUE;
        for (int i = 0; i < luvut.length; ++i) {
            double abs = Math.abs(luvut[i]);
            if (abs < diff) {
                keskiarvo = i;
                diff = abs;
            } else if (abs == diff && luvut[i] > 0 && luvut[(int) keskiarvo] < 0) {
                //same distance to zero but positive 
                keskiarvo =i;
                
                System.out.println(luvut[miidi]);

            }
            
        } 
        
       
    }
    

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        double[] luvut = {1,1,2,3,6,7,8}; // keskiarvo == 4.0
        double keskiarvo = 4.0;
        
        
    }

}