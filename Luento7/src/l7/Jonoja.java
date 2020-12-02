package l7;

/**
 * tutkitaan merkkijonoja
 * @author Esa Kesti
 * @version 21 Jun 2020
 */
public class Jonoja {

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        int i;
        i=13;
        int kissanpituus = 32;
        String jono;
        jono ="kissa";
        int pituus = jono.length();
        
        System.out.println("Kissa pituus = " + pituus );
        
        String jonoIsona = jono.toUpperCase();
        System.out.println("Isona = " + jonoIsona);
        
        char merkki = jono.charAt(1);
        System.out.println("Paikassa 1 on merkki = " + merkki);
        
        jono.toUpperCase();
        System.out.println("jono on nyt = " + jono);
        
        StringBuilder sbjono;
        sbjono = new StringBuilder("kissa");
        System.out.println("sbjono on nyt = " + sbjono);

        sbjono.append(" istuu");
        System.out.println("Isona = " + sbjono);

        char eka = sbjono.charAt(0);
        char isona = Character.toUpperCase(eka);
        
        sbjono.setCharAt(0, isona);
        System.out.println("sbjono on nyt = " + sbjono);


    }
    

}
