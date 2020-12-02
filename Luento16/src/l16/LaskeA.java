package l16;

/**Laskee listasta missä sanassa on eniten valittuja kirjaimia
 * @author Esa Kesti
 * @version 17 Nov 2020
 */
public class LaskeA {
    
    /**
     * Etsii tietorakenteesta missä sanassa on eniten valittuja kirjaimia
     * @param sanat tietorakenne jossa merkkijonoja
     * @param kirjain mitä haetaan
     * @return jono missä eniten merkkejä
     * @example
     * <pre name="test">
     * String[] sanat = {"koira", "syö", "muonaa", "ja", "tavaa", "javaa"};
     * etsiEniten(sanat, 'a') === "tavaa";
     * etsiEniten(sanat, 'z') === "";
     * etsiEniten(sanat, 'r') === "koira";
     * etsiEniten(sanat, 'v') === "javaa";
     * </pre>
     */
    public static String etsiEniten(String [] sanat, char kirjain) {
        String parasSana = "";
        int parasLkm = 0;
        for (String sana : sanat) {
            int lkm = laskeKirjaimet(sana, kirjain);
        }
        return "koira";
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] sanat = {"koira", "syö", "muonaa", "ja", "tavaa", "javaa"};
        String sana = etsiEniten(sanat, 'a');
        System.out.println(sana);
    }

}
