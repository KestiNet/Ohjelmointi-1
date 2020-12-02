package Demo3;

import fi.jyu.mit.graphics.EasyWindow;

/**
 * Piirret‰‰‰n aliohjelman avulla n‰ytˆˆn 5 lumiukkoa.
 * @author vesal
 * @version 19.9.2008
 */
public class Lumiukot3 {


    /**
     * Piirt‰‰ ikkunaan lumiukon paikkaan (x,y)
     * @param window ikkuna johon piirret‰‰n
     * @param x lumiukon ison pallon x
     * @param y lumiukon ison pallon y
     * @param isonpallonSade alimman pallon s‰de
     * @param keskipallonSade mahaa kuvaavan pallon s‰de
     * @param paanSade kumipallon p‰‰n s‰de
     */
    public static void lumiukko(EasyWindow window, double x, double y, double isonpallonSade,
            double keskipallonSade, double paanSade) {
        double keskipallonY    = y-keskipallonSade-isonpallonSade;
        double paanY           = y-2*keskipallonSade-isonpallonSade-paanSade;
        window.addCircle(x,y,isonpallonSade);
        window.addCircle(x,keskipallonY,keskipallonSade);
        window.addCircle(x,paanY,paanSade);
    }

    /**
     * Piirt‰‰ ikkunaan lumiukon paikkaan (x,y)
     * @param window ikkuna johon piirret‰‰n
     * @param x lumiukon ison pallon x
     * @param y lumiukon ison pallon y
     * @param isonpallonSade alimman pallon s‰de
     * @param keskipallonSade mahaa kuvaavan pallon s‰de
     */
    public static void lumiukko(EasyWindow window, double x, double y, double isonpallonSade,
        double keskipallonSade) {
        lumiukko(window,x,y,isonpallonSade,keskipallonSade,10);
    }

    /**
     * Piirt‰‰ ikkunaan lumiukon paikkaan (x,y)
     * @param window ikkuna johon piirret‰‰n
     * @param x lumiukon ison pallon x
     * @param y lumiukon ison pallon y
     * @param isonpallonSade alimman pallon s‰de
     */
    public static void lumiukko(EasyWindow window, double x, double y, double isonpallonSade) {
        lumiukko(window,x,y,isonpallonSade,15,10);
    }

    /**
     * Piirt‰‰ ikkunaan lumiukon paikkaan (x,y) jonka ison pallon s‰de on 20
     * @param window ikkuna johon piirret‰‰n
     * @param x lumiukon ison pallon x
     * @param y lumiukon ison pallon y
     */
    public static void lumiukko(EasyWindow window, double x, double y) {
        lumiukko(window,x,y,20);
    }



    /**
     * Piirret‰‰n 5 lumiukkoa
     * @param args
     */
    public static void main(String[] args) {
        EasyWindow window = new EasyWindow();

        lumiukko(window,20,100,30);
        lumiukko(window,30,300,40,20);
        lumiukko(window,274,190,50,40,30);
        lumiukko(window,124,150);
        lumiukko(window,190,130);

        window.showWindow();

    }

}
