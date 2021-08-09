package Demo10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author esakesti
 *
 */
public class Lotto{
	
/**
 * Luodaan uusi ArrayList pallot johon tulee 7 numeroa 39:st� 
 * sekoitetaan pallot
 * @param args
 */
public static void main(String[] args) {
    
    ArrayList<Integer> pallot = new ArrayList<Integer>();
    for (int i=1; i<39; i++) {
        pallot.add(new Integer(i));
    }
    Collections.shuffle(pallot);
    for (int i=0; i<7; i++) {
    
    
    System.out.println(pallot.get(i));
    }
    
    //Toinen arrayList johon tulee 3 lis�numeroa 39:st�
    
    ArrayList<Integer>lisanumerot = new ArrayList<Integer>();
    for (int l=1; l<39; l++) {
        lisanumerot.add(new Integer(l));
    }
    Collections.shuffle(lisanumerot);
    for (int l=0; l < 3; l++) {
    
    
    System.out.println("Lisänumerot on: " + lisanumerot.get(l));
    }
     }
     

  

}

  