package Demo4;

import fi.jyu.mit.ohj2.*;

/**
 * @author Esa Kesti
 * @version 30 Jun 2020
 */
public class StringBuilder {
  

    public StringBuilder(String nimi) {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String nimi = Syotto.kysy("Anna sukunimi etunimi");
        StringBuilder sb = new StringBuilder();
        poistaEkaSana(sb);
        
        System.out.println("Terve, etunimesi on siis " + sb);
        String sukunimi = annaEkaSana(nimi);
        System.out.println("ja sukunimesi on siis " + sukunimi);
    }
    
    /**
     * @param enimi
     * @return eka
     */
    public static String annaEkaSana(String enimi) {
        int paikka = enimi.indexOf(' ');
        String eka = enimi.substring(0, paikka);
        return eka;
    }
    
    /**
     * @param sb
     * @return 
     */
    public static String poistaEkaSana(StringBuilder sb) {
        String bs = sb.toString();
        int poisto = bs.indexOf(" ");
        StringBuilder poistaEkaSana = sb.delete(0, poisto);

        }
   
   /**
    public static String poistaEkaSana(StringBuilder sb) {
        int poisto = sb.indexOf(" ");
        StringBuilder poistaEkaSana = sb.delete(0, poisto);

        }
        */
    }
        
 


}
