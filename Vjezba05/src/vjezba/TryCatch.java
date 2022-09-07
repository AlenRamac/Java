package vjezba;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		
		int a = 0;
		while (true) {
			try {
				a = Integer.parseInt(JOptionPane.showInputDialog("unesi broj"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Neispravan unos");
			}
		}
		System.out.println(a);
		
	}
	
}
