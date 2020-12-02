package demo2;

import fi.jyu.mit.graphics.EasyWindow;

/**
* Ohjelma piirtää kolmioita
* @author vesal
* @version 14.9.2008
*/
public class Kolmiot {

   /**
    * Aliohjelma piirtää tasakylkisen kolmio, jonka kärki
    * on pisteessä (x,y) ja jonka korkeus on 1 ja leveys 2.
    * @param window
    * @param x kärkipisteen x
    * @param y kärkipisteen y
    */
   public static void kolmio(EasyWindow window,double x,double y) {
       window.addLine(x  , y  , x+1, y-1);
       window.addLine(x+1, y-1, x-1, y-1);
       window.addLine(x-1, y-1, x  , y  );
   }
   
   /**
    * @param args ei käytössä
    */
   public static void main(String[] args) {
       EasyWindow window = new EasyWindow();
       window.scale(0,0,10,10);
       kolmio(window,5,5);
       kolmio(window,3,3);
       kolmio(window,7,3);
       kolmio(window,5,2);
       window.showWindow();
   }

}
