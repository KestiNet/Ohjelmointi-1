package Demo8;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author esakesti
 *
 */
public class Toistorakenteet {


/**
 * @param kysyLuvut 
 * @param string 
 * @param luku 

 */
public static  void kysyLuvut(String kysyLuvut) {
    Scanner kysymys = new Scanner(System.in);

    System.out.println(kysyLuvut);
    double numero = kysymys.nextDouble();

    double [] luvut = new double[2];


    for (int i = 0 ; i < 2; i++ ) {
       luvut[i] = kysymys.nextDouble();
    }

    for (double i : luvut) {
    System.out.println(i);
    
    }
    kysymys.close();

}


/**
 * @param args ei käytössä
 */
public static void main(String[] args){

	 kysyLuvut("Anna kolme lukua");
}




}