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
 * @param luvut
 */
public static void kysyLuvut(double [] luvut) {
	Scanner luku = new Scanner(System.in);
	ArrayList<Double> list = new ArrayList<Double>();
	System.out.println("Anna kolme lukua");
	while(luku.hasNextDouble()) {
		list.add(luku.nextDouble());
		
	}
	 
	Double [] luvut = (Double[]) list.toArray();
	for (int i = 0; i < luvut.length; i++) {
		System.out.println(luvut[i]);
	}
   }
   
 

/**
 * @param args ei käytössä
 */
public static void main(String[] args){
    double[] luvut = kysyLuvut("Anna kolme lukua", "luku", 3, 1);
}




}