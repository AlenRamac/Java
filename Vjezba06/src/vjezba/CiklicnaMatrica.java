package vjezba;

public class CiklicnaMatrica {

	public static void main(String[] args) {
//		proba(3, 3);
		ciklicnaMatrica(6, 6);
	}

	private static void ciklicnaMatrica(int x, int y) {
		int[][] polje = new int [x][y];
		int a = 1;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for (int b = 0; b < 4; b++) {
			
//			desno
			for (int j = 0+c2; j < polje[0].length-c1; j++) {
				polje[0+c2][j] = a;
				a += 1;
			}
			c2++;
			if ((float)y/2 != 0 && y>4) {
				if(b>y/2-1) {
					break;
				}
			}
			
//			dolje
			for (int i = 0+c2; i < polje.length-c1; i++) {
				polje[i][polje[0].length-1-c1] = a;
				a += 1;
			}
			
//			lijevo
			for (int j = polje[0].length-1-c2; j > -1+c1; j--) {
				polje[polje.length-1-c1][j] = a;
				a += 1;
			}
			c1++;
			
//			gore
//			if ((float)x/2 != 0 && x>4) {
//				if(b>x/2-2) {
//					c3++;
//				}
//			}
			if (x>4) {
				if(b>0) {
					c3++;
				}
			}
			for (int i = polje.length-1-c2; i > -1+c1; i--) {
				polje[i][0+c3] = a;
				a += 1;
			}
			
		}
		
		
		
//		print
		for (int k = 0; k < polje.length; k++) {
			for (int l = 0; l < polje[0].length; l++) {
				//jednoznamenkasti
				if (polje[k][l] < 10) {
					System.out.print("   " + polje[k][l]);	
				}
				//dvoznamenkasti
				if (polje[k][l] > 9 && polje[k][l] < 100) {
					System.out.print("  " + polje[k][l]);	
				}
				//troznamekasti
				if (polje[k][l] > 99 && polje[k][l] < 1000) {
					System.out.print(" " + polje[k][l]);	
				}
			}
			System.out.println();
		}
	
}

	
	
	
	
	
	
	
	
	
	
	
	private static void proba(int x, int y) {
		int[][] polje = new int [x][y];
		
		int a = 1;
		
//		desno
		for (int j = 0; j < polje[0].length; j++) {
			polje[0][j] = a;
			a += 1;
		}
//		dolje
		for (int i = 1; i < polje.length; i++) {
			polje[i][polje.length-1] = a;
			a += 1;
		}
//		lijevo
		for (int j = polje[0].length-2; j > -1; j--) {
			polje[polje.length-1][j] = a;
			a += 1;
		}
//		gore
		for (int i = 1; i > 0; i--) {
			polje[i][0] = a;
			a += 1;
		}
//		desno
		for (int j = 1; j < polje[0].length-1; j++) {
			polje[1][j] = a;
			a += 1;
		}		
		
//		print
		for (int k = 0; k < polje.length; k++) {
			for (int l = 0; l < polje[0].length; l++) {
				//jednoznamenkasti
				if (polje[k][l] < 10) {
					System.out.print("   " + polje[k][l]);	
				}
				//dvoznamenkasti
				if (polje[k][l] > 9 && polje[k][l] < 100) {
					System.out.print("  " + polje[k][l]);	
				}
				//troznamekasti
				if (polje[k][l] > 99 && polje[k][l] < 1000) {
					System.out.print(" " + polje[k][l]);	
				}
			}
			System.out.println();
		}
	}
}
