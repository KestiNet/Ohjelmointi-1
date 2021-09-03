package harkka;

import java.util.ArrayList;
import java.util.List;
import fi.jyu.mit.ohj2.Syotto;



/**
 * @author Esa Kesti
 * Konvertoidaan käyttäjältä kysytty desimaali kellonaika joka
 * tallennetaan listaan.
 * Lopuksi lista tulostetaan käyttäjälle desimaali aika muunnettuna tunneiksi ja minuuteiksi
 * lasketaan myös kokonaistyöaika josta vähennetään päivittäinen 30min ruokatunti
 *
 */
public class TyoaikaKonversio {



    /**
     * Muunnetaan desimaalityyppinen työaika tunneiksi ja minuuteiksi
     *
     */
    public static final void tulosta (List<Double>luvut) {
        for (double tulostaAika:luvut) {

            int tunnit = (int)(tulostaAika);
            int minuutit = (int) ((tulostaAika*60) % 60);
            System.out.printf("Oikea työaika: %d:%d",tunnit, minuutit);
            System.out.println();


        }
    }

    /**
     * Lasketaan kokonaistyö aika ja vähennetään ruokatunnit 30min
     * luvut käyttäjän syöttämät listan luvut
     * tunnit erotetaan syötetystä tiedosta pelkkä tunti osa
     * minuutit erotetaean syötetystä tiedosta minuutit ja muunnetaan se oikean aika muotoon
     * @param luvut listasta
     */
    public static final void kokonaisTyoaika(List<Double>luvut) {
        double sum = 0;
        for (Double summa : luvut) sum += summa;

           int tunnit = (int)(sum);
           int minuutit = (int) ((sum*60) % 60);

            System.out.printf("Viikon kokonaistyöaika: %d:%d",tunnit, minuutit);
            System.out.println();

            int ruokaTunti = (tunnit -2);
            int ruokaMinuutti = (minuutit - 30);

        System.out.printf("Viikon kokonaistyöaika ruokatunnit poislukien: %d:%d",ruokaTunti, ruokaMinuutti);
        System.out.println();

        }

    /**
     * Pyydetään käyttäjältä syöttöä tehdyistä desimaali tunneista
     * Syötetty tieto tallennetaan listaan Luvut
     * @param args ei käytössä
     * Kutsutaan aliohjelmaa tulosta ja kokonaisluvut.
     */
    public static void main(String[] args) {
        List<Double> luvut = new ArrayList<>();
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
