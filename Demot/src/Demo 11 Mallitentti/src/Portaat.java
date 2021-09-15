import fi.jyu.mit.graphics.Line;
import fi.jyu.mit.graphics.RPoint;
import fi.jyu.mit.graphics.Window;


public class Portaat {
    public static RPoint porras(Window window,RPoint start) {
        RPoint mid = new RPoint(start.getX(),start.getY()+1);
        RPoint end = new RPoint(start.getX()+1,start.getY()+1);
        window.add(new Line(start,mid));
        window.add(new Line(mid,end));
        return end;
    }
    public static void main(String[] args) {
        Window window = new Window();
        window.scale(0,-1,10,10);
        RPoint end = new RPoint(0,0);
        end = porras(window,end);
        end = porras(window,end);
        end = porras(window,end);
        window.showWindow();
    }
}
