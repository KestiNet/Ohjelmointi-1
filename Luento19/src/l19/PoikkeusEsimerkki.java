package l19;


/**
 * Demonstroidaan poikkeusten vastaanottoa
 * @author vesal
 * @version 9.11.2008
 */
public class PoikkeusEsimerkki {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*int n1=7,n2=4,n3=0;
        
        
        if ( n2 != 0 ) System.out.printf("%d%n",10/n2);
        else System.out.println("Nollalla jako: ");
        if ( n3 != 0 ) System.out.printf("%d%n",10/n3);
        else System.out.println("Nollalla jako: / by zero");
        if ( n1 != 0 ) System.out.printf("%d%n",10/n1);
        else System.out.println("Nollalla jako: ");
       
        try {        	              
            System.out.printf("%d%n",10/n2);
        	System.out.printf("%d%n",10/n3);
        	System.out.printf("%d%n",10/n1);     
        } catch (ArithmeticException e) {
            System.out.println("Nollalla jako: " + e.getMessage());
        }
        */
        
        String s1 = "12", s2 = "14", s3 = "15";
        
        int i0 = 678, i1=0,i2=0,i3=0, i4=0;
        
        
        
        try {            
            i0 = muutaJono("15");
            i4 = 10/i1;
            i1 = Integer.parseInt(s1);
            i2 = Integer.parseInt(s2);
            i3 = Integer.parseInt(s3);
            
        } catch ( NumberFormatException e ) {
            System.out.println("Ei numero: " + e.getMessage());
        } catch ( ArithmeticException e ) {
            System.out.println("Nollalla jako: " + e.getMessage());
        }
        System.out.printf("Luvut: %d %d %d %d %n", i0,i1,i2,i3);
                
    } 
    
    /**
     * Muuttaa jonon numeroksi
     * @param jono
     * @return numerona jono
     * @throws NumberFormatException jos muuntaminen ei onnistu
     */
    public static int muutaJono(String jono) throws NumberFormatException  {
        int tulos = Integer.parseInt(jono); 
        return tulos;
    }
    
    
}













