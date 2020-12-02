package Demo3;
/**
 * Ohjelmalla lasketaan lämpötila ja painomuunnoksia
 * @author vesal
 * @version 19.9.2008 
 *
 */
public class Muunnokset {

    /**
     * Muunnetaan Fahrenheit asteet Celsius asteiksi
     * @param f muunnettava lämpötila Fahrenheit asteina
     * @return lämpötila Celsius asteina
     * @example
     * <pre name="test">
     *   fahrenheitToCelsius(0)   ~~~ -17.777778;
     *   fahrenheitToCelsius(32)  ~~~  0;
     *   fahrenheitToCelsius(100) ~~~  37.777778;
     *   fahrenheitToCelsius(212) ~~~ 100.0;
     * </pre>
     */
    public static double fahrenheitToCelsius(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }

    
    /**
     * Muunnetaan paunoja (lb) grammoiksi. 
     * @param painoLb muunnettava paino lb:nä
     * @return tulos grammoina
     * @example
     * <pre name="test">
     *   paunatGrammoiksi(0) ~~~ 0.0;
     *   paunatGrammoiksi(1) ~~~ 453.59237;
     * </pre>
     */
    public static double paunatGrammoiksi(double painoLb) {
        return painoLb*453.59237;
    }

    /**
     * Testataa muunnoksia
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        double lampotilaF = 13;
        double lampotilaC;
        lampotilaC = fahrenheitToCelsius(lampotilaF);
        System.out.printf("%3.1f F = %3.1f C %n",lampotilaF,lampotilaC);
        
        double painoLb = 9.3;
        double painoG;
        painoG = paunatGrammoiksi(painoLb);
        System.out.printf("%5.3f lb = %5.3f g %n",painoLb,painoG);
        
    }


}
