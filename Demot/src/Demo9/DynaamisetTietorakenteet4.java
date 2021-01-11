package Demo9;


import java.util.ArrayList;
import java.util.List;


/**
 * @author esakesti
 *
 */
public class DynaamisetTietorakenteet4 {


    
    /**
     * Etsii tietorakenteesta missä sanassa on eniten valittuja kirjaimia
     * @param sanat2 
     * @param sanat tietorakenne jossa merkkijonoja
     * @param kirjain mitä haetaan
     * @return jono missä eniten merkkejä
     * @example
     * <pre name="test">
     * #import java.util.ArrayList;
     * #import java.util.List;
     * List<String> sanat2 = new ArrayList<String>();
     * etsiEnitenPaikka(sanat2, 'a') === -1;
     * sanat2.add("koira");
     * etsiEnitenPaikka(sanat2, 'a') === 0;
     * sanat2.add("syö");
     * sanat2.add("muonaa");
     * etsiEnitenPaikka(sanat2, 'a') === 2;
     * sanat2.add("ja");
     * etsiEnitenPaikka(sanat2, 's') === 1;
     * sanat2.add("tavaa");
     * sanat2.add("javaa");
     *     
     * </pre>
     */
    public static ArrayList<String> etsiPisinSana( List<String> sanat2) {
        ArrayList<String> sana = new ArrayList<String>();

    	int pisinSana = 0;
          for (String toka : sanat2) {
              int length = toka.length();
              if (length > pisinSana) {
                  pisinSana = length;
                  sana.clear();
              }
              if (length == pisinSana) {
                  sana.add(toka);
              }
          }
          return sana;
      }
     
    /**
     * @param args
     */
    public static void main(String[] args) {
      
       
       List<String> sanat2 = new ArrayList<String>();
       sanat2.add("koira");
       sanat2.add("syö");
       sanat2.add("muonaa");
       sanat2.add("ja");
       sanat2.add("tavaa");
       sanat2.add("javaa");
       
       ArrayList<String> poisto = etsiPisinSana(sanat2);
       
       
       System.out.println("Listan pisin sana on: "+etsiPisinSana(sanat2));

     sanat2.remove(poisto);
     
       
       
       
       System.out.println(sanat2);


       


    
       
       
    }

}