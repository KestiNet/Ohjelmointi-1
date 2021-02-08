package Demo10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author esakesti
 * @param pallot 
 * @param rand 
 * @return 
 *
 */
public class Lotto{
	
	/**

/**
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
    Collections.shuffle(pallot);
    for (int i=0; i<3; i++) {
    	System.out.println("Lisänumerot: " + pallot.get(i));
    }
}
    // täytä pallot numeroilla 1-39, esim: pallot.add(4);
    // sotke pallot  (ks. Collections)
    // tulosta 7 ekaa "palloa"
    // tulosta 3 seuraavaa palloa
    
    
}
