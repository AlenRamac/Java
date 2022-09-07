package vjezba;

import java.util.Arrays;

public class JednoDimenzionalniNizovi {
	
	public static void main(String[] args) {
//		deklaracija niza
		int [] niz;
		
//		konstrukcija niza
		niz = new int [5];
		
//		niz pocinje od 0 (0->4 = 5)
		niz [0] = 2;
		
		niz [niz.length-1] = 4;
		System.out.println(niz [0]);
		
		System.out.println(Arrays.toString(niz));
		
//		deklaracija, konstrukcija i dodijeljivanje vrijednosti
		int [] vrijednosti = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(vrijednosti));
		
		int [] a = new int [6];
		a [1] = 7;
		System.out.println(Arrays.toString(a));
		
		
	}
	
}
