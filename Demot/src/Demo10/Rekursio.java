package Demo10;

import fi.jyu.mit.graphics.Line;
import fi.jyu.mit.graphics.Window;

/**
 * Piirretään rekursiivisesti kolmioita.
 * Tämä ei ole huippunopea, koska tässä luodaan niin paljon
 * olioita!
 * @author vesal
 * @version 4.11.2008
 */
public class Rekursio {
    /** Raja pienimmälle kolmiolle joka piirretään */  
    public static final double PIENIN_KOLMIO = 0.20;

    private static long n = 0;

    /**
     * Piirretään rekursiivisesti kolmioita
     * @param ikkuna mihin kolmiot piirretään
     * @param x kolmion alakärjen x
     * @param y kolmion alakärjen y
     * @param h kolmion korkeus
     */
    public static void kolmio(Window ikkuna, double x, double y, double h) {
        double s2 = h / (Math.sqrt(3));
        
        ikkuna.add(new Line(x,y,x-s2,y-h));
        ikkuna.add(new Line(x-s2,y-h,x+s2,y-h));
        ikkuna.add(new Line(x+s2,y-h,x,y));
        n += 3;
        
        if ( h < PIENIN_KOLMIO ) return;
        
        kolmio(ikkuna,x-s2,y  ,h/2);  /* Pienempi kolmio vasemmalle */
        kolmio(ikkuna,x+s2,y  ,h/2);  /* Pienempi kolmio oikealle   */
        kolmio(ikkuna,x   ,y-h,h/2);  /* Pienempi kolmio yläpuolelle*/
    }
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        Window ikkuna = new Window(600,500);
        ikkuna.showWindow();
        long alkuAika = System.currentTimeMillis();
        kolmio(ikkuna,300,450,200);
        long loppuAika = System.currentTimeMillis();
                
        System.out.println("Monella oliolla: " +
                            (loppuAika - alkuAika) + " ms, olioita: " + n);

    }

}