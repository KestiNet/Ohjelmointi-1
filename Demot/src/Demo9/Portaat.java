package Demo9;



import java.awt.Color;

import fi.jyu.mit.graphics.Drawable;
import fi.jyu.mit.graphics.EasyWindow;
import fi.jyu.mit.graphics.Line;
import fi.jyu.mit.graphics.RPoint;
import fi.jyu.mit.graphics.Window;

/**
 * @author esakesti
 *
 */



public class Portaat {

  
    /**
     * @param window
     * @param next 
     * @param x
     * @param y
     * @return next
     */
    public static RPoint porras(Window window, RPoint next) {
    	Drawable kuvio = window.add(new Line(next, next));
 		return next;


    }
    
    

    /**
     * @param window
     * @param next
     * @return next
     */
    public static RPoint porrasAlas(EasyWindow window, RPoint next) {
        double x = 0;
        double y = 0;
    	window.addLine(x, y  , x  , y-1);
        window.addLine(x, y+1, x+1, y-1);
		return next;
    }
    
    
    /**
     * @param args ei k�yt�ss�
     */
    public static void main(String[] args) {
        EasyWindow window = new EasyWindow();
        window.scale(0,-1,10,10);
        RPoint next = new RPoint(0,0);
        next = porras(window,next);
        next = porras(window,next);
        next = porras(window,next);
        next = porras(window,next);
        next = porras(window,next);
        next = new RPoint(next.getX()-1,next.getY());
        next = porrasAlas(window,next);
        next = porrasAlas(window,next);
        next = porrasAlas(window,next);
        next = porrasAlas(window,next);
        next = porrasAlas(window,next);
        window.showWindow();
    }



	

}