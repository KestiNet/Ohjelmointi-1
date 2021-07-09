package Demo10;


import fi.jyu.mit.ohj2.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Lukee CSV tidostosta valuuttakursseja ja pyyt‰‰ k‰ytt‰j‰lt‰
 * tietty‰ kurssia ja tulostaa sen ruudulle
 * @author esakesti
 *
 */
public class Valuuttakurssit {
	
	/**
	 * Tulostaa valuutat.csv tiedoston 
	 * @param rivit 
	 * 
	 * 
	 */
	
	public static void tulostaKurssit(List<String> rivit) {
		for (String rivi:rivit) {
			System.out.println(rivi);
		}
	}
	
	public static List<String> valuuttakurssi(List<String> rivit, String vKurssi){
		List<String> valuutat = new ArrayList<String>();
		String isoValuutta = vKurssi.toUpperCase(); 
			for (String arvo : rivit) {
				String kArvo = arvo.toUpperCase();
				
				if (kArvo.startsWith(isoValuutta))
					valuutat.add(arvo);
			}
			
			return valuutat;
		}
		
		
	
	
	
	/**
	 * @param args
	 */
	
	/**
	 * Reads the CSV file to a list
	 * 
	 */
	public static void main(String[] args) {
		 List<String>rivit = Tiedosto.lueTiedostoListaan("commercialTransaction.csv");
		 String vKurssi= "";
			while (true) {
				String kysymys = Syotto.kysy("Anna valuuttakurssi: ");
				if(kysymys.length() == 0) break;
				vKurssi += kysymys;
				System.out.println("valuutta kurssi on: " + vKurssi);
				List<String> sanat = valuuttakurssi(rivit, vKurssi);
				
				tulostaKurssit(sanat);
			}
		 
		
		}
	
}



