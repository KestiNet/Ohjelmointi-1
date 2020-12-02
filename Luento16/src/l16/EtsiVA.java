package l16;

/**
 * @author Esa Kesti
 * @version 16 Nov 2020
 */
public class EtsiVA {
  
 
    private static final String [][] kuut =
       { {"tammi", "helmi","maalis","huhti", "kesä", "syys",},
         {"talvi", "talvi", "kevät", "kevät", "kesä", "syksy"}
       };      
    
    /**
     * Palauttaa kuukauden nimeä vastaavan vuodenajan tekstinä
     * @param knimi kuukauden nimi
     * @return vuodenaika tekstinä
     * @example
     * <pre name="test">
     * vuodenaika("tammi") === "talvi";
     * vuodenaika("helmi") === "talvi";
     * vuodenaika("maalis") === "kevät";
     * vuodenaika("kesä") === "kesä";
     * vuodenaika("huhti") === "kevät";
     * vuodenaika("syys") === "syksy";
     * vuodenaika("mätä") === "???";
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
        String kNimi = "helmi"; //Tullut netistä, tiedostosta tai jostain muualta
        String vaika;
        vaika = vuodenaika(kNimi);
        System.out.println("Kuukausi on " + kNimi + "kuu, " + "Nyt on siis " + vaika);
    }

}
