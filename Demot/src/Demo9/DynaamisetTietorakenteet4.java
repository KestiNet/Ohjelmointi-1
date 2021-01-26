package Demo9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author Esa Kesti
 * @version 20.01.2021
 */
public class DynaamisetTietorakenteet4 {
    
   
    /**
     * @param sanat lista pääohjelmasta, tarkistetaan missä sanassa on eniten kirjaimia 
     * @return ja palautetaan parasSana
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
     * @param args
     * lisätään lista tietorakenteeseen sanoja joista lasketaan aliohjelmassa pisin 
     * poistetaan pisin sana tietorakenteesta.
     */
    public static void main(String[] args) {
   
       
       List<String> sanat = new ArrayList<String>();
       sanat.add("koira");
       sanat.add("syö");
       sanat.add("muonaa");
       sanat.add("jatekeevaikka");
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
       
       
       
    }

}