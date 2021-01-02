package l18;

import fi.jyu.mit.ohj2.Syotto;
import fi.jyu.mit.ohj2.Tiedosto;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;



/**
 * @author esakesti
 *
 */

public class EtsiSanaa {

	/**
	 * tulostaa kunkin rivin omalle rivilleen
	 * @param rivit lista rivit
	 */
	public static void tulostaRivit(List<String> rivit) {
		for(String rivi : rivit) {
			System.out.println(rivi);
		}
		
	}


	
	/**
	 * Etsii listasta kaikki sanat jotka alkavat samalla tavalla kuin sana
	 * @param kaikkiSanat lista kaikista sanoista
	 * @param sana etsittävä sanan alkuosa
	 * @return palauttaa listan alkavista sanoista
	 * @example
	 * <pre name ="test">
	 * #import java.util.*;
	 * 	List<String> kaikkiSanat = new ArrayList();
	 * 	kaikkiSanat.add("Kissa");
	 * 	kaikkiSanat.add("istuu");
	 * 	kaikkiSanat.add("Katsoo");
	 * 	kaikkiSanat.add("Koiraa");
	 * 	kaikkiSanat.add("ja");
	 * 	kaikkiSanat.add("Karkaa");
	 * List<String> sanat = etsiSopivat(kaikkiSanat, "k");
	 *  sanat.size() === 4;
	 *  sanat.toString() === "[kissa, katsoo, koiraa, karkaa]";
	 *  sanat = etsiSopivat(kaikkiSanat, "kA");
  	 *  sanat.toString() === "[katsoo, karkaa]";
  	 *  sanat = etsiSopivat(kaikkiSanat, "kAt");
  	 *  sanat.toString() === "[katsoo]";
   	 *  sanat = etsiSopivat(kaikkiSanat, "kAts");
  	 *  sanat.toString() === "[katsoo]";
   	 *  sanat = etsiSopivat(kaikkiSanat, "kAtk");
   	 *  sanat.toString() === "[]";
   	 *  sanat.size() === 0;
   	 *  sanat = etsiSopivat(kaikkiSanat, "j");
   	 *  sanat.toString() === "[ja]";
   	 *  sanat = etsiSopivat(kaikkiSanat, "");
   	 *  sanat.size() === 6;
	 * </pre>
	 */
	public static List<String> etsiSopivat(List<String> kaikkiSanat, String sana){
		List<String> sanat = new ArrayList<String>();
		String isoSana = sana.toUpperCase()
;		for (String jono : kaikkiSanat) {
			String isoJono = jono.toUpperCase();
		
			if (isoJono.startsWith(isoSana))
				sanat.add(jono);
}
		return null;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args){
		List<String> kaikkiSanat = Tiedosto.lueNetistaListaan("http://terra.chydenius.fi/~vtorniko/kurssit/ohj1/luennot/luento18/sanat.txt"); 	
		tulostaRivit(kaikkiSanat);
		String sana = "";
		while ( true ) {
			String jono = Syotto.kysy("Anna kirjain");
			if (jono.length() == 0) break;
			sana += jono;
			System.out.println("Sana = " + sana);
			List<String> sanat = etsiSopivat(kaikkiSanat, sana);
			int n = sanat.size();
			if(n > 10)
				System.out.println("näin alkavia sanoja oli yli 10 kappaletta" + n + " kappaletta");
			else
			tulostaRivit(sanat);
		}
		
	}
	}