package Demo4;

import fi.jyu.mit.graphics.EasyWindow;

/**
 * Luokka, jossa harjoitellaan piirtely‰ EasyWindow-luokkaa k‰ytt‰m‰ll‰
 * @author Veli-Matti Tornikoski
 * @version 26.1.2020
 */
public class Lumiukko2 {
    
    /**
     * Piirret‰‰n lumiukko niin ett‰ iso pallo paikassa x,y
     * ja ison pallon s‰de 20
     * @param w ikkuna johon piirret‰‰n
     * @param x ison pallon x koordinaatti
     * @param y ison pallon y koordinaatti     
     */
    public static void lumiukko(EasyWindow w, double x, double y ) {
        lumiukko(w, x, y, 20);               
    }
    
    /**
     * Piirret‰‰n lumiukko niin ett‰ iso pallo paikassa x,y
     * @param w ikkuna johon piirret‰‰n
     * @param x ison pallon x koordinaatti
     * @param y ison pallon y koordinaatti
     * @param isonPallonSade ison pallon y koordinaatti
     */
    public static void lumiukko(EasyWindow w, double x, double y, double isonPallonSade ) {        
        double keskiPallonSade = 15;
        double pikkuPallonSade = 10;
        double keskiPallonY = y-keskiPallonSade-isonPallonSade;
        double pikkuPallonY = y-2*keskiPallonSade-isonPallonSade-pikkuPallonSade;
        w.addCircle(x,pikkuPallonY,pikkuPallonSade);        
        w.addCircle(x,keskiPallonY,keskiPallonSade);        
        w.addCircle(x,y,isonPallonSade);        
    }
    
    /**
     * @param args
     */

           
                
        lumiukko(window, 70, 90, 20);                                               
        lumiukko(window, 100, 90);
        lumiukko(window, 300, 40);
    }
}