package Demo10;


import fi.jyu.mit.graphics.EasyWindow;

/**
 * @author Esa Kesti
 * @version 28.5.2021
 */
public class kolmio {
       
       final static double alkuoksa = Math.PI/2;
    
       
       /**
     * @param window
     * @param x
     * @param y
     * @param d
     * @param l
     */
    public static void oksa(EasyWindow window, double x,double y,double d, double l) {
       
       window.addLine(x,y, x+l*Math.cos(d), Math.cos(d),y+l*Math.sin(d), l);
       
       
       if (l < 2) return;
       
       oksa(window, x+l*Math.cos(d),y+l*Math.sin(d),d+0.6,l*0.6);
       oksa(window, x+l*Math.cos(d),y+l*Math.sin(d),d-0.6,l*0.6);
       oksa(window, x+l*Math.cos(d),y+l*Math.sin(d),d,l*0.3);
       
       
       }
       
       
       
       
       /**
       public static void sierpinskinKolmio(EasyWindow window, double x, 
                       double y, double h) {
               
               //s on kolmion sivun pituus 
               //MAOL: tasasivuisen kolmion kaavat
               double s = (2*h / (Math.sqrt(3)));
               
               //varsinaisen kolmion piirto
               window.addLine(x, y, x+s/2, y-h); //vasen sivu
               window.addLine(x, y, x+s, y);  //pohja
               window.addLine(x+s, y, x+s/2, y-h); //oikea sivu
               
               if (h < PIENIN_KOLMIO) return;
               
               sierpinskinKolmio(window, x, y, h/2); //Vasen alakolmio
               sierpinskinKolmio(window, x+s/4, y-h/2, h/2); //Yläkolmio
               sierpinskinKolmio(window, x+s/2, y, h/2); //Oikea alakolmio
       }
       */
       /**
        * Piirretään rekursiivinen kuvio
        * @param args ei käytössä
        */
       public static void main(String[] args) {
               EasyWindow window = new EasyWindow();
               window.showWindow();
               oksa(window, 0, 200, 200, 0);
       }
}
