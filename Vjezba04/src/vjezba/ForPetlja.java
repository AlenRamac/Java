package vjezba;

import java.util.Arrays;

public class ForPetlja {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
		}
		
		for (int i = 10; i > 0; i--) {
//			System.out.println(i);
		}
		
		int[] niz = {1,2,3};
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i]+", ");
		}
		
		String rijec = "Dakovo";
		for (int i = 0; i < rijec.length(); i++) {
			System.out.println(rijec.charAt(i));
		}
		
		int[][] tablica = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[0].length; j++) {
				System.out.print(tablica[i][j]+", ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < tablica.length; i++) {
			System.out.println(Arrays.toString(tablica[i]));
		}
		
		for (int i = 0; i < 10; i++) {
			if (i==4) {
				continue;
			}
			if (i==7) {
				break;
			}
			System.out.print(i);
		}
		System.out.println();
		
		vanjska:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j==7) {
					break vanjska;
				}
				System.out.print(j);
			}
			
		}
		
				
	}
	
}
