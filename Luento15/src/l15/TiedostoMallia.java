package l15;

import fi.jyu.mit.ohj2.Tiedosto;

/**
 * Tutkitaan miten luetaan tiedostoa
 * @author Esa Kesti
 * @version 1 Sep 2020
 */
public class TiedostoMallia {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] rivit = Tiedosto.lueTiedosto("sanat.txt");
        if (rivit == null ) {
            System.out.println("Ei voi lukea tiedostoa sanat.txt");
            return;
        }
        for (String s: rivit)
            System.out.println(s);
    }

}
