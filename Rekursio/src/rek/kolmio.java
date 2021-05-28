package rek;


import fi.jyu.mit.graphics.EasyWindow;

/**
 * @author vesal
 * @version 17.8.2009
 */
public class kolmio {
       
       final static double PIENIN_KOLMIO = 5.00;
       /**
        * Piirtää Sierpinskin kolmion. Parametreina kolmion vasemman
        * alakulman x- ja y-koordinaatit, sekä kolmoin korkeus.
        * @param window ikkuna johon piirretään
        * @param x kolmion vasemman kulman x-koordinaatti
        * @param y kolmion vasemman kulman y-koordinaatti
        * @param h kolmion korkeus
        */
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
       
       /**
        * Piirretään rekursiivinen kuvio
        * @param args ei käytössä
        */
       public static void main(String[] args) {
               EasyWindow window = new EasyWindow();
               window.showWindow();
               sierpinskinKolmio(window, 0, 200, 200);
       }
}
