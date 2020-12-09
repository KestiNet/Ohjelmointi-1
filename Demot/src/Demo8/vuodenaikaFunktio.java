package Demo8;

/**
 * @author esakesti
 *
 */
public class vuodenaikaFunktio {
	  
	 
    private static final String [][] kuut =
       { {"tammi", "helmi","maalis","huhti", "kes�", "syys",},
         {"talvi", "talvi", "kev�t", "kev�t", "kes�", "syksy"}
       };      
    
    /**
     * Palauttaa kuukauden nime� vastaavan vuodenajan tekstin�
     * @param knimi kuukauden nimi
     * @return vuodenaika tekstin�
     * @example
     * <pre name="test">
     * vuodenaika("tammi") === "talvi";
     * vuodenaika("helmi") === "talvi";
     * vuodenaika("maalis") === "kev�t";
     * vuodenaika("kes�") === "kes�";
     * vuodenaika("huhti") === "kev�t";
     * vuodenaika("syys") === "syksy";
     * vuodenaika("m�t�") === "???";
     * </pre>
     */
    
    
    
    public static String vuodenaika( String knimi) {
            
        for (int i = 0; i < kuut[0].length; i++)
          if (kuut[0][i].equalsIgnoreCase(knimi))
              return kuut[1][i];



        return "???";
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String kNimi = "helmi"; //Tullut netist�, tiedostosta tai jostain muualta
        String vaika;
        vaika = vuodenaika(kNimi);
        System.out.println("Kuukausi on " + kNimi + "kuu, " + "Nyt on siis " + vaika);
    }

}