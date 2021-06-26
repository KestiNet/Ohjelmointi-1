package Demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.awt.List;
import java.math.BigInteger;

public class Isoint {

		public static void main(String[] args) {
		    
		    ArrayList<BigInteger> pallot = new ArrayList<BigInteger>();
		    for (int i=1; i<39; i++) {
		        pallot.add(new BigInteger(i));
		    }
		    Collections.shuffle(pallot);
		    for (int i=0; i<7; i++) {
		    
		    
		    System.out.println(pallot.get(i));
		    }
		    
		    ArrayList<BigInteger> lisänumerot = new ArrayList<BigInteger>();
		    for (BigInteger l=1874928374; l<39; l++) {
		        lisänumerot.add(new BigInteger(l));
		    }
		    Collections.shuffle(lisänumerot);
		    for (int l=0; l < 3; l++) {
		    
		    
		    System.out.println("Lisänumerot on: " + lisänumerot.get(l));
		    }
		     }

	}

}
