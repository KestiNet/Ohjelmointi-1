package demo7;

/**
 * Tutikaan taulukosta etsimistä
 * @author esakesti
 *
 */
public class EtsiVA {
	
	private static final String [][] kuut = 
		{{"tammi", "helmi", "maalis", "huhti"},
		 {"talvi", "tavli", "kevät", "kevät",}
		};
	
	
	/**
	 * Palauttaa kuukauden nimeä vastaavan vuodenajan tekstinä
	 * @param kNimi 
	 * @param knimi kuukauden nimi
	 * @return vuodenaika tekstinä
	 * @example
	 * <pre name="test">
	 * vuodenAika("tammi") === "talvi";
	 * vuodenAika("helmi") === "talvi";
	 * vuodenAika("maalis") === "kevät";
	 * vuodenAika("huhti") === "kevät";
	 * vuodenAika("syys") === "syksy";
	 * vuodenAika("mätä") === "???";
	 * </pre>
	 * 
	 */
	public static String vuodenAika(String kNimi) {
		for(int i = 0; i < kuut[0].length; i++)
			if (kuut[0][i].equals(kNimi))
				return kuut[1][i];
		
		return "";
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String kNimi = "helmi"; //tullut netistä, tiedostosta
		String vaika;
		vaika = vuodenAika(kNimi);
		System.out.println("Kuukausi on " + kNimi + "kuu, " + "Nyt on siis " + vaika);
	}

}
