package harkka;

import java.util.ArrayList;
import java.util.List;
import fi.jyu.mit.ohj2.Syotto;



/**
 * @author Esa Kesti
 * Konvertoidaan käyttäjältä kysytty desimaali kellonaika joka
 * tallennetaan listaan.
 * Lopuksi lista tulostetaan käyttäjälle
 *
 */
public class TyöaikaKonversio {



    /**
     * Muunnetaan desimaalityyppinen työaika tunneiksi ja minuuteiksi
     * @param luvut
     * @return null
     */
    private static final void tulosta (List<Double>luvut) {
        for (double tulostaAika:luvut) {

            int tunnit = (int)(tulostaAika);
            int minuutit = (int) ((tulostaAika*60) % 60);


            System.out.printf("%d:%d",tunnit, minuutit);
            System.out.println();


        }
    }

    /**
     * Lasketaan kokonaistyö aika ja vähennetään ruokatunnit 30min
     * @param luvut
     *
     */
    public static final void kokonaisTyoaika(List<Double>luvut) {

        for (double kokonaisTyoaika:luvut) {

            int tunnit = (int)(kokonaisTyoaika);
            int minuutit = (int) ((kokonaisTyoaika*60) % 60);

            double tehdytTunnit = (tunnit + minuutit);
            System.out.println("kokonaistyöaika: " + tehdytTunnit);

            //double tyoAika = minuutit;



            //System.out.println("Kokonaistyöaika: " + minuutit);

            //int minuutit = (int) ((laskeKokonaisTyoaika*60) % 60);

        }

    }

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        List<Double> luvut = new ArrayList<Double>();
        double maanantai = Syotto.kysyDouble("Anna Maanantain tuntimäärä: ");
        luvut.add(maanantai);
        double tiistai = Syotto.kysyDouble("Anna Tiistain tuntimäärä: ");
        luvut.add(tiistai);
        double keskiviikko = Syotto.kysyDouble("Anna Keskiviikon tuntimäärä: ");
        luvut.add(keskiviikko);
        double torstai = Syotto.kysyDouble("Anna Torstain tuntimäärä");
        luvut.add(torstai);
        double perjantai = Syotto.kysyDouble("Anna Perjantain tuntimäärä");
        luvut.add(perjantai);
        tulosta(luvut);
        kokonaisTyoaika(luvut);
    }

}
