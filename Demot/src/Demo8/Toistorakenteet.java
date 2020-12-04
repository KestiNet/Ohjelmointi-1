package Demo8;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author esakesti
 *
 */
public class Toistorakenteet {


/**
 * @param luvut
 */
public static void kysyLuvut(double [] luvut) {

	{
	    Scanner luku = new Scanner(System.in);
	    double[] numbers = new double[5];

	    for (int i = 0; i < numbers.length; i++)
	    {
	        System.out.println("Anna kolme lukua");
	        numbers[i] = luku.nextDouble();
	    }
	}
}
 

/**
 * @param args ei käytössä
 */
public static void main(String[] args){
    double[] luvut = kysyLuvut("Anna kolme lukua", "luku", 3, 1);
}




}