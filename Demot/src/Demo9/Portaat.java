package Demo9;



import fi.jyu.mit.graphics.EasyWindow;
import fi.jyu.mit.graphics.RPoint;

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
     * @return 
     */
    public static RPoint porras(EasyWindow window, RPoint next) {
       double x = next.getX();
       double y = next.getY();
		
       window.addLine(x, y  , x  , y+1);
       window.addLine(x, y+1, x+1, y+1);
		
       next = new RPoint(next.getX()+1,next.getY()+1);

		
		return next;

    }
    
    
    /**
     * @param window
     * @param next
     * @return next
     */
    public static RPoint porrasAlas(EasyWindow window, RPoint next) {
        double x = next.getX();
        double y = next.getY();
 		
        window.addLine(x+1  , y-1  , x+2, y-1  );
        window.addLine(x+1, y  , x+1, y-1);
 		

        next = new RPoint (next.getX(),next.getY());
 		
        return next;


     }

    
    
    /**
     * @param args ei käytössä
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