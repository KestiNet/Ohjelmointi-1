package l9;

/**
 * komentorivin parametrien välitys
 * @author Esa Kesti
 * @version 25 Jun 2020
 */
public class commandLineParameters {

    /**
     * @param args
     */
    public static void main(String[] args) {
       for(int i = 0; i < args.length; i++) {
           String jono = args[i];
       System.out.println("Paikassa " + i + " on arvo " + jono);
           }

    }
}
