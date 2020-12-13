package Demo8;


/**
 * @author esakesti
 *
 */
public class karkausVuosi {
	
	/**
	 * Tarkistaa aluksi onko vuosi neljällä jaollinen, tarkistaa myös onko vuosisata ja onko vuosisata jaollinen 400, jos on silloin on karkausvuosi
	 * 
	 * @param vuosi
	 */
	public static  void karkausvuosi(int vuosi) {
	boolean karkausvuosi;	
	
    if (vuosi % 4 == 0) {

      if (vuosi % 100 == 0) {
    	  if (vuosi % 400 == 0)
          karkausvuosi = true;
        else
          karkausvuosi = false;
      }
      
      else
        karkausvuosi = true;
    }
    
    else
      karkausvuosi = false;

    if (karkausvuosi)
      System.out.println("Vuosi: " + vuosi + " on karkausvuosi");
    else
      System.out.println("Vuosi: " + vuosi + " EI ole  karkausvuosi");
  }

	/**
	 * @param args ei käytössä
	 */
	public static void main(String[] args) {
		int vuosi = 1987;
		karkausvuosi(vuosi);

		;
		
	}

}
