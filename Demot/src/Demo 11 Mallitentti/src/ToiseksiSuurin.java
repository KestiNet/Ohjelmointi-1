/*
*
* */

public class ToiseksiSuurin {
  /*
  * @arvot saadaan pääohjelman taulukosta,
  * käydään läpi taulukko ja etsitään siitä
  * toiseksi suurin alkio joka sitten palautetaan
  * */

    public static int toiseksiSuurin(int[] arvot) {
        int suurin = Integer.MIN_VALUE;
        int toiseksi = Integer.MIN_VALUE;
        for (int j : arvot) {
            if (j > suurin) {
                toiseksi = suurin;
                suurin = j;
            } else if ((j > toiseksi) && (j != suurin)) {
                toiseksi = j;
            }
        }

            return toiseksi;
        }


        /*
        * @param args ei käytössä
        * luodaan taulukko arvot jossa on ei lukuja, myös negatiivisia kokonaislukuja
        * kutsutaan aliohjelmaan toiseksiSuurin
        * tulostetaan aliohjelmalta palautettu luku
        * */

    public static void main(String[] args) {
        int[] arvot = {3, 1, -7, 9, 15, 8, 12};
        int toka = toiseksiSuurin(arvot);

        System.out.println("Toiseksi suurin alkio on: " +toka);

    }
}