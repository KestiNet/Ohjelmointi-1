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
	public static void tulostaValuutat(List<String>rivit) {
		for (String raha : rivit) {
			System.out.println(raha);
		}
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
		 
			
		 
		 tulostaValuutat(rivit);
		}
	
}



