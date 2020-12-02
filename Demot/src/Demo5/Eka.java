package Demo5;

import java.awt.Color;

import fi.jyu.mit.graphics.Axis;
import fi.jyu.mit.graphics.Marker;
import fi.jyu.mit.graphics.Window;

/**
 * Ohjelmalla piirret‰‰n kuvaaja luvuista.
 * @author vesal
 * @version 28.9.2020
 */
public class Eka {
  //#STATICIMPORT

    /**
     * Funkiolla palautetaan taulukon suurimman luvun arvo.
     * Jos taulukossa ei ole yht‰‰n alkiota palautetaan 0;
     * @param luvut tutkitatva taulukko
     * @return taulukon suurin luku
     * @example
     * <pre name="test">
     * suurin(new double[]{1,2,3}) ~~~ 3;
     * suurin(new double[]{1,3,2}) ~~~ 3;
     * suurin(new double[]{2,1,3}) ~~~ 3;
     * suurin(new double[]{2,3,1}) ~~~ 3;
     * suurin(new double[]{3,1,2}) ~~~ 3;
     * suurin(new double[]{3,2,1}) ~~~ 3;
     * suurin(new double[]{1})     ~~~ 1;
     * suurin(new double[]{})      ~~~ 0;
     * suurin(new double[]{-1,-2,-3}) ~~~ -1;
     * </pre>
     */
    public static double suurin(double[] luvut) {
        if ( luvut.length == 0 ) return 0.0;
        double max = luvut[0];
        for (int i=1; i<luvut.length; i++)
            if ( max < luvut[i] ) max = luvut[i];
        return max;
    }
    
    /**
     * @param luvut
     * @return min
     */
    public static double pienin(double[] luvut) {
        if ( luvut.length == 0 ) return 0.0;
        double min = luvut[0];
        for (int i=1; i<luvut.length; i++)
            if ( min > luvut[i] ) min = luvut[i];
        return min;
    }

    /**
     * Aliohjelmalla piirret‰‰n ikkunaan kuva, jossa taulukon
     * jokainen alkio on kuvattuna ympyr‰ll‰.  Muut mustalla, paitsi
     * taulukon suurinta arvoa edustavat punaisella.
     * @param ikkuna johon piirret‰‰n
     * @param luvut taulukon alkiot
     */
    public static void piirraKuva(Window ikkuna, double[] luvut) {
        double max = suurin(luvut);
        double min = pienin(luvut);
        double r = 0.25;
        
        for (int i=0; i<luvut.length; i++) {
            Marker ympyra = new Marker(i,luvut[i],r);
            if ( luvut[i] == max )  // harvinaista kyll‰, == toimii reaaliluvuille t‰ss‰!   
                ympyra.setColor(Color.RED);
            ikkuna.add(ympyra);
            
            if ( luvut[i] == min )  // harvinaista kyll‰, == toimii reaaliluvuille t‰ss‰!   
                ympyra.setColor(Color.GREEN);
            ikkuna.add(ympyra);
        }
     
            
    }
            /**
     * Piirret‰‰n kuvaaja luvuista.  Suurimmat arvot piirret‰‰n punaisella.
     * @param args ei k‰ytˆss‰
     */
    public static void main(String[] args) {
        double luvut2[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        //                0  1  2  3 ...
        double luvut[] = {3, 5, 3, 9, 21, 30, 6, 4};
        Window ikkuna = new Window(600,400);
        double max = suurin(luvut);
        //double min = pienin(luvut);
        ikkuna.scale(0,-1,luvut.length,max+1);  
        ikkuna.add(new Axis(100,max*2,0));
        piirraKuva(ikkuna,luvut);
        ikkuna.showWindow();

    }

}