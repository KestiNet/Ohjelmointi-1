package l9;

/**
 * Tutustutaan tdd:hen ja 
 * @author Esa Kesti
 * @version 23 Jun 2020
 */
public class Pienin {
	
	/**
	 * @param a eka luku
	 * @param b toka luku
	 * @param c kolmas luku
	 * @return pienin luvuista
	 */
	public static int pienin(int a, int b, int c) {
		if (a < b && b < c)
			return a;
		if (b < a && b < c)	
			return b;
		if (c < a && c < b)
			return c;
		
		return 0;
			
		
		
		
	}
	
/**
 * @param args
 */
    
 public static void main (String[]args) {
	 int a = 1, b = 2, c = 3;
	 int p = pienin(a,b,c);
	 System.out.println("Pienin on " + p);
	 
 }
 
}