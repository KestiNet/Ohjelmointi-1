package Demo7;

import static Demo6.Lskut.miidi;
import java.awt.Color;

import fi.jyu.mit.graphics.Axis;
import fi.jyu.mit.graphics.Marker;
import fi.jyu.mit.graphics.Window;

/**
 * Ohjelmalla piirret‰‰n kuvaaja luvuista.
 * @author Esa Kesti
 * @version 19.11.2020
 */
public class Grafiikkaa {
  
    private static double [][] arvoLuvut =
        { {4, 8, 7, 2, 9, 11, 15, 16},
          {3, 5, 6, 1, 8, 10, 13, 17}
        };
            

    /**
     * Aliohjelmalla piirret‰‰n ikkunaan kuva, jossa taulukon
     * jokainen alkio on kuvattuna ympyr‰ll‰.  Muut mustalla, paitsi
     * taulukon suurinta arvoa edustavat punaisella.
     * @param ikkuna johon piirret‰‰n
     * @param arvoluvut 
     */
    public static void piirraKuva(Window ikkuna, double[][] arvoluvut) {
        double max = suurin(arvoluvut);
        double r = 0.25;
        
        for (int i=0; i<arvoluvut.length; i++) {
            Marker ympyra = new Marker(i,arvoluvut[i],r);
            if ( arvoluvut[i] == max )  
                ympyra.setColor(Color.RED);
            ikkuna.add(ympyra);
        }
    }
    
    
    /**
     * @param luvut
     * @return lahin
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
     * Piirret‰‰n kuvaaja luvuista.  Suurimmat arvot piirret‰‰n punaisella.
     * @param args ei k‰ytˆss‰
     */
    public static void main(String[] args) {
        int pisteita = 100;
        double min = 0;
        double max = 10;
        double r = (max-min)/100;
        double pisteet[][] = new double[2][];
        pisteet[0] = arvoLuvut(pisteita, min, max);
        pisteet[1] = arvoLuvut(pisteita, min, max);
        Window ikkuna = new Window(600,400);
        ikkuna.scale(min-1,min-1,max+1,max+1);
        ikkuna.add(new Axis(100,100,0));
        piirraKuva(ikkuna,pisteet,r); 
        ikkuna.showWindow();
    }

   

    }

}
