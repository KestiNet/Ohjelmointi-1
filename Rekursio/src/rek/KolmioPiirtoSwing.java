package rek;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Ohjelmalla piirret��n rekursiivinen kolmio n�ytt��n
 * @author Vesa Lappalainen
 */


public class KolmioPiirtoSwing {
    
  /** Raja pienimm�lle kolmiolle joka piirret��n */  
  public static final double PIENIN_KOLMIO = 0.05;
  // Vertailun vuoksi:
  // =================================
  // koko  C        Java   AWT-versio
  // ================================= 
  // 0.5   0.32 s   1.3 s   0.38 s
  // 0.05  8.2  s  23.2 s   7.8  s
  // =================================

  
  /**
   * Piirret��n viiva reaalilukukoordinaateista
   * @param g   piirtopinta johon piirret��n 
   * @param x1  viivan alku x
   * @param y1  viivan alku y
   * @param x2  viivan loppu x
   * @param y2  viivan loppu y 
   * 
   */
  public static void drawLine(Graphics g, double x1, double y1, double x2, double y2){
    g.drawLine((int)x1, (int)y1, (int)x2, (int)y2 );
  }

  
  /**
   * Rekursiivinen kolmion piirto.  Piirret��n ensin
   * kolmio jonka alak�rki o pisteess� x,y ja korkeus on h.
   * Sitten piirret��n sen joka sivulle vastaava kolmio-
   * @param g piirtopinta johon piirret��n
   * @param x kolmion alak�rjen x 
   * @param y kolmion alak�rjen y
   * @param h kolmion korkeus
   */
  public static void kolmio(Graphics g, double x, double y, double h)
  {
    double s2 = h / (Math.sqrt(3));

    drawLine(g,x,y,x-s2,y-h);
    drawLine(g,x-s2,y-h,x+s2,y-h);
    drawLine(g,x+s2,y-h,x,y);

    if ( h < PIENIN_KOLMIO ) return;

    kolmio(g,x-s2,y,h/2);  /* Pienempi kolmio vasemmalle */
    kolmio(g,x+s2,y,h/2);  /* Pienempi kolmio oikealle   */
    kolmio(g,x,y-h,h/2);   /* Pienempi kolmio yl�puolelle*/
  }


  /**
   * Perit��n piirto-ikkunan JFramesta
   */
  public static class PiirtoIkkuna extends JFrame {
    private static final long serialVersionUID = 1L;

    /**
     * Perit��n piirto-alue JPanelista
     */  
    public class PiirtoPaneeli extends JPanel {
      private static final long serialVersionUID = 1L;

      /**
       * Komponentin piirt�minen.  Piirret��n kolmio.
       * @param g piirtopinta
       */
      @Override
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setTitle("Kolmio...");
        long lahto = System.currentTimeMillis();
        kolmio(g,300,400,200);
        long loppu = System.currentTimeMillis();
        setTitle("Kolmio: " + (loppu-lahto)/1000.0 + " s");
        System.out.println("Kolmio: " + (loppu-lahto)/1000.0 + " s");
      }
    }

    
    /**
     * Alustetaan ikkunan tiedot
     * @param x yl�nurkan x
     * @param y yl�nurkan y
     * @param w ikkunan leveys
     * @param h ikkunan korkeus
     */
    public PiirtoIkkuna(int x, int y, int w, int h) {
      super();  
      setSize(w,h); setLocation(x,y);
      addWindowListener(new SuljeIkkuna());
      Container contentPane = getContentPane();
      contentPane.add(new PiirtoPaneeli());
    }

    private class SuljeIkkuna extends WindowAdapter {
      /**
       * Sulkemismetodi
       * @param event sulkemistapahtuman tiedot
       */  
      @Override
      public void windowClosing(WindowEvent event) {
        System.exit(0);  // NOPMD
      }
    }

  }

  /**
   * Luodaan piirto-ikkuna rekursiivista kolmiota varten
   * @param args ei k�yt�ss�
   */
  public static void main(String[] args)  {
    PiirtoIkkuna ikkuna = new PiirtoIkkuna(50,50,600,500);
    ikkuna.setVisible(true); // ikkuna.show();
  }
}


