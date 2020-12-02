package Demo5;


/**
 * Lasketaan taulukosta parillisten lukujen summan ja vähentää parittomat
 * @author Esa Kesti
 * @version 1 Aug 2020
 */
public class Viides {
    
   
/**
 * laskee parillisten alkioiden summan yhteen ja palauttaa
 * @param luvut taulukko
 * @return sum
 */
    
   public static int summaa(int luvut[]) {
        
        int sum = 0;
        for (int i = 0; i < luvut.length; i++) {
            if (luvut [i] % 2 == 0) {
                sum += luvut[i];
                
            }
            
                            
        }
        return sum;

        }

     
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        int luvut[] = {2, 2, 5, 6, 7, 9, 15, 20, 60};
        
        int summa = summaa(luvut);
        System.out.println("Parillisten lukujen summa = " + summa);
    }

}
