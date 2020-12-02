package l11;
/**
 * Lis‰‰ ehtolauseista...
 * @author veli.tornikoski
 * @version 10.3.2020
 */
public class Ehdot {
    
    //                                          0             1         2         3          4              5      
    public static final String[] ARVOSANAT = {"Hyl‰tty","V‰ltt‰v‰","Tyydytt‰v‰","Hyv‰", "Kiitett‰v‰", "Erinomainen", "Superi"  };
    /**
     * Palauttaa parametrina saamansa numeroarvosanan kirjallisena.
     * @param numero tenttiarvosana numerona
     * @return tenttiarvosana kirjallisena
     * @example
     * <pre name="test">
     *   kirjallinenArvosana(0) === "Hyl‰tty";
     *   kirjallinenArvosana(1) === "V‰ltt‰v‰";
     *   kirjallinenArvosana(2) === "Tyydytt‰v‰";
     *   kirjallinenArvosana(3) === "Hyv‰";
     *   kirjallinenArvosana(4) === "Kiitett‰v‰";
     *   kirjallinenArvosana(5) === "Erinomainen";
     *   kirjallinenArvosana(-1) === "Virheellinen arvosana";
     *   kirjallinenArvosana(10) === "Virheellinen arvosana";
     *   
     * </pre>
     */
    public static String kirjallinenArvosana(int numero) {
        String arvosana = "";
        switch(numero) {
           case 0:
              arvosana = "Hyl‰tty";
              break;

           case 1:
              arvosana = "V‰ltt‰v‰";
              break;

           case 2:
              arvosana = "Tyydytt‰v‰";
              break;

           case 3:
              arvosana = "Hyv‰";
              break;

           case 4:
              arvosana = "Kiitett‰v‰";
              break;

           case 5:
              arvosana = "Erinomainen";
              break;

           default:
              arvosana = "Virheellinen arvosana";
        }
        return arvosana;
    }
    
    /**
     * Palauttaa parametrina saamansa numeroarvosanan kirjallisena.
     * @param numero tenttiarvosana numerona
     * @return tenttiarvosana kirjallisena
     * @example
     * <pre name="test">
     *   kirjallinenArvosana2(0) === "Hyl‰tty";
     *   kirjallinenArvosana2(1) === "V‰ltt‰v‰";
     *   kirjallinenArvosana2(2) === "Tyydytt‰v‰";
     *   kirjallinenArvosana2(3) === "Hyv‰";
     *   kirjallinenArvosana2(4) === "Kiitett‰v‰";
     *   kirjallinenArvosana2(5) === "Erinomainen";
     *   kirjallinenArvosana2(6) === "Superi";
     *   kirjallinenArvosana2(-1) === "Virheellinen arvosana";
     *   kirjallinenArvosana2(10) === "Virheellinen arvosana";
     * </pre>
     */
    public static String kirjallinenArvosana2(int numero) {        
        if ( numero < 0 || ARVOSANAT.length <= numero ) return "Virheellinen arvosana";
        return ARVOSANAT[numero];                
    }
    
    /**
     * 
     * @param args ei k‰ytˆss‰
     */
    public static void main(String[] args) {
        int a=3, b=6;
        
        //if( ! (a < 5 && b > 4) ) {
        //    
        // }
        //if( !(a < 5) || !(b > 4) ) {
        //    
        // }
        
        if( a >= 5 || b <= 4 ) {
            
        }
        
            
        //if (i < 6 & onkoTietokannassaRuuhkaa(param) )
        
        String kissa = null;
        
        if (kissa != null && kissa.equals("miuku"))
            System.out.println(kissa);
        
        char luettuMerkki = 'k';
        switch(luettuMerkki) 
        {
            case 'k' : System.out.println("annoit komennon k)orota"); break;
            case 'j' : System.out.println("annoit komennon j)atka"); break;
            case 'l' : System.out.println("annoit komennon l)opeta"); break;
            default  : System.out.println("komentoa ei tunneta");
        }
        
        
        if ( luettuMerkki == 'k' )System.out.println("annoit komennon k)orota");
        else if ( luettuMerkki == 'j' ) System.out.println("annoit komennon j)atka");
        else if ( luettuMerkki == 'l' ) System.out.println("annoit komennon l)opeta");
        else System.out.println("komentoa ei tunneta");
        
        String sana = kirjallinenArvosana(3);
        System.out.println(sana);
        

    }

}