package Demo4;

/**
 * @author User
 * @version 20 Jun 2020
 */
public class FunktioMalli {

    /**
     * Laskee kolmion alan
     * @param kanta kolmion ala
     * @param korkeus kolmion korkeus
     * @return kolmion ala
     */
    public static double kolmionAla(double kanta, double korkeus){
        double a = kanta*korkeus/2.0;
        return a;
    }
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        double kanta = 4, korkeus= 7, ala;
        ala = kolmionAla(kanta, korkeus);
        System.out.println("ala = " + ala );
        
        ala = kolmionAla(20, 20);
        System.out.println("ala = " + ala );
    }

}
