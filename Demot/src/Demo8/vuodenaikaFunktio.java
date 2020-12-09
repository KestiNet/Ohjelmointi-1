package Demo8;

/**
 * @author esakesti
 *
 */
public class vuodenaikaFunktio {
	  
	 
    private static final String [][] kuukaudetVuodenajat =
       { {"tammi", "helmi","maalis","huhti", "kesä", "syys",},
         {"talvi", "talvi", "kevät", "kevät", "kesä", "syksy"}
       };      
    
    /**
     * Palauttaa kuukauden nime� vastaavan vuodenajan tekstin�
     * @param kuukausi 
     * @return vuodenaika tekstinä
     * @example
     * <pre name="test">
     * vuodenaika("tammi") === "talvi";
     * vuodenaika("helmi") === "talvi";
     * vuodenaika("maalis") === "kevät";
     * vuodenaika("kesä") === "kesä";
     * vuodenaika("huhti") === "kevät";
     * vuodenaika("syys") === "syksy";
     * vuodenaika("m�t�") === "???";
     * </pre>
     */
    
    //Funktiomalli luennolta
    
    public static String vuodenaika( String kuukausi) {
            
        for (int i = 0; i < kuukaudetVuodenajat[0].length; i++)
          if (kuukaudetVuodenajat[0][i].equalsIgnoreCase(kuukausi))
              return kuukaudetVuodenajat[1][i];



        return "???";
    }
    
    public static

    /**
     * @param args
     */
    public static void main(String[] args) {
        String kuukausi = "Tammi"; 
        String vuodenaika;
        vuodenaika = vuodenaika(kuukausi);
        System.out.println("Kuukausi on " + kuukausi + "kuu, " + "Nyt on siis " + vuodenaika);
    }

}