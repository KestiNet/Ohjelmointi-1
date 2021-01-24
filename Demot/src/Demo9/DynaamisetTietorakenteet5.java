package Demo9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * laskee listasta missä sanassa on eniten valittuja kirjaimia
 * @author veli.tornikoski
 * @version 13.4.2020
 */
public class DynaamisetTietorakenteet5 {
    
   
    /**
     * @param sanat
     * @param kirjain
     * @return parasSana
     */
    public static String etsiEniten(List<String> sanat) {
        String parasSana = "";
        int parasLkm = 0;
        for ( String sana : sanat ) {
            int lkm = sana.length();
            if (lkm > parasLkm) {
                parasLkm = lkm;
                parasSana = sana;
            }
                
        }
        return parasSana;
    }
    
    /**
     * @param sanat
     * @param pituus
     * @return null
     */
    public static String kopioi(List<String> sanat, int pituus) {
        List<String> pitkäSana = new ArrayList<String>();
    	for (String sana : sanat) {
    		int sananPituus = sana.length();
    		if (sananPituus ==  pituus) {
    			pitkäSana.add(sana);
    		}
    		System.out.println(pitkäSana);
    	}
    	
		return null;
    	
    	
    }
    

    /**
     * @param args
     */
    public static void main(String[] args) {
   
       
       List<String> sanat = new ArrayList<String>();
       sanat.add("koira");
       sanat.add("syö");
       sanat.add("muonaa");
       sanat.add("jatekeevaikka");
       sanat.add("tavaa");
       sanat.add("javaa");
       
       String sana2 = etsiEniten(sanat);
       Collections.sort(sanat);
       
      
       
       int i = sanat.indexOf("javaa");  
       if ( i < 0 ) {
           System.out.println("Ei löydy");
           return;
       }
       
       
       System.out.println(sanat);
       sanat.remove(sana2);
       System.out.println(sanat);
       
       kopioi(sanat, 6);
       
    }

}