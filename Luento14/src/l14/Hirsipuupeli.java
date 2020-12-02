package l14;

import fi.jyu.mit.graphics.BasicShape;
import fi.jyu.mit.graphics.Circle;
import fi.jyu.mit.graphics.Line;
import fi.jyu.mit.graphics.Window;
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
    
    private static final BasicShape[] hirrenOsat = {
            new Circle(0,0,1),
            new Line(0,1,0,7),
            new Line(0,7,3,7),
            new Line(3,7,3,6),
            new Circle(3,5,5,0,5),
            new Line(3,5,3,3),
            new Line(3,3,2,1),
            new Line(3,3,4,1),
            new Line(2,4.5,4, 4.5),
         };
    
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
       return tulos;
       
   }
    
   /**
    * katsoo montako kertaa kirjain esiintyy sanassa
    * Vaihtaa tulos-jonon vastinpaikkoihin kirjaimen
 * @param kirjain tutkittava kirjain
 * @param sana jossa tutkittava sana
 * @param tulos jono johon vaihdetaan oikeat kirjaimet pakalleen
 * @return tulosjonossa vaihdettujen lukumäärä
 * @example
 *<pre>
 *tutkittava jono:
 *</pre>
 * <pre name="test">
 * String sana = "kissa";
 * StringBuilder tulos = new StringBuilder("___");
 * tutkiOikeat('x', sana, tulos) === 0;
 * tutkiOikeat('s', sana, tulos) === 1; tulos.toString() === "__s";
 * tutkiOikeat('k', sana, tulos) === 1;tulos.toString() === "k_s";
 * tutkiOikeat('i', sana, tulos) === 1; tulos.toString() === "kis";
 * tutkiOikeat('i', sana, tulos) === 0; sana.equals( tulos.toString());
 * 
 * StringBuilder tulos2 = new StringBuilder("_____");
 * tutkiOikeat('s', sana, tulos2) === 2; tulos.toString() == "__ss_";
 * tutkiOikeat('a', sana, tulos2) === 2; tulos.toString() == "__ss_";

 * </pre>
 */
public static int tutkiOikeat(char kirjain, String sana, StringBuilder tulos) {
    int pituus = Math.min(sana.length(), tulos.length());
    
    int lkm = 0;
    for (int i = 0; i< pituus; i++) {
        if (sana.charAt(i)== kirjain && tulos.charAt(i) != kirjain) {
            lkm++;
            tulos.setCharAt(i, kirjain);
        }
    }
    
    return lkm;
   }
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        final int MAXVAARIA = hirrenOsat.length; // TODO: Muuta, että tulee pelin käynnistyksestä
        logo();
        String sana = "kissa"; // TODO : hae oikeasti satunnainen sana jostain
        StringBuilder tulos = luoTulosjono(sana);
        int oikeita = 0;
        StringBuilder vaaria = new StringBuilder("");
        
        Window ikkuna = new Window(400,400);
        ikkuna.scale(0,0,10,10);
       
        ikkuna.showWindow();
        
        int osanPaikka = 0;
        
        
        while (true) {
            System.out.println("Sana: " + harvakseen(tulos)); // _ _ _ _ _

            String jono = Syotto.kysy("Anna kirjain");
            if (jono.length() == 0)
                continue;
            if(jono.equals("loppu"))
                break;
                
            char kirjain = jono.charAt(0);
            System.out.println("Annoint kirjaimen " + kirjain);
            
            // kissa k lkm <- 1 k____
            int lkm = tutkiOikeat(kirjain, sana, tulos);
            oikeita += lkm;
            
            if(lkm == 0) {
                if (vaaria.indexOf("", kirjain) >=0)
                    continue;
                vaaria.append(kirjain);
                System.out.printf("Virheitä:%d/%d%n", vaaria.length(), MAXVAARIA);
                System.out.println("Vääriä kirjaimia: " + harvakseen(vaaria));
                ikkuna.add(hirrenOsat[osanPaikka]);
                osanPaikka++;
            }
            
            if(vaaria.length() == MAXVAARIA) {
                System.out.println("Hävisit!");
                break;
            }
            
            if (oikeita >= sana.length() ) {
                System.out.println("Voitit");
                break;
            }
            // jatketaan hirttämistä
        }
        System.out.println("Sana: " + sana);

}
}
