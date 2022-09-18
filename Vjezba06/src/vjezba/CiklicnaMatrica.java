package vjezba;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Upisi broj redaka"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Upisi broj stupaca"));
		if (x>0 || y>0){
			ciklicnaMatrica(x, y);
		}else {
			System.out.println("Unesi brojeve vece od 0!");
		}
//		proba(4, 5);
	}

	private static void ciklicnaMatrica(int x, int y) {
		int[][] polje = new int [x][y];
		int a = 1;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for (int b = 0; b < (x+y)/2; b++) {
			
			if (x<=2 || y<=2) {
				if(b>0) {
					break;
				}
			}
//			desno
			for (int j = 0+c2; j < polje[0].length-c1; j++) {
				if (polje[0+c2][j] == 0 ) {
					polje[0+c2][j] = a;
					a += 1;
				}
			}
			c2++;
			if (x<=3) {
				if(b>0) {
					break;
				}
			}
			if (x>4 && x%2 != 0) {
				if(y>4 && y%2 == 0) {
					if(b==(x/2)+2) {
						break;
					}
				}
			}
			
//			dolje
			for (int i = 0+c2; i < polje.length-c1; i++) {
				if (polje[i][polje[0].length-1-c1] == 0 ) {
					polje[i][polje[0].length-1-c1] = a;
					a += 1;
				}
			}
			
			if (x>4 && x%2 == 0) {
				if(y>4 && y%2 != 0) {
					if(b==(x/2)+2) {
						break;
					}
				}
			}
			
//			lijevo
			for (int j = polje[0].length-1-c2; j > -1+c1; j--) {
				if (polje[polje.length-1-c1][j] == 0 ) {
					polje[polje.length-1-c1][j] = a;
					a += 1;
				}
			}
			c1++;
			
			if (x==4) {
				if(b==(x/2)+1) {
					break;
				}
			}

			if (x>4) {
				if(b>0) {
					c3++;
				}
			}
			for (int i = polje.length-1-c2; i > -1+c1; i--) {
				if (polje[i][0+c3] == 0 ) {
					polje[i][0+c3] = a;
					a += 1;
				}
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
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for (int b = 0; b < x; b++) {
			
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
}
