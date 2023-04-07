package stuff;

import javax.swing.JOptionPane;

public class Kalkulator2 {

	public Kalkulator2(){
		String ime1 = JOptionPane.showInputDialog("Prvo ime:");
		String ime2 = JOptionPane.showInputDialog("Drugo ime:");
		System.out.print(ime1);
		System.out.print(" ");
		System.out.println(ime2);
		int[] a=brojacSlova(ime1, ime2, 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.print(" ");
		int[] b=brojacSlova(ime1, ime2, 2);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println("");
	}
	
	public char[] spojiImena(String ime1, String ime2) {
		char[] imena = new char[ime1.length()+ime2.length()];
		for (int i = 0; i < ime1.length(); i++) {
			imena[i]=ime1.charAt(i);
		}
		for (int i = 0; i < ime2.length(); i++) {
			imena[i+ime1.length()]=ime2.charAt(i);
		}
		return imena;
	}
	
	public int[] brojacSlova(String ime1, String ime2, int kojeIme) {
		int[] imenaInt = new int[ime1.length()+ime2.length()];
		char[] imena = spojiImena(ime1, ime2);
		String a;
		String b;
		int[] prvoInt = new int[ime1.length()];
		int[] drugoInt = new int[ime2.length()];
		
		for (int i = 0; i < imena.length; i++) {
			imenaInt[i]=0;
			a = Character.toString(imena[i]);
			for (int j = 0; j < imena.length; j++) {
				b = Character.toString(imena[j]);
				if(a.compareToIgnoreCase(b)==0) {
					imenaInt[i]++;
				}
			}
		}
		
		if (kojeIme==1) {
			for (int i = 0; i < ime1.length(); i++) {
				prvoInt[i]=imenaInt[i];
			}
			return(prvoInt);
		}
		for (int i = 0; i < ime2.length(); i++) {
			drugoInt[i]=imenaInt[i+ime1.length()];
		}
		
		return drugoInt;
	}
	
	public static void main(String[] args) {
		new Kalkulator2();
	}
	
}
