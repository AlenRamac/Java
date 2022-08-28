package vjezba;

import javax.swing.JOptionPane;

public class Zadatak03 {

//	za unsesni troznamenkasti broj ipisite jedinicnu, deseticnu i stoticnu vrijednost
	
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi troznamenkasti broj"));
		
		int x1 = x%10;
		int x10 = x/10%10;
		int x100 = x/100;
		
		System.out.println(x1 + " " + x10 + " " + x100);
		
	}
	
}
