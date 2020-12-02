package Demo6;

/**
 * @author Esa Kesti
 * @version 7 Aug 2020
 */
public class TokaA {

    /**
     * @param luku 
     * @return jotain
     */
    public static  double itseisarvo(double luku) {
        
        
        return (luku <= 0.0F) ? 0.0F - luku : luku;
    }
    
    
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        
        double b = itseisarvo(17);
        
        System.out.println("Luku on: "+ b);
        
    }

}
