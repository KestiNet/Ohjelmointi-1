package Demo5;

/**
 * @author Esa Kesti
 * @version 19 Jul 2020
 */
public class Kolmas {

    
    /**
     * Funktiolla palautetaan kokonaislukutaulukko merkkijonona
     * @param taulukko t‰st‰ tehd‰‰n merkkijono 
     * @param erotin mik‰ merkki tulee alkioiden v‰liin
     * @return taulukko merkkijonona
     * @example
     * <pre name="test">
     *   int luvut[] = {1,2,3};
     *   taulukkoJonoksi(luvut," ") === "1 2 3"; 
     *   taulukkoJonoksi(luvut,",") === "1,2,3";
     *   int luvut2[] = {};
     *   taulukkoJonoksi(luvut2," ") === ""; 
     * </pre>
     **/  
    public static String taulukkoJonoksi(int[] taulukko,String erotin) {
        if (taulukko.length == 0 )  return "";
        String alkuun = "";
        String tulos = "";
        for (int i = 0; i < taulukko.length; i++) {
            int luku = taulukko[i];
            tulos += alkuun + luku;
            alkuun = erotin;
        }
        return tulos;
    }
    
    /**
     * Funktiolla palautetaan kokonaislukutaulukko merkkijonona
     * @param taulukko t‰st‰ tehd‰‰n merkkijono 
     * @param erotin mik‰ merkki tulee alkioiden v‰liin
     * @return taulukko merkkijonona
     * @example
     * <pre name="test">
     *   int luvut[] = {1,2,3};
     *   taulukkoJonoksi(luvut," ") === "1 2 3"; 
     *   taulukkoJonoksi(luvut,",") === "1,2,3";
     *   int luvut2[] = {};
     *   taulukkoJonoksi(luvut2," ") === ""; 
     * </pre>
     **/  
    public static String taulukkoJonoksi2(int[] taulukko,String erotin) {
        if (taulukko.length == 0 )  return "";
        StringBuilder tulos = new StringBuilder("" + taulukko[0]);
        for (int i = 1; i < taulukko.length; i++) {
            int luku = taulukko[i];
            tulos.append(erotin);
            tulos.append(luku);            
        }
        return tulos.toString();
    }
    
    /**
     * Tulostetaan taulukon alkiot yhdelle riville.
     * Tulostuksessa k‰ytet‰n uutta for-silmukkaa.
     * @param taulukko tulostettava taulukko
     */
    public static void tulostaTaulukko(int[] taulukko) {
        for (int alkio:taulukko) 
            System.out.print(alkio + " "); 
        System.out.println();
    }

    
    /**
     * Funktiolla lasketaan taulukon alkioiden summa
     * @param taulukko summattava taulukko
     * @return alkioiden summa
     * @example
     * <pre name="test">
     *   int luvut[] = {1,2,3};
     *   summa(luvut) === 6;
     *   int luvut1[] = {1};
     *   summa(luvut1) === 1;
     *   int luvut0[] = {};
     *   summa(luvut0) === 0;
     * </pre>
     */
    public static int summa(int[] taulukko) {                   
        int sum = 0;
        for ( int luku : taulukko )
            sum += luku;
        return sum;
    }

    /**
     * Funktiolla lasketaan taulukon alkioiden summa
     * @param taulukko summattava taulukko
     * @return alkioiden summa
     * @example
     * <pre name="test">
     *   int luvut[] = {1,2,3};
     *   summa2(luvut) === 6;
     *   int luvut1[] = {1};
     *   summa2(luvut1) === 1;
     *   int luvut0[] = {};
     *   summa2(luvut0) === 0;
     * </pre>
     */
    public static int summa2(int[] taulukko) {
        int sum = 0;
        for (int i = 0; i < taulukko.length; i++ ) {
            int luku = taulukko[i];
            sum += luku;
            sum++;
        }
        return sum;
    }
    
    /**
     * @param taulukko
     * @return raja
     * Jokin ei t‰sm‰‰, vaan tulostaa vastaukseksi vain 0????
     */
    public static int tulostaYli(int[] taulukko) {
        int raja = 0;
        for(int i = 0; i > taulukko.length; i++) {
            if (taulukko[i] < 30);{
                raja = taulukko[i];
            }
        
        }
        return raja;
    }
       
    /**  for (int i = 5; 1 <= i; i--) {
      if ( arvosanaRajat[i] <= tenttipisteet ) return i;
   }
     * @param args ei k‰ytˆss‰
     */
    public static void main(String[] args) {
               // indeksi:  0  1  2  3  4  5  6  7  8  9 10 11                          
        int kPituudet[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        tulostaTaulukko(kPituudet); // 31 28 31 30 31 30 31 31 30 31 30 31 
        
        String jono = taulukkoJonoksi2(kPituudet,",");
        
        System.out.println("Luvut ovat: " + jono);      // Luvut ovat: 31 28 31 30 31 30 31 31 30 31 30 31
        System.out.println("Luvut ovat: " + kPituudet); // Tulostaa vain Luvut ovat: [I@388993
//        System.out.println("Luvut ovat: " + asList[kPituudet]); // Tulostaa vain Luvut ovat: [I@388993
        
        int sum = summa(kPituudet);
        int sum2 = summa2(kPituudet);
        System.out.printf("Lukujen summa kahdella tavalla on %d ja %d%n",sum,sum2);
        
        kPituudet[1] = 29;
        tulostaTaulukko(kPituudet); // 31 29 31 30 31 30 31 31 30 31 30 31 
        
        int raja = tulostaYli(kPituudet);
        System.out.println("Luvut jotka ovat yli 30: " + raja);
    }

}