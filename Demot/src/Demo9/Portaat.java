package Demo9;

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
	 * @return next
	 */
	  public static RPoint porras(EasyWindow window,double x,double y) {
	        window.addLine(x, y  , x  , y+1);
	        window.addLine(x, y+1, x+1, y+1);
			return null;
	        
	    }
	    
    
    
	    
	    /**
	     * @param args
	     */
	    public static void main(String[] args) {
	        Window window = new Window();
	        window.scale(0,-1,10,10);
	        RPoint next = new RPoint(2,2);
	        next = porras(window,next);
	 
	        window.showWindow();
	    }





	

	

	
}
