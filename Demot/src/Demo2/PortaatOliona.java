package Demo2;

import fi.jyu.mit.graphics.ControlButtons;
import fi.jyu.mit.graphics.ControllerFrame;
import fi.jyu.mit.graphics.DrawableCollection;
import fi.jyu.mit.graphics.EasyWindow;
import fi.jyu.mit.graphics.Line;
//import fi.jyu.mit.graphics.MouseFollower;
//import fi.jyu.mit.graphics.Mover;

/**
* Ohjelma piirt‰‰ viisi porrasta alkaen origosta p‰‰ttyen
* pisteesen (5,5).  
* Sitten piirret‰‰n laskevat portaat alkaen pisteetst‰ (4,5)
* ja p‰‰ttyen pisteeseen (9,0) 
* @author vesal
* @version 20.9.2008
*/
public class PortaatOliona {

    /** 
     * Luokka yhdelle nousevalle portaalle
     * <pre>
     *    |-------(x+1,y+1)
     *    |
     *    |
     *    |
     *   (x,y) 
     * </pre>
     * @author vesal
     * @version 20.9.2008
     */
    public static class Porras extends DrawableCollection {
        /**
         * Alustetaan portaan tiedot
         * @param x portaan alkupiste
         * @param y portaan alkupiste
         */
        public Porras(double x, double y) {
            super();
            move(x,y,0);
            add(new Line(0, 0  , 0  , 0+1));
            add(new Line(0, 0+1, 0+1, 0+1));
        }
    }
    
    
    /** 
     * Luokka yhdelle laskevalle portaalle
     * <pre>
     *  (x,y) 
     *    -------|
     *           |
     *           |
     *           | (x+1,y-1);
     * </pre>
     * @author vesal
     * @version 20.9.2008
     */
    public static class PorrasAlas extends DrawableCollection {
        /**
         * Alustetaan portaan tiedot
         * @param x portaan alkupiste
         * @param y portaan alkupiste
         */
        public PorrasAlas(double x, double y) {
            super();
            move(x,y,0);
            add(new Line(0  , 0  , 0+1,0   ));
            add(new Line(0+1, 0  , 0+1,0-1 ));
        }
    }
    
    
    /**
     * Luokka ylˆsp‰in meneville portaille
     *           _ (x+n,y+n)
     *         _|   
     *       _|       
     *     _|           
     *   _|               
     *  |                  
     * (x,y)                     
     * 
     * @author vesal
     * @version 20.9.2008
     *
     */
    public static class PortaatYlos extends DrawableCollection {
        /**
         * Alustetaan portaat
         * @param x portaiden alkupiste
         * @param y portaiden alkupiste
         * @param n askelmien lukum‰‰r‰
         */
        public PortaatYlos(double x,double y,int n) {
            super();
            move(x,y,0);
            for (int i=0; i<n; i++)
                add(new Porras(i,i)); // NOPMD, tarvitaan luonti silmukassa
        }
        
    }

    
    /**
     * Luokka alasp‰in meneville portaille
     *      (x,y)_ 
     *            |_
     *              |_
     *                |_
     *                  |_
     *                    |
     *                  (x+n,y-n)
     * 
     * @author vesal
     * @version 20.9.2008
     *
     */
    public static class PortaatAlas extends DrawableCollection {
        /**
         * Alustetaan portaat
         * @param x portaiden alkupiste
         * @param y portaiden alkupiste
         * @param n askelmien lukum‰‰r‰
         */
        public PortaatAlas(double x,double y,int n) {
            super();
            move(x,y,0);
            for (int i=0; i<n; i++)
                add(new PorrasAlas(i,-i));  // NOPMD, tarvitaan luonti silmukassa
        }
        
        
    }

    
    /**
     * Luokka ylˆs- ja alas meneville portaille
     *           _ (x+n,y+n)
     *         _| |_
     *       _|     |_
     *     _|         |_
     *   _|             |_
     *  |                 |
     * (x,y)            (x+2n-1,y)
     * 
     * @author vesal
     * @version 20.9.2008
     *
     */
    public static class PortaatYlosJaAlas extends DrawableCollection {
        /**
         * Alustetaan portaat
         * @param x portaiden alkupiste
         * @param y portaiden alkupiste
         * @param n askelmien lukum‰‰r‰
         */
        public PortaatYlosJaAlas(double x,double y,int n) {
            super();
            move(x,y,0);
            add(new PortaatYlos(0,0,n));
            add(new PortaatAlas(0+n-1,0+n,n));
        }
        
    }

    /**
     * Aliohjelma piirt‰‰ tasakylisen kolmio, jonka k‰rki
     * on pisteess‰ (x,y) ja jonka korkeus on 1 ja leveys 2.
     */ 
    public static class Kolmio extends DrawableCollection {
        /**        
         * @param x k‰rkipisteen x
         * @param y k‰rkipisteen y
         */
        public Kolmio(double x,double y) {
            super();
            move(x,y,0);
            add(new Line(0  , 0  , 0+1, 0-1));
            add(new Line(0+1, 0-1, 0-1, 0-1));
            add(new Line(0-1, 0-1, 0  , 0  ));
        }
    }

    /**
     * Ohjelmalla piirret‰‰n portaat ylˆs ja alas
     * @param args
     */
    public static void main(String[] args) {
        EasyWindow window = new EasyWindow();
        window.scale(0,0,20,20);
        PortaatYlosJaAlas portaat = new PortaatYlosJaAlas(3,3,5); 
        window.add(portaat);
        // new MouseFollower(window.getPanel(),portaat,0,0,0,true);
        // new Mover(portaat,0.2,0.3,0,300);
        new ControllerFrame(new ControlButtons(portaat),450,550,150,150); 

        window.add(new Kolmio(1,2));
        window.add(new Kolmio(2,7));
        window.add(new Kolmio(10,10));
        Kolmio k = new Kolmio(10,12); window.add(k);
        new ControllerFrame(new ControlButtons(k),300,550,150,150); 
        
        window.showWindow();

    }

}
