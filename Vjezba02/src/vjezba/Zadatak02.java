package vjezba;

import javax.swing.JOptionPane;

public class Zadatak02 {
//	Za unos tri cijela broja program ispisuje najveci
	
	public static void main(String[] args) {
		
		int x1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int x2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int x3 = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));
		
		if (x1>x2 && x1>x3) {
			System.out.println(x1);
 		}else if(x2>x1 && x2>x3) {
 			System.out.println(x2);
 		}else {System.out.println(x3);
 		}
	}
	
}
