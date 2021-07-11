package Demo10;


/**
 * @author esakesti
 *
 */
public class Kombinaatio {
	
	/**
	 * @param n ensimm‰inen arvo p‰‰ohjelman long k:sta
	 * @param k toinen arvo p‰‰ohjelman long k:sta
	 * @return kombinaation summan
	 */
	public static long kombi(int n, int k) {
		
		 long summa = 1;
	        for (int i=1, m=n; i<=k; i++, m--)
	            summa = summa*m/i;
	        return summa;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long k = kombi(39,7);
		System.out.println(k);
		
	}

}


