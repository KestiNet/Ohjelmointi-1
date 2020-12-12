package Demo8;

/**
 * @author esakesti
 *
 */
public class vuodenaikaFunktio {
	  
	//taulukko täytetty kaikilla kuukausilla
	 
    private static final String [][] kuukaudetVuodenajat =
       { {"tammi","helmi","maalis","huhti","touko","kesä","heinä","elo","syys","loka","marras","joulu"},
         {"talvi","talvi","kevät","kevät","kevät","kesä","kesä", "kesä","syksy","syksy", "syksy","talvi"}
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
    
    //Funktiomalli luennolta, 
    
    public static String vuodenaika( String kuukausi) {
            
        for (int i = 0; i < kuukaudetVuodenajat[0].length; i++)
          if (kuukaudetVuodenajat[0][i].equalsIgnoreCase(kuukausi))
              return kuukaudetVuodenajat[1][i];



        return "???";
    }
    
    
    
    /**
     * Vertaa kuukausi2 parametrinä tuotua arvoa, jos arvo vastaa 
     * tiettyä kuukautta, palauttaa vastaavan vuodenajan
     * @param kuukausi2
     * @return null
     */
    public static String vuodenAika2(String kuukausi2) {
    	
    	if (kuukausi2.equalsIgnoreCase("Tammikuu")) 
    		return "Talvi";
    	
    	else if(kuukausi2.equalsIgnoreCase("Helmikuu")) 
    		return "Talvi";
    	
    	else if(kuukausi2.equalsIgnoreCase("Maaliskuu")) 
    		return "Kevät";
    	
    	else if(kuukausi2.equalsIgnoreCase("Huhtikuu")) 
    		return "Kevät";
    	
    	else if(kuukausi2.equalsIgnoreCase("Toukokuu")) 
    		return "Kevät";
    	
    	else if(kuukausi2.equalsIgnoreCase("Kesäkuu")) 
    		return "Kesä";
    	
    	else if(kuukausi2.equalsIgnoreCase("Heinäkuu")) 
    		return "Kesä";
    	
    	else if(kuukausi2.equalsIgnoreCase("Elokuu")) 
    		return "Kesä";
    	
    	else if(kuukausi2.equalsIgnoreCase("Syyskuu")) 
    		return "Syksy";
    	
    	else if(kuukausi2.equalsIgnoreCase("Lokakuu")) 
    		return "Syksy";
    	
    	else if(kuukausi2.equalsIgnoreCase("Marraskuu")) 
    		return "Syksy";
    	
    	else if(kuukausi2.equalsIgnoreCase("Joulukuu")) 
    		return "Talvi";
    	
    	
		return null;
    	
    }
    	
  

    /**
     * Switch funktio joka vertaa annettua parametriä kuukauteen ja palauttaa vastaavan kuukauden 
     * vuoden ajan ja tulostaa sen
     * @param kuukausi3
     * @return vuodenaika
     */
    public static String vuodenAika3(String kuukausi3) {
    	   String vuodenaika = "";
    	   switch(vuodenaika) {
    	      
    	   case "tammikuu":
    	         vuodenaika = "Talvi";
    	         break;

    	      case "helmikuu":
     	         vuodenaika = "Talvi";
     	         break;

    	      case "maaliskuu":
     	         vuodenaika = "Kevät";
     	         break;

    	      case "huhtikuu":
     	         vuodenaika = "Kevät";
     	         break;

    	      case "toukokuu":
     	         vuodenaika = "Kevät";
     	         break;

    	      case "kesäkuu":
     	         vuodenaika = "Kesä";
     	         break;
     	         
    	      case "heinäkuu":
     	         vuodenaika = "Kesä";
     	         break;
    	     
    	      case "elokuu":
     	         vuodenaika = "Kesä";
     	         break;
    	      
    	      case "syyskuu":
     	         vuodenaika = "Syksy";
     	         break;
    	      
    	      case "lokakuu":
     	         vuodenaika = "Syksy";
     	         break;
    	      
    	      case "marraskuu":
     	         vuodenaika = "Syksy";
     	         break;
    	      
    	      case "joulukuu":
     	         vuodenaika = "Talvi";
     	         break;

    	      default:
    	        vuodenaika = "Virheellinen arvo";
    	   }
    	   return vuodenaika;
    	}


	/**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        String kuukausi = "touko"; 
        String vuodenaika;
        vuodenaika = vuodenaika(kuukausi);
        System.out.println("Kuukausi on " + kuukausi + "kuu, " + "Nyt on siis " + vuodenaika);
        
       
        String kuukausi2 = "tammikuu";
        System.out.println("Kuukausi on:  "  +  kuukausi2 + ","+ " nyt on: " + vuodenAika2(kuukausi2));
        
        String kuukausi3 = "joulukuu";
        System.out.println("Kuukausi on:  "  +  kuukausi3 + ","+ " nyt on: " + vuodenAika2(kuukausi3));
    }

}