package Demo10;

import fi.jyu.mit.graphics.Line;
import fi.jyu.mit.graphics.Window;

/**
 * @author esakesti
 *
 */
public class OksaRekursio {
   

     
	/**
	 * Puun yksi oksa ja kolme muuta rekursiivisesti
	 * @param ikkuna 
	 * @param x oksan alkupiste
	 * @param y oksan alkupiste
	 * @param d oksan suunta radiaaneina
	 * @param l oksan pituus
	 */
    public static void oksa(Window ikkuna, double x, double y, double d, double l) {
        
        ikkuna.add(new Line(x,y, (x+l*Math.cos(d)),y+l*Math.sin(d)));
       
    
        if ( l < 2 ) return;
        
        oksa(ikkuna, x+l*Math.cos(d),y+l*Math.sin(d),d+0.6,l*0.6);
        oksa(ikkuna, x+l*Math.cos(d),y+l*Math.sin(d),d-0.6,l*0.6);
        oksa(ikkuna, x+l*Math.cos(d),y+l*Math.sin(d),d,l*0.3);
    }
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        Window ikkuna = new Window(1000,1000);
        ikkuna.showWindow();
        oksa(ikkuna,Math.PI/2,1500,50,500);
                

    }

}
