package Demo6;

/**
 * @author Esa Kesti
 * @version 28 Aug 2020
 */
public class Toistorakenteet {
    /**
     * Lasketaan taulukon alkioiden keskiarvo
     * @param luvut taulukosta
     * @return lasketun keskiarvon
     */
    
    
    public static double keskiarvo(double[] luvut) {
        
        int summa = 0;
        for(int i = 0; i < luvut.length; i++) {
            summa += luvut[i];
        }
        return (double) summa /(double)luvut.length;
    }
    
    
    
    /**
     * @param luvut taulukosta
     * @param keskiarvo tuodaan aiemmasta apuohjelmasta keskiarvo
     * @return lahin on alkion arvo lähimpänä laskettua keskiarvoa.
     */
    public static double miidi(double luvut[], double keskiarvo) {
    
        int lahin = luvut.length;
        
        double pituus = Math.abs(lahin - keskiarvo); 
        
        
        for (int j = 1; j < luvut.length; j++) {
            double mitta = Math.abs(luvut[j] - keskiarvo);
            
            if (mitta < pituus) {
                lahin = j;
                pituus = mitta;
                
            }
    }
        return luvut[lahin];

    }
        

    /**
     * @param args ei käytössä
     *
     */
    public static void main(String[] args) {
        double[] luvut = {1,1,2,3,6,7,8,9}; // keskiarvo == 4.0
    
        System.out.println("Taulukon lukujen keskiarvo on: " + keskiarvo(luvut));
        
        System.out.println("Lähin luku keskiarvoa on: " + miidi(luvut, keskiarvo(luvut)));
        
    }
    
}
