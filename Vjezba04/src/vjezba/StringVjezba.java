package vjezba;

import java.util.Arrays;

public class StringVjezba {
	
	public static void main(String[] args) {
		
		
		String s1 = new String();
		String s2 = "Osijek";
		System.out.println(s2.hashCode());
		s2 = "Dakovo";
		System.out.println(s2.hashCode());
//		string is immutable, mijenja hashcode
		String [] niz = new String [5];
		niz [0] = "Osijek";
		niz [1] = "Dakovo";
		niz [niz.length-1] = "Zagreb";
		System.out.println(Arrays.toString(niz));
		System.out.println(niz [1].charAt(0));
	}
	
}
