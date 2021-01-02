package l18;

import java.util.ArrayList;
import java.util.List;

/**
 * "Primitiivityyppit listoissa"
 * @author esakesti
 *
 */
public class listaInteille {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> luvut = new ArrayList<Integer>();
		Integer eka = 12; //Integer eka = new Integer(12);
		luvut.add(eka);
		
		luvut.add(24);
		
		int i1 = eka;  //eka.intValue();
		luvut.add(44);
		
		int i2 = luvut.get(1);
		System.out.println(luvut.get(2));
		
	

	}

}
