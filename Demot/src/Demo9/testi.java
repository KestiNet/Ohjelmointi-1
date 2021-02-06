package Demo9;

import fi.jyu.mit.graphics.EasyWindow;

/**
 * Ohjelma piirt�� viisi porrasta alkaen origosta p��ttyen
 * pisteesen (5,5).  
 * Sitten piirret��n laskevat portaat alkaen pisteetst� (4,5)
 * ja p��ttyen pisteeseen (9,0) 
 * @author vesal
 * @version 14.9.2008
 */
public class Portaat {

    /**
     * Aliohjelma piirt�� ikkunaan yhden nousevan portaan
     * <pre>
     *    |-------(x+1,y+1)
     *    |
     *    |
     *    |
     *   (x,y) 
     * </pre>
     * @param window
     * @param x portaan alkupisteen x
     * @param y portaan alkupisteen y
     */
    public static void porras(EasyWindow window,double x,double y) {
        window.addLine(x, y  , x  , y+1);
        window.addLine(x, y+1, x+1, y+1);
    }
    
    
    /**
     * Aliohjelma piirt�� ikkunaan yhden laskevan portaan
     * <pre>
     *  (x,y) 
     *    -------|
     *           |
     *           |
     *           | (x+1,y-1);
     * </pre>
     * @param window
     * @param x portaan alkupisteen x
     * @param y portaan alkupisteen y
     */
    public static void porrasAlas(EasyWindow window,double x,double y) {
        window.addLine(x  , y  , x+1, y  );
        window.addLine(x+1, y  , x+1, y-1);
    }
    
    
    /**
     * @param args ei k�yt�ss�
     */
    public static void main(String[] args) {
        EasyWindow window = new EasyWindow();
        window.scale(0,0,10,10);
        porras(window,0,0);
        porras(window,1,1);
        porras(window,2,2);
        porras(window,3,3);
        porras(window,4,4);
        porrasAlas(window,4,5);
        porrasAlas(window,5,4);
        porrasAlas(window,6,3);
        porrasAlas(window,7,2);
        porrasAlas(window,8,1);
        window.showWindow();
    }

}