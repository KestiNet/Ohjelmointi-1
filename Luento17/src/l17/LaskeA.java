package l17;

import static Demo7.Kirjaimet.laskeKirjaimet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * laskee listasta missä sanassa on eniten valittuja kirjaimia
 * @author veli.tornikoski
 * @version 13.4.2020
 */
public class LaskeA {
    
    /**
     * Etsii tietorakenteesta missä sanassa on eniten valittuja kirjaimia
     * @param sanat tietorakenne jossa merkkijonoja
     * @param kirjain mitä haetaan
     * @return jono missä eniten merkkejä
     * @example
     * <pre name="test">
     * String[] sanat = {"koira", "syö", "muonaa", "ja", "tavaa", "javaa"};
     * etsiEniten(sanat, 'a') === "tavaa";
     * etsiEniten(sanat, 'z') === "";
     * etsiEniten(sanat, 'r') === "koira";
     * etsiEniten(sanat, 'v') === "tavaa";
     * </pre>
     */
    public static String etsiEniten(String[] sanat, char kirjain) {
        String parasSana = "";
        int parasLkm = 0;
        for ( String sana : sanat ) {
            int lkm = laskeKirjaimet(sana, kirjain);
            if (lkm > parasLkm) {
                parasLkm = lkm;
                parasSana = sana;
            }
                
        }
        return parasSana;
    }
    
    /**
     * Etsii tietorakenteesta missä sanassa on eniten valittuja kirjaimia
     * @param sanat tietorakenne jossa merkkijonoja
     * @param kirjain mitä haetaan
     * @return jono missä eniten merkkejä
     * @example
     * <pre name="test">
     * #import java.util.ArrayList;
     * #import java.util.List;
     * ArrayList<String> sanat2 = new ArrayList<String>();
     * sanat2.add("koira");
     * sanat2.add("syö");
     * sanat2.add("muonaa");
     * sanat2.add("ja");
     * sanat2.add("tavaa");
     * sanat2.add("javaa");
     * etsiEniten(sanat2, 'a') === "tavaa";
     * etsiEniten(sanat2, 'z') === "";
     * etsiEniten(sanat2, 'r') === "koira";
     * etsiEniten(sanat2, 'v') === "tavaa";
     * </pre>
     */
    public static String etsiEniten( Iterable<String> sanat, char kirjain) {
        String parasSana = "";
        int parasLkm = 0;
        for ( String sana : sanat ) {            
            //sanat.add("kana");   onnistuu, jos parametri on List; ei onnistu jo iterable
            int lkm = laskeKirjaimet(sana, kirjain);
            if (lkm > parasLkm) {
                parasLkm = lkm;
                parasSana = sana;
            }                
        }
        return parasSana;
    }
    
    /**
     * Etsii tietorakenteesta missä sanassa on eniten valittuja kirjaimia
     * @param sanat tietorakenne jossa merkkijonoja
     * @param kirjain mitä haetaan
     * @return jono missä eniten merkkejä
     * @example
     * <pre name="test">
     * #import java.util.ArrayList;
     * #import java.util.List;
     * ArrayList<String> sanat2 = new ArrayList<String>();
     * etsiEniten(sanat2, 'a') === -1;
     * sanat2.add("koira");
     * etsiEniten(sanat2, 'a') === 0;
     * sanat2.add("syö");
     * sanat2.add("muonaa");
     * etsiEniten(sanat2, 'a') === 2;
     * sanat2.add("ja");
     * etsiEniten(sanat2, 'a') === 1;

     * sanat2.add("tavaa");
     * sanat2.add("javaa");
    
     * etsiEniten(sanat2, 'z') === "";
     * etsiEniten(sanat2, 'r') === "koira";
     * etsiEniten(sanat2, 'v') === "tavaa";
     * </pre>
     */
    public static int etsiEnitenPaikka( List<String> sanat, char kirjain) {
        int parasPaikka = -1;
        int parasLkm = 0;
        for (int i = 0; i < sanat.size(); i++ ) { 
            String sana = sanat.get(i);
            int lkm = laskeKirjaimet(sana, kirjain);
            if (lkm > parasLkm) {
                parasLkm = lkm;
                parasPaikka = i;
            }                
        }
        return parasPaikka;
    }
    
 
    
    /**
     * @param args
     */
    public static void main(String[] args) {
       String[] sanat = {"koira", "syö", "muonaa", "ja", "tavaa", "javaa"};
       String sana = etsiEniten(sanat, 'a');
       System.out.println(sana);
       
       List<String> sanat2 = new ArrayList<String>();
       sanat2.add("koira");
       sanat2.add("syö");
       sanat2.add("muonaa");
       sanat2.add("ja");
       sanat2.add("tavaa");
       sanat2.add("javaa");
       
       String sana2 = etsiEniten(sanat2, 'a');
       System.out.println(sana2);
       int lkm = sanat2.size();
       System.out.println(lkm);
       Collections.sort(sanat2);
       System.out.println(sanat2);
       
       int i = sanat2.indexOf("javaa"); // pienillä tavaa
       if (i < 0) {
           System.out.println("Ei löydy");
           return;
       }
      
      sana2 = sana2.toUpperCase();
      sanat2.set(i, sana2);
       
       
       System.out.println(sanat2);
       sanat2.remove(sana2);
       System.out.println(sanat2);
       
       int enitenPaikka = etsiEnitenPaikka(sanat2, 'a');
       
 

 
    }

}