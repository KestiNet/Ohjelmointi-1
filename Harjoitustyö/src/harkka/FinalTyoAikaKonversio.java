package harkka;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import fi.jyu.mit.ohj2.*;

/**
 * @author esakesti
 *
 */
public class FinalTyoAikaKonversio {

    /**
     *
     */
    public static final void syötäKäsin() {

    }
    /**
     * @param luvut
     * @param tiedosto
     * @param ajat
     */
    public static final void kokonaisTyoaika(List<Double>luvut, List<Double>tiedosto) {
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
     * @param args
     */
    public static void main(String[] args) {
        String kysy = Syotto.kysy("Haluatko syöttää tiedot käsin? K vai E?");
        if(kysy.equalsIgnoreCase("K")) {
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

            kokonaisTyoaika(luvut, null);
        }


        else {
            try {
                List<Double> tiedosto = new ArrayList<>();

                File csvFile = new File("/Users/esakesti/Documents/tyoaika.csv");
                Scanner fileInput = new Scanner(csvFile);
                while (fileInput.hasNextLine()) {
                    String contents = fileInput.nextLine();
                    tiedosto.add(Double.parseDouble(contents));
                    kokonaisTyoaika(tiedosto, null);

                }

            } catch (FileNotFoundException e) {
                System.out.println("Ei oo tiedostoa\n");
                e.printStackTrace();

            }
        }
    }

}

