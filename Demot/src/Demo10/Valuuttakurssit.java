package Demo10;


import fi.jyu.mit.ohj2.Tiedosto;


import java.util.List;

/**
 * Lukee CSV tidostosta valuuttakursseja ja pyytää käyttäjältä
 * tiettyä kurssia ja tulostaa sen ruudulle
 * @author esakesti
 *
 */
public class Valuuttakurssit {
	
	/**
	 * Tulostaa valuutat.csv tiedoston 
	 * @param rivit 
	 * 
	 */
	public static void tulostaValuutat(List<String> rivit) {
		for(String rivi : rivit) {
			System.out.println(rivi);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 List<String>rivit = Tiedosto.lueTiedostoListaan("valuutat.csv");
		 
		 tulostaValuutat(rivit);
		}
	
}


