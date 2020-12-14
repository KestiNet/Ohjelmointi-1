package Demo8;



import java.util.Random;

import fi.jyu.mit.graphics.Axis;
import fi.jyu.mit.graphics.BasicShape;
import fi.jyu.mit.graphics.Circle;
import fi.jyu.mit.graphics.Line;
import fi.jyu.mit.graphics.Rotator;
import fi.jyu.mit.graphics.Window;
import fi.jyu.mit.ohj2.Syotto;
import fi.jyu.mit.ohj2.Tiedosto;

/**
 * Hirspuupeli. tekstiversio pelistä
 * @author veli.tornikoski
 * @version 31.3.2020
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
 *
 * ....
 * 
 * Sana: k i _ _ a
 * Anna kirjain >s[ret]
 * Annoit kirjaimen ä
 * Virheitä: 6/6
 * Vääriä kirjaimia: ö p c g y ä
 * Hävisit!
 * Sana: kissa
 *</pre>
 */
public class hirsipuu {
    
    /**
     * Hirren osat taulukossa
     */
    public static final BasicShape[] hirrenOsat = {
        new Circle(0,0,1),
        new Line(0,1,0,7),
        new Line(0,7,3,7),
        new Line(3,7,3,6),
        new Circle(3,5.5,0.5),
        new Line(3,5,3,3),
        new Line(3,3,2,1),
        new Line(3,3,4,1),
        new Line(2,4.5,4,4.5)
     };
    
    /**
     * Tulostaa ohjelman ohjeet
     */
    private static void logo() {
        System.out.println("Hirsipuu-peli\n=============");        
    }
    
    /**
     * Palauttaa sanan niin, että joka toisessa välissä on tyhjä
     * @param sana harvenettava sana
     * @return sana harvennettuna
     * @example
     * <pre name="test">
     *  harvakseen("") === "";
     *  harvakseen("k") === "k";
     *  harvakseen("kissa") === "k i s s a";  
     * </pre>
     */
    public static String harvakseen( String sana ) {
        int pituus = sana.length();
        StringBuilder tulos = new StringBuilder(pituus*2);
        String vali = "";
        for( int i = 0; i < pituus; i++ ) {
           char c = sana.charAt(i);
           tulos.append(vali);
           tulos.append(c);
           vali = " ";
        }
        return tulos.toString();
    }
    
    /**
     * Palauttaa sanan niin, että joka toisessa välissä on tyhjä
     * @param sana harvenettava sana
     * @return sana harvennettuna
     * @example
     * <pre name="test">
     *  harvakseen("") === "";
     *  harvakseen("k") === "k";
     *  harvakseen("kissa") === "k i s s a";  
     * </pre>
     */
    public static String harvakseen( StringBuilder sana ) {
        return harvakseen(sana.toString());
    }
    
    /**
     * Luok sanan mittaisen jonon jossa joka merkki on _
     * @param sana annettu sana
     * @return alleviivoille täytetty jono
     * @example
     * <pre name="test">
     * luoTulosjono("").toString() === "";
     * luoTulosjono("k").toString() === "_";
     * luoTulosjono("kissa").toString() === "_____";
     * </pre>
     */
    public static StringBuilder luoTulosjono(String sana) {
        StringBuilder tulos = new StringBuilder(sana);
        for( int i = 0; i < tulos.length(); i++ )
            tulos.setCharAt(i, '_');
        return tulos;
    }
    
    /**
     * Katsoo montako kertaa kirjain esiintyy sanassa
     * Vaihtaa tulos-jonon vastinpaikkoijin kirjaimen
     * @param kirjain tutkittava kirjain
     * @param sana jossa tutkittava sana
     * @param tulos jono johon vaihdetaan oikeat kirjaimet paikalleen
     * @param taytemerkki kirjaimen kohdalla käytettävä merkki jota ei vielä arvattu
     * @return tulosjonossa vaihdettujen lukumäärä
     * @example
     * <pre>
     * tutkittava jono:
     * kissa
     * kirjain:
     * i
     * _i___
     * </pre>
     * <pre name="test">
     * String sana = "kissa";
     * StringBuilder tulos = new StringBuilder("___"); // 3 kpl
     * tutkiOikeat('x', sana, tulos) === 0;
     * tutkiOikeat('s', sana, tulos) === 1; tulos.toString() === "__s";
     * tutkiOikeat('k', sana, tulos) === 1; tulos.toString() === "k_s";
     * tutkiOikeat('i', sana, tulos) === 1; tulos.toString() === "kis";
     * tutkiOikeat('i', sana, tulos) === 0; sana.equals( tulos.toString() );
     * 
     * StringBuilder tulos2 = new StringBuilder("_____");  // 5 kpl
     * tutkiOikeat('s', sana, tulos2) === 2; tulos2.toString() === "__ss_";
     * tutkiOikeat('a', "kis", tulos2) === 0; tulos2.toString() === "__ss_";
     * </pre>  
     */
    public static int tutkiOikeat(char kirjain, String sana, StringBuilder tulos, char taytemerkki) {
        int pituus = Math.min(sana.length(), tulos.length());
        
        int lkm = 0;
        char isoKirjain = Character.toUpperCase(kirjain);
        for ( int i = 0; i < pituus; i++ ) {
            char c = Character.toUpperCase( sana.charAt(i));
            if ( c == isoKirjain && tulos.charAt(i) == taytemerkki ) {
                lkm++;
                tulos.setCharAt(i, kirjain);                
            }
        }                   
        return lkm;
    }
    
    /**
     * Arpoo satunnaisen sanan taulukosta 
     * @param taulukko merkkijonoista
     * @return arvottu merkkijono
     */
    public static String arvo(String[] taulukko) {        
        Random rand = new Random();   // satluku generaattori
        int i = 0;
        while (i < 1000) {
            int n = rand.nextInt(taulukko.length);   // eli 0:sta, maksimissaan taulukon viimeinen alkio
            String jono = taulukko[n].trim();
            if(jono.length() > 0 )
                return jono;
            i++;
        }
        return "kissa";
        
    }
    /**
     * Pelaa yhden hirsipuu peli
     * @param sana arvuuteltava sana
     */
    public static void pelaaPeli(String sana) {
        StringBuilder tulos = luoTulosjono(sana);
        int oikeita = 0;
        StringBuilder vaaria = new StringBuilder("");
        
        final int MAXVAARIA = hirrenOsat.length;;  // TODO: muuta että tulee pelin käynnistyksestä
        char taytemerkki = '_';
        
        Window ikkuna = new Window(400,400);
        ikkuna.scale(0,0,10,10);       
        ikkuna.showWindow();
        
        int osanPaikka = 0;
        
        while ( true ) {
            System.out.println("Sana: " + harvakseen(tulos)); //_ _ _ _ _

            String jono = Syotto.kysy("Anna kirjain");
            if (jono.length() == 0 )
                continue;
            if (jono.equalsIgnoreCase("loppu"))     //lisätty equalsIgnoreCase, tämän jälkeen ei pitäisi olla merkitystä onko iso vai pieni kirjain
                break;

            char kirjain = jono.charAt(0);
            System.out.println("Annoit kirjaimen "+ kirjain);
            
            // kissa  k    lkm <- 1   _____ => k____
            int lkm = tutkiOikeat(kirjain, sana, tulos, taytemerkki);
            oikeita += lkm;
            
            if( lkm == 0) {
                if( vaaria.indexOf("" + kirjain) >= 0)
                    continue;
                vaaria.append(kirjain);
                System.out.printf("Virheitä: %d/%d%n", vaaria.length(), MAXVAARIA );
                System.out.println("Vääriä kirjaimia: " + harvakseen(vaaria));
                ikkuna.add(hirrenOsat[osanPaikka]);
                osanPaikka++;
                
            }
            
            if ( vaaria.length() ==  MAXVAARIA) {
                new Rotator(ikkuna, Axis.Y, 5, 100);
                System.out.println("Hävisit!");
                break;
            }
                        
            if  ( oikeita >= sana.length() ){
                System.out.println("Voitit!");                
                break;
            }
            // jatketaan hirttämistä

        }
        System.out.println("Sana: " + sana);

    }
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        
        logo();        
        String sana = "kissa";
        String[] sanat = Tiedosto.lueNetista("http://luna.chydenius.fi/~vtorniko/kurssit/ohj1/luennot/luento15/sanat.txt");
        if (sanat != null)
            sana = arvo(sanat);
        pelaaPeli(sana);
        
    }

}