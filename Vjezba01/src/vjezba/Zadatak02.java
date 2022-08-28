package vjezba;

import javax.swing.JOptionPane;

public class Zadatak02 {
	
//	Napisati program koji unosi tri decimalna broja i ispisuje umnozak prvog i treceg umanjenog za drugi broj.
	
	public static void main(String[] args) {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Unesi prvi decimalni broj."));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Unesi drugi decimalni broj."));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Unesi treci decimalni broj."));
		
		System.out.println((a*c)-b);
	}
	
}
