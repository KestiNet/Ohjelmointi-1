package l18;

import java.awt.*;

import fi.jyu.mit.graphics.*;
import fi.jyu.mit.graphics.Window;

/**
 * Piirrellään viivoja esimerkkinä erilaisista tavoista
 * lisätä viiva ja vaihtaa sen väriä
 * @author esakesti
 *
 */
public class Kuvia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Window window = new Window();
		//window.addLine(0, 0, 100, 100);
		
		Line line = new Line(20,30,60,90);
		window.add(line);
		line.setColor(Color.BLUE);
		
		RPoint p1 = new RPoint(40,10,30);
		RPoint p2 = new RPoint(60,190);
		
		Line line2 = new Line(p1, p2);
		window.add(line2);
		line.setColor(Color.RED);
		
		//Drawable kuvio = window.add(new Line(p1, p2));
		
		Drawable kuvio = new Line(p1, p2);
		window.add(kuvio);
		kuvio.setColor(Color.RED);
		
		
		window.add(new Line(p1, p2)).setColor(Color.RED);
		
		window.add(new Line(new RPoint(140,120,30), new RPoint(610,190))).setColor(Color.BLUE);
		
		window.showWindow();
		window.setTouchPad(true);
	}

}
