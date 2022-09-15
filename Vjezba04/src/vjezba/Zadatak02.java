package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak02 {
	// Program unosi jedan cijeli broj
	// između 10 i 20. U slučaju da broj
	// nije u tom rasponu program se završava
	// Program ispisuje tablicu množenja lijepo formatiranu
//	 	 1   2   3   4   5   6   7   8   9   10
//		 2   4   6   8  10  12  14  16  18   20
//		 3   6   9  12  15  18  21  24  27   30
//		 4   8  12  16  20  24  28  32  36   40
//		 5  10  15  20  25  30  35  40  45   50
//		 6  12  18  24  30  36  42  48  54   60
//		 7  14  21  28  35  42  49  56  63   70
//		 8  16  24  32  40  48  56  64  72   80
//		 9  18  27  36  45  54  63  72  81   90
//		10  20  30  40  50  60  70  80  90  100
	
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj (10-20)"));
		if (x<10 || x>20) {
			System.out.println("Nepravilan unos.");
		}else {
			int[][] tablica = new int [x][x];
			for (int i = 0; i < tablica.length; i++) {
				int a = (i+1);
				for (int j = 0; j < tablica[0].length; j++) {
					tablica[i][j] = a;
					a += (i+1);
				}
			}

			for (int i = 0; i < tablica.length; i++) {
				for (int j = 0; j < tablica[0].length; j++) {
					//jednoznamenkasti
					if (tablica[i][j] < 10) {
						System.out.print("   " + tablica[i][j]);	
					}
					//dvoznamenkasti
					if (tablica[i][j] > 9 && tablica[i][j] < 100) {
						System.out.print("  " + tablica[i][j]);	
					}
					//troznamekasti
					if (tablica[i][j] > 99 && tablica[i][j] < 1000) {
						System.out.print(" " + tablica[i][j]);	
					}
				}
				System.out.println();
			}
		}
		
	}
	
}
