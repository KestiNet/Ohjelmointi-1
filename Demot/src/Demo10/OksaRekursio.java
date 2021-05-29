package Demo10;

import fi.jyu.mit.graphics.Line;
import fi.jyu.mit.graphics.Window;

/**
 * @author esakesti
 *
 */
public class OksaRekursio {
    /** Raja pienimm�lle kolmiolle joka piirret��n */  
    public static final double PIENIN_OKSA = 0.20;

    //private static long n = 0;

    /**
     * Piirret��n rekursiivisesti kolmioita
     * @param ikkuna mihin kolmiot piirret��n
     * @param x kolmion alak�rjen x
     * @param y kolmion alak�rjen y
     * @param d 
     * @param l 
     * @param h kolmion korkeus
     */
    public static void oksa(Window ikkuna, double x, double y, double d, double l) {
        double s2 =Math.PI/2;
        
        ikkuna.add(new Line(x,y,x-s2,y-l));
        ikkuna.add(new Line(x-s2,y-l,x+s2,y-l));
        ikkuna.add(new Line(x+s2,y-l,x,y));
        //n += 3;
        
        if ( l < PIENIN_OKSA ) return;
        
        oksa(ikkuna, x+l*Math.cos(d),y+l*Math.sin(d),d+0.6,l*0.6);
        oksa(ikkuna, x+l*Math.cos(d),y+l*Math.sin(d),d-0.6,l*0.6);
        oksa(ikkuna, x+l*Math.cos(d),y+l*Math.sin(d),d,l*0.3);
    }
    
    /**
     * @param args ei k�yt�ss�
     */
    public static void main(String[] args) {
        Window ikkuna = new Window(600,500);
        ikkuna.showWindow();
        oksa(ikkuna,300,450,200,200);
                

    }

}
