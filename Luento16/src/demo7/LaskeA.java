package demo7;
import static demo7.Laskekirjaimet.etsiEniten;

/**
 * Laskee listasta missä sanassa on eniten valittuja kirjaimia
 * @author esakesti
 *
 */
public class LaskeA {
	
	/**
	 * Etsii tietorakenteesta missä sanassa on eniten valittuja kirjaimia
	 * @param sanat tietorakenne jossa merkkijonoja
	 * @param kirjain mitä haetaan
	 * @return jono missä eniten merkkejä
	 * 
	 */
	public static String etsiEniten(String[] sanat, char kirjain) {
		String parasSana = "";
		int parasLKM = 0;
		for (String sana : sanat) {
			int lkm = etsiEniten(sana, kirjain);
			 
	            }
		}
		return "koira";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] sanat = {"koira", "syö", "muonaa", "ja", "tavaa", "javaa"};
		String sana = etsiEniten(sanat, 'a');
		System.out.println(sana);

	}

}
