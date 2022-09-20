package zadatci;

import javax.swing.JOptionPane;

public class CiklicnaMatricaClockwise {

	public CiklicnaMatricaClockwise() {
		int x;
		int y;
		while (true) {
			try {
				x = Integer.parseInt(JOptionPane.showInputDialog("Broj redaka"));
				if (x<=0) {
					JOptionPane.showMessageDialog(null, "Unesi prirodni broj!");
					continue;
				}
				y = Integer.parseInt(JOptionPane.showInputDialog("Broj stupaca"));
				if (y<=0) {
					JOptionPane.showMessageDialog(null, "Unesi prirodni broj!");
					continue;
				}
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Unesi prirodni broj!");
			}
		}
		ciklicnaMatrica(x, y);
	}
	
	public void ciklicnaMatrica (int x, int y) {
		
		int[][] matrica = new int [x][y];
		int brojac = 1;
//		rubovi matrice
		int a = 0;
		int b = 0;
		int c = matrica.length-1;
		int d = matrica[0].length-1;
		
		petlja:
		while(a<=c && b<=d) {
//			a
			for (int i = b; i <= d; i++) {
				if (matrica[a][i] == 0 ) {
					matrica[a][i] = brojac;
					brojac++;
				}else {
					break petlja;
				}
			}
//			d
			for (int i = a+1; i <= c; i++) {
				if (matrica[i][d] == 0 ) {
					matrica[i][d] = brojac;
					brojac++;
				}else {
					break petlja;
				}
			}
//			c
			for (int i = d-1; i >= b; i--) {
				if (matrica[c][i] == 0 ) {
					matrica[c][i] = brojac;
					brojac++;
				}else {
					break petlja;
				}
			}
//			b
			for (int i = c-1; i > a; i--) {
				if (matrica[i][b] == 0 ) {
					matrica[i][b] = brojac;
					brojac++;
				}else {
					break petlja;
				}
			}
//			smanjivanje rubova
			a++;
			b++;
			c--;
			d--;
		}
		ispis(matrica);
	}
	
	public void ispis (int[][] matrica) {
		int max = matrica.length*matrica[0].length;
		int brojZnakova = saznajBrojZnakova(max);
		String osnovica = "", broj;
		for (int i = 0; i < brojZnakova; i++) {
			osnovica += " ";
		}
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[0].length; j++) {
				broj = osnovica + matrica[i][j];
				System.out.print(broj.substring(broj.length() - brojZnakova) + " ");
			}
			System.out.println();
		}
	}
	
	public int saznajBrojZnakova(int max) {
		int ukupno = 0;
		while (max > 0) {
			max /= 10;
			ukupno++;
		}
		return ukupno;
	}
	
	public static void main(String[] args) {
		new CiklicnaMatricaClockwise();
	}
	
}
