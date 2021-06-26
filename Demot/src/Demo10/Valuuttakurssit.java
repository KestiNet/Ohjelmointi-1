package Demo10;


import fi.jyu.mit.ohj2.*;
import java.util.Scanner;


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
	 */
	public static void tulostaValuutat(List<String> rivit) {
		String syote = Syotto.kysy("anna valuuttakurssi: ");
		String valuutta = syote.toString();
		
		for(String rivi : rivit) {
			System.out.println(rivi);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 List<String>rivit = Tiedosto.lueTiedostoListaan("commercialTransaction.csv");
		 
		 
		 
		 tulostaValuutat(rivit);
		}
	
}



