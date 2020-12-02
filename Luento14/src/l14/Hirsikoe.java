package l14;

import fi.jyu.mit.graphics.BasicShape;
import fi.jyu.mit.graphics.Circle;
import fi.jyu.mit.graphics.Line;
import fi.jyu.mit.graphics.Window;
import fi.jyu.mit.ohj2.Syotto;

/**
 * Kokeillaan hirsipuun piirtämistä
 * @author vtorniko
 * @version 21.10.2020
 */
public class Hirsikoe {

    private static final BasicShape[] hirrenOsat = {
       new Circle(3,0,1),
       new Line(3,1,3,7),
       new Line(3,7,6,7)
    };
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Window ikkuna = new Window(400,400);
        ikkuna.scale(0,0,10,10);
       
        ikkuna.showWindow();
        for (BasicShape shape:hirrenOsat) {
            ikkuna.add(shape);
            Syotto.kysy("Paina Enter");
        }  
    }

}