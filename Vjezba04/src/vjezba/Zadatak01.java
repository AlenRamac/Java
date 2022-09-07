package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak01 {
	// Deklarirajte niz od 4 cijela broja,
	// u niz učitajte vrijednosti od korisnika
	// ispišite sumu svih upisanih vrijednosti

	public static void main(String[] args) {
			
		float[] niz = new float [4];
		float rez = 0;
		for (int i = 0; i < niz.length; i++) {
			niz[i] = Float.parseFloat(JOptionPane.showInputDialog("Unesi Broj"));
		}
		for (int i = 0; i < niz.length; i++) {
			rez += niz[i];
		}
		System.out.println(Arrays.toString(niz));
		System.out.println(rez);
	}
	
}
