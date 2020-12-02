package demo2;

import fi.jyu.mit.graphics.DrawableCollection;
import fi.jyu.mit.graphics.EasyWindow;
import fi.jyu.mit.graphics.Line;

/**
 * Ohjelma piirt‰‰ viisi porrasta alkaen origosta p‰‰ttyen
 * pisteesen (5,5).  
 * Sitten piirret‰‰n laskevat portaat alkaen pisteetst‰ (4,5)
 * ja p‰‰ttyen pisteeseen (9,0) 
 * @author vesal
 * @version 14.9.2008
 */
public class Portaat2 {

    /**
     * Aliohjelma piirt‰‰ ikkunaan yhden nousevan portaan
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
        DrawableCollection p = new DrawableCollection();
        p.move(x,y,0);
        p.add(new Line(0, 0, 0,+1));
        p.add(new Line(0,+1,+1,+1));
        window.add(p);
    }
    
    
    /**
     * Aliohjelma piirt‰‰ ikkunaan yhden laskevan portaan
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
        DrawableCollection p = new DrawableCollection();
        p.move(x,y,0);
        p.add(new Line( 0, 0,+1, 0));
        p.add(new Line(+1, 0,+1,-1));
        window.add(p);
    }
    /**
     * @param args ei k‰ytˆss‰
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
