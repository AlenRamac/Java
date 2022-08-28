package vjezba;

import javax.swing.JOptionPane;

public class Zadatak04 {

//	za unesena dva cijela broja upisi rezultat dijeljenja
	
	public static void main(String[] args) {
		
		int x1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int x2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		double rez = (double)x1/x2;
		
		System.out.printf("%.2f", rez);
		
		
		
		
	}
	
}
