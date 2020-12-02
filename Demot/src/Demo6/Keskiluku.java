package Demo6;


/**
 * Lasketaan lukujoukon keskilukuja
 * @author vesal
 * @version 17.10.2008
 */
public class Keskiluku {
    
    /**
     * Lasketaan reaalilukutaulukon lukujen summa
     * @param luvut laskettavat luvut
     * @return lukujoukon summa
     * @example
     * <pre name="test">
     * double[] luvut = {1,2,3,2,5};
     * summa(luvut)           ~~~ 13; 
     * summa(new double[]{1}) ~~~ 1;
     * summa(new double[]{2}) ~~~ 2;
     * summa(new double[]{})  ~~~ 0;
     * </pre>
     * 
     */
    public static double summa(double[] luvut) {
        double sum = 0;
        for (double luku:luvut) 
            sum += luku;
        return sum;
    }


    /**
     * Lasketaan taulukon keskiarvo
     * @param luvut laskettavat luvut
     * @return lukujoukon keskiarvo
     * @example
     * <pre name="test">
     * double[] luvut = {1,2,3,2,5};
     * keskiarvo(luvut)        ~~~ 2.6; 
     * keskiarvo(new double[]{1}) ~~~ 1;
     * keskiarvo(new double[]{2}) ~~~ 2;
     * keskiarvo(new double[]{})  ~~~ 0;
     * </pre>
     */
    public static double keskiarvo(double[] luvut) {
        if ( luvut.length == 0 ) return 0;
        return summa(luvut)/luvut.length;
    }


    /**
     * Palautetaan luvun itseisarvo
     * @param luku tutkittava luku
     * @return luku ei-negatiivisena
     * 
     * @example
     * <pre name="test">
     *   itseisarvo(2)  ~~~ 2.0;
     *   itseisarvo(-2) ~~~ 2.0;
     *   itseisarvo(0)  ~~~ 0.0;
     *   itseisarvo(0.1)  ~~~ 0.1;
     *   itseisarvo(-0.1) ~~~ 0.1;
     * </pre>
     */
    public static double itseisarvo(double luku) {
        if ( luku < 0 ) return -luku;
        return luku;
    }
    

    /**
     * Palautetaan kahden reaalilukupisteen v�linen et�isyys
     * @param a toinen piste 
     * @param b toinen piste
     * @return luku ei-negatiivisena
     * 
     * @example
     * <pre name="test">
     *   etaisyys(0,1) ~~~ 1;
     *   etaisyys(1,0) ~~~ 1;
     *   etaisyys(1,2) ~~~ 1;
     *   etaisyys(1,1) ~~~ 0;
     * </pre>
     */
    public static double etaisyys(double a, double b) {
        return itseisarvo(a-b);
    }
    

    /**
     * Etsit��n taulukon keskiarvoa l�hin luku
     * @param luvut taulukko josta yleisint� etsit��n
     * @return taulukon yleisin luku
     * @example
     * <pre name="test">
     * int[] luvut = {1,2,3,2,5};
     * miidi(luvut)          === 3; 
     * miidi(new int[]{1})   === 1;
     * miidi(new int[]{3,3}) === 3;
     * miidi(new int[]{})    === 0;
     * </pre>
     */
    public static int miidi(int[] luvut) {
        if ( luvut.length == 0 ) return 0;
        double ka = demo5.Keskiluku.keskiarvo(luvut);
        int lahin = luvut[0];
        double lahinetaisyys = etaisyys(ka,lahin);
        for (int i=1; i<luvut.length; i++) {
            double d = etaisyys(ka,luvut[i]);
            if ( d < lahinetaisyys) {
                lahin = luvut[i];
                lahinetaisyys = d;
            }
        }
        return lahin;
    }


    /**
     * Etsit��n taulukon keskiarvoa l�hin luku
     * @param luvut taulukko josta yleisint� etsit��n
     * @return taulukon yleisin luku
     * @example
     * <pre name="test">
     * double[] luvut = {1,2,3,2,5};
     * miidi(luvut)             ~~~ 3; 
     * miidi(new double[]{1})   ~~~ 1;
     * miidi(new double[]{3,3}) ~~~ 3;
     * miidi(new double[]{})    ~~~ 0;
     * </pre>
     */
    public static double miidi(double[] luvut) {
        if ( luvut.length == 0 ) return 0;
        double ka = keskiarvo(luvut);
        double lahin = luvut[0];
        double lahinetaisyys = etaisyys(ka,lahin);

        for (int i=1; i<luvut.length; i++) {
            double d = etaisyys(ka,luvut[i]);
            if ( d < lahinetaisyys ) {
                lahin = luvut[i];
                lahinetaisyys = d;
            }
        }
        return lahin;
    }

    
    /**
     * Funktiolla skaalataan v�lill� [0,1] oleva luku v�lille [min,max]
     * @param luku skaalattava luku
     * @param min alueen alaraja
     * @param max alueen yl�raja
     * @return luku skaalattuna v�lille [min,max]
     * 
     * @example
     * <pre name="test">
     *   skaalaa(0.2,-3,3) ~~~ -1.8;
     *   skaalaa(0.2,1,6)  ~~~ 2.0;
     *   skaalaa(0.0,1,6)  ~~~ 1.0;
     *   skaalaa(1.0,1,6)  ~~~ 6.0;
     * </pre>
     */
    public static double skaalaa(double luku,double min, double max) {
        return luku*(max-min) + min;
    }
    
    
    /**
     * Funktiolla arvotaan taulukko, jossa on n lukua
     * @param n arvottavan taulukon koko
     * @param min arvonnassa pienin mahdollinen arvo
     * @param max arvonnassa suurin mahdollinen arvo
     * @return arvottu taulukko
     */
    public static double[] arvoLuvut(int n,double min, double max) {
        double[] luvut = new double[n];
        for (int i=0; i<n; i++) 
            luvut[i] = skaalaa(Math.random(),min,max);
        return luvut;
    }


    /**
     * Funktiolla lasketaan kahden pisteen v�linen et�isyys
     * k�ytt�en Pythagoraan kaavaa.
     * 
     * @param x1 1. pisteen x
     * @param y1 1. pisteen y
     * @param x2 2. pisteen x
     * @param y2 2. pisteen y
     * @return pisteiden v�lienn et�isyys.
     * 
     * @example
     * <pre name="test">
     *  etaisyys(0,0,3,4) ~~~ 5.0;
     *  etaisyys(1,2,4,6) ~~~ 5.0;
     *  etaisyys(0,0,0,0) ~~~ 0.0;
     *  etaisyys(0,0,1,0) ~~~ 1.0;
     *  etaisyys(0,0,1,1) ~~~ Math.sqrt(2);
     * </pre>
     */
    public static double etaisyys(double x1,double y1,double x2, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    
    /**
     * Tulostetaan taulukon alkiot yhdelle riville.
     * Tulostuksessa k�ytet�n uutta for-silmukkaa.
     * @param taulukko tulostettabva taulukko
     */
    public static void tulosta(double[] taulukko) {
        for (double alkio:taulukko) 
            System.out.printf("%5.2f ",alkio); 
            //System.out.print(alkio + " "); 
        System.out.println(); 
    }

    
    /**
     * Lasketaan taulukon keskilukuja
     * @param args ei k�yt�ss�
     */
    public static void main(String[] args) {
        double[] luvut = {1,2,3,2,5}; // keskiarvo == 2.6
        double m1 = miidi(luvut);             // 3
        double m2 = miidi(new double[]{1});   // 1
        double m3 = miidi(new double[]{3,3}); // 3
        double m4 = miidi(new double[]{});    // 0
        System.out.printf("%5.2f %5.2f %5.2f %5.2f%n",m1,m2,m3,m4);
        
        luvut = arvoLuvut(15, -3, 8);
        tulosta(luvut);
        
    }


}
