package l12;

import java.util.StringTokenizer;

/**
 * tutkitaan merkkijonon pilkkomista
 * @author Esa Kesti
 * @version 26 Jul 2020
 */
public class Pilko {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String oikea = "012  02|23,12";
        String vastaus = "12";
        
        String[] osat = oikea.split("[ |,]+");
        
        for (String osa : osat)
            System.out.println(osa + " ");
      
        System.out.println("______________________");
        StringTokenizer st = new StringTokenizer(oikea, " |,");
        
        while ( st.hasMoreTokens() ) {
            String s = st.nextToken(); 
            System.out.println(s);
        }
                }

}
