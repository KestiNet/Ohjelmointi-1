package l13;

import fi.jyu.mit.ohj2.Syotto;

/**
 * Hirsipuupeli. Tekstiversio pelistä
 * @author Esa Kesti
 * @version 2 Aug 2020
 */

    /**
     * 
     * <pre>
     * Hirsipuu-peli
     * =============
     *
     *
     * Sana: _ _ _ _ _
     * Anna kirjain >k[ret]
     * Annoit kirjaimen k
     *
     *Sana: k _ _ _ _
     *Anna kirjain >ö[ret]
     *Annoit kirjaimen ö
     *Virheitä: 1/6
     *Vääriä kirjaimia: ö
     *
     *Sana: k _ _ _ _
     *Anna kirjain >i[ret]
     *Annoit kirjaimen i
     *
     *Sana: k i _ _ _
     *Anna kirjain >a[ret]
     *Annoit kirjaimen a
     *
     *Sana: k i _ _ a
     *Anna kirjain >p[ret]
     *Annoit kirjaimen p
     *Virheitä: 2/6
     *Vääriä kirjaimia: ö p
     *
     *Sana: k i _ _ a
     *Anna kirjain >s[ret]
     *Annoit kirjaimen s
     *Voitit!
     *Sana: kissa
     *</pre>
     */
public class Hirsipuupeli {
    
    /**
     * Tulostaa ohjelman ohjeet
     */
    private static void logo() {
        System.out.println("Hirsipuu-peli\n=============");
        
    }

    /**
     * Palauttaa sanan niin, että joka toisessa välissä on tyhjä
     * @param sana 
     * @return sana harvennettuna
     * @example
     * <pre name="test">
     * harvakseen("") === "";
     * harvakseen("kissa") === "k i s s a";
     * </pre>
     */
    public static String harvakseen(String sana ) {
        int pituus = sana.length();
        StringBuilder tulos = new StringBuilder(pituus*2);
        String vali = "";
        for(int i = 0; i < pituus; i++) {
            char c = sana.charAt(i);
            tulos.append(vali );
            tulos.append(c);
            vali = " ";
        }
        return tulos.toString();
    }
    
    
    /**
     * Palauttaa sanan niin, että joka toisessa välissä on tyhjä
     * @param sana 
     * @return sana harvennettuna
     * @example
     * <pre name="test">
     * harvakseen("") === "";
     * harvakseen("kissa") === "k i s s a";
     * </pre>
     */
   public static String harvakseen(StringBuilder sana ) {
       return harvakseen(sana.toString());
      
   }
    
   /**
    * Luo sanan mittaisen jonon jossa joka merkki on alleviivattu
    * @param sana annettu sana
    * @return alleviivoille täytetty jono
    * <@example
    * <pre name="test">
    * luoTulosjono("").toString() === "";
    * luoTulosjono("k").toString() === "_";
    * luoTulosjono("kissa").toString() === "_____";

    * </pre>
    */
   public static StringBuilder luoTulosjono(String sana) {
       StringBuilder tulos = new StringBuilder(sana);
       for(int i = 0; i < tulos.length(); i++)
           tulos.setCharAt(i, '_');
        tulos;
       
   }
    
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        logo();
        String sana = "kissa"; // TODO : hae oikeasti satunnainen sana jostain
        StringBuilder tulos = luoTulosjono(sana);
        int oikeita = 0;
        while (true) {
            System.out.println("Sana: " + harvakseen(tulos)); // _ _ _ _ _

            String jono = Syotto.kysy("Anna kirjain");
            if (jono.length() == 0)
                continue;
            if(jono.equals("loppu"))
                break;
                
            char kirjain = jono.charAt(0);
            System.out.println("Annoint kirjaimen " + kirjain);
            
            int lkm = tutkiOikeat(kirjain, sana, tulos);
            oikeita += lkm;
            
            if (oikeita >= sana.length() ) {
                System.out.println("Voitit");
                break;
            }
            // jatketaan hirttämistä
        }
        System.out.println("Sana: " + sana);

}
}
