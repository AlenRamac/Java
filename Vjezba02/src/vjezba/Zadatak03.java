package vjezba;

import javax.swing.JOptionPane;

public class Zadatak03 {
//	Program unosi broj izmedu 1 i 99. 
//	U slucaju da je izvan tog raspona ispisati gresku i prekinuti program. 
//	Program ispisuje deseticu i jedinicu broja.
	
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		if (x<1 || x>99) {
			System.out.println("Nepravilan unos");
		}else {
			System.out.println(x/10 +" "+ x%10);
		}
		
	}
	
}
