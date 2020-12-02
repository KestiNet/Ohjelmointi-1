package l9;

/**
 * Tutustutaan tdd:hen ja 
 * @author Esa Kesti
 * @version 23 Jun 2020
 */
public class Pienin {
    
    /**
     * Etsii annetuista luvuista pienimmän
     * @param a eka luku
     * @param b toka luku
     * @param c kolmas luku
     * @return pienin annetuista
     * @example
     * <pre name = "test">
     * pienin (1, 2, 3) === 1;
     * pienin (1, 3, 2) === 1;
     * pienin (2, 1, 3) === 1;
     * pienin (2, 3, 1) === 1;
     * pienin (3, 1, 2) === 1;
     * pienin (3, 2, 1) === 1;
     *</pre>
     * </>
     *
     *
     * <pre>
     * 1, 2, 3
     * 1, 3, 2
     * 2, 1, 3
     * 2, 3, 1
     * 3, 1, 2
     * 3, 2, 1
     * 2, 2, 2
     * -1, 0, 1
     * 1, 1, 1
     * </>
     */
    public static int pienin(int a, int b, int c) {
        if (a < b && b < c)
            return a;
        if (b < a && a < c)
            return b;
        if (c < a && c < b)
            return c;
        return 0;
    }
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        int a=1, b=2, c=3;
        int p = pienin(a, b, c);
        System.out.println("pienin on " +p);
    }

}
