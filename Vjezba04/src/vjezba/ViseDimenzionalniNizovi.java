package vjezba;import java.lang.reflect.Array;
import java.util.Arrays;

public class ViseDimenzionalniNizovi {
	
	public static void main(String[] args) {
		
		int[][] niz = new int [7][15];
		niz [niz.length-1][niz[0].length-1] = 2;
		System.out.println(Arrays.toString(niz));
		System.out.println(niz[6][14]);
		
		int[][] tablica = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(tablica[0]));
		
	}
	
	
}
