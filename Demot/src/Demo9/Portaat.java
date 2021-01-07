package Demo9;

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
	 * @param x
	 * @param y
	 * @param next 
	 * @return null
	 */
	public static RPoint porras(Window window, RPoint next) {
		window.add(new Line(next, next));
		return next;
				
	      
	    }
	  
	  
	  /**
	 * @param window
	 * @param next 
	 * @param x
	 * @param y
	 * @return null
	 */
	public static RPoint porrasAlas(Window window, RPoint next) {
		window.add(new Line(2, 2, 0, 0));	

		
		return next;
	       
	    }
	    
	    /**
	     * @param args
	     */
	    public static void main(String[] args) {
	        Window window = new Window();
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
