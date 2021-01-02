package l18;



	import java.awt.Graphics;

	import fi.jyu.mit.graphics.BasicShape;
	import fi.jyu.mit.graphics.Drawable;
	import fi.jyu.mit.graphics.EasyWindow;
	import fi.jyu.mit.graphics.Matrix;
	import fi.jyu.mit.graphics.SPoint;
	import fi.jyu.mit.graphics.Vector;

	/**
	 * Luokka Sierpinskin kolmion piirtämiseksi niin, että
	 * se on vain yksi objekti.
	 * @author vesal
	 * @version 17.8.2009
	 */
	public class KolmiotOliolla extends BasicShape implements Drawable {
	    /** Raja pienimmälle kolmiolle joka piirretään */  
	    public static final double PIENIN_KOLMIO = 0.05;

	    private double x;
	    private double y;
	    private double h;
	   
	    /**
	     * Alustetaan Sierpinskin kolmio
	     * @param x  kärjen x-koordinaatti
	     * @param y  kärjen y-koordinaatti
	     * @param h  kolmion korkeus
	     */
	    public KolmiotOliolla(double x, double y, double h) {
	       this.x = x;
	       this.y = y;
	       this.h = h;
	    }
	    
	    
	    private static class PiirraKolmio {
	        Vector vr = new Vector(); 
	        SPoint p1 = new SPoint(0,0);
	        SPoint p2 = new SPoint(0,0);
	        SPoint p3 = new SPoint(0,0);
	        Graphics g;
	        Matrix a;
	        
	        public long viivoja = 0;
	        
	        private PiirraKolmio(Graphics g, Matrix a) {
	            this.g = g;
	            this.a = a;
	        }

	        private void kolmio(double x, double y, double h ) {
	            double s2 = h / (Math.sqrt(3));
	            a.transform(vr.set(x,y)      ,p1);
	            a.transform(vr.set(x-s2, y-h),p2);
	            a.transform(vr.set(x+s2, y-h),p3);
	            g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	            g.drawLine(p2.getX(), p2.getY(), p3.getX(), p3.getY());
	            g.drawLine(p3.getX(), p3.getY(), p1.getX(), p1.getY());
	            viivoja += 3;

	            if (h < PIENIN_KOLMIO) return;
	            kolmio(x-s2, y  , h/2); // Vasen alakolmio
	            kolmio(x+s2, y  , h/2); // Oikea alakolmio
	            kolmio(x   , y-h, h/2); // Yläkolmio
	        }
	    
	    }

	    private long aika = 0;
	    
	    /**
	     * @return viimeisen piirron viemä aika
	     */
	    public long getAika() {
	        return aika;
	    }
	    
	    
	    /** 
	     * @param g
	     * @param a
	     */
	    protected void drawShape(Graphics g, Matrix a) {
	        long alkuAika = System.currentTimeMillis();
	        PiirraKolmio kolmio = new PiirraKolmio(g, a);
	        kolmio.kolmio(x,y,h);
	        aika = System.currentTimeMillis() - alkuAika;
	        System.out.println("Viivoja: " + kolmio.viivoja);
	    }
	    
	    /**
	     * Piirretään rekursiivinen kuvio
	     * @param args ei käytössä
	     * @throws InterruptedException 
	     */
	    public static void main(String[] args) throws InterruptedException {
	                   
	           EasyWindow window = new EasyWindow();
	           window.showWindow();
	           KolmiotOliolla kolmio = new KolmiotOliolla(250, 450, 200);        
	           window.add(kolmio);
	           
	           while ( kolmio.getAika() == 0 ) { Thread.sleep(1000); };
	           
	           System.out.println("Yhden olion totetuksella kesti: " + 
	                       kolmio.getAika() + " millisekuntia");
	    }

	    
	}