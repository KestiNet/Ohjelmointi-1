package Demo6;

/**
 * Verrataan reaalilukuja  toisiinsa
 * @author Esa Kesti
 * @version 6 Aug 2020
 */
public class Eka {
    
    
/**
 * @param a
 * @param b
 * @param erotus 
 * @return true or false
 */
public static boolean samat(double a, double b, double erotus)    {
    
    if(Math.abs(a - b) < erotus) return true;
    System.out.println("Ovat Melkein samat");
    
    if( Math.abs(a-b) >  erotus) return false;
    System.out.println("Ovat eri suuria");
    
    if(Math.abs(a-b) <  erotus) return true;
    System.out.println("Ovat eri suuria");
    
    if( Math.abs(a-b) <  erotus) return false;
    System.out.println("Ovat sinnepäin");
    
    
    return false;

    
    }
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) { 
        samat(7.1001, 7.1002, 0.01);
        samat(7.1001, 7.1002, 0.00001);
        samat(7.1001, 7.1002, 0.01);
        samat(7.1001, 7.2002, 0.01);
        }
        
    }


