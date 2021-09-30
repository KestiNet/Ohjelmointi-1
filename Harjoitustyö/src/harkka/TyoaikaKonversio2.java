package harkka;

import fi.jyu.mit.ohj2.*;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TyoaikaKonversio2 {

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
     *
     * @param args ei käytössä
     *             Kutsutaan aliohjelmaa tulosta ja kokonaisluvut.
     */
    public static void main(String[] args) {

        String vastaus;
        boolean kylläEi;
        Scanner in = new Scanner(System.in);

        System.out.println("Haluatko syöttää viikon tunnit käsin vai lukea tiedostosta?");
        while (true) {
            vastaus = in.nextLine().trim().toLowerCase();
            if (vastaus.equalsIgnoreCase("Käsin")) {
                kylläEi = true;
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
                break;
            } else if (vastaus.equalsIgnoreCase("tiedostosta")) kylläEi = false;
                  //System.out.println("Luetaan tiedostosta");
                  List<Double> tehdytTunnit = new ArrayList<Double>();

                  try (Stream<Double> tunti = Files.tunti(Paths.get("tyoaika.csv"))) {
                   tehdytTunnit = tunti.collect(Collectors.toList());

                      tulosta(tehdytTunnit);
                      kokonaisTyoaika(tehdytTunnit);
                   
         
                      }

                  }
                 




        }
    }
}
