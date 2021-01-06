package Demo9;

import java.awt.Color;

import fi.jyu.mit.graphics.*;


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
	public static  RPoint porras(Window window, RPoint next) {
		window.add(new Line(next, next)).setColor(Color.RED);		
		return null;
	      
	    }
	  
	  
	  /**
	 * @param window
	 * @param next 
	 * @param x
	 * @param y
	 * @return null
	 */
	public static RPoint porrasAlas(Window window, RPoint next) {
		window.add(new Line(next, next)).setColor(Color.RED);		

		
		return null;
	       
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
