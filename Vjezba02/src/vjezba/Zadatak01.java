package vjezba;

import javax.swing.JOptionPane;

public class Zadatak01 {
//	Za upisani cijeli broj program ispisuje je li paran ili neparan.
	
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		if (x%2 == 0) {
			System.out.println("paran");
		}else {
			System.out.println("neparan");
		}
		
	}
	
}
