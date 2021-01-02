package l18;

import java.util.ArrayList;
import java.util.List;

/**
 * "Primitiivityyppit listoissa"
 * @author esakesti
 *
 */
public class listaInteille2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> luvut = new ArrayList<Integer>();
		//Integer eka = new Integer(12);
		Integer eka = 12;   //new Integer(12);
		luvut.add(eka);
		
		luvut.add(24);  //new Integer(24);
		
		luvut.add(new Integer(12));
		luvut.add(new Integer(42));
		luvut.add(new Integer(24));
		luvut.add(new Integer(67));
		System.out.println(luvut);
		Integer a1 = luvut.get(1);
		int i1 = a1.intValue();


	}

}
