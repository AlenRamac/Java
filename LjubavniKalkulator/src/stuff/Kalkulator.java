package stuff;

import javax.swing.JOptionPane;

public class Kalkulator {

	public Kalkulator() {
		unosiBrojanje();
//		System.out.println(spoji("John", "Jenny"));
	}
	
	public int[] brojacSlova(String ime1, String ime2) {
		int[] imeInt = new int[ime1.length()+ime2.length()+1];
		char[] chars = spoji(ime1, ime2);
		for (int i = 0; i < chars.length; i++) {
			imeInt[i]=0;
			for (int j = 0; j < chars.length; j++) {
				if(chars[i]==chars[j]) {
					imeInt[i]++;
				}
			}
		}
		imeInt[ime1.length()]=9;
//		for (int i = 0; i < ime2.length(); i++) {
//			imeInt[i+ime1.length()+1]=1;
//			for (int j = 0; j < chars.length; j++) {
//				if(chars[i]==chars[j]) {
//					imeInt[i+ime1.length()]++;
//				}
//			}
//			imeInt[i+ime1.length()]--;
//		}
//		
		return imeInt;
	}
	
	
	public char[] spoji(String ime1, String ime2) {
		char[] spojeno = new char[ime1.length()+ime2.length()+1];
		for (int i = 0; i < ime1.length(); i++) {
			spojeno[i]=ime1.charAt(i);
		}
		spojeno[ime1.length()]=' ';
		for (int i = 0; i < ime2.length(); i++) {
			spojeno[i+ime1.length()+1]=ime2.charAt(i);
		}
		return spojeno;
	}
		
	public void unosiBrojanje() {
		String prvo = JOptionPane.showInputDialog("Prvo ime:");
		String drugo = JOptionPane.showInputDialog("Drugo ime:");
//		String prvo="John";
//		String drugo="Jenny";
		System.out.println(spoji(prvo, drugo));
//		for (int i = 0; i < brojacSlova(prvo, drugo).length; i++) {
//			System.out.print(brojacSlova(prvo, drugo)[i]);
//		}
//		System.out.println();
		kalkuliranje((brojacSlova(prvo, drugo)), prvo, drugo);
	}
	
	public void kalkuliranje(int[] imeInt, String ime1, String ime2) {
		int[] prvoInt = new int[ime1.length()];
		int[] drugoInt = new int[ime2.length()];

		for (int i = 0; i < ime1.length(); i++) {
			prvoInt[i]=imeInt[i];
			System.out.print(prvoInt[i]);
		}
		
		System.out.print(" ");
		
		for (int i = 0; i < ime2.length(); i++) {
			drugoInt[i]=imeInt[i+ime1.length()+1];
			System.out.print(drugoInt[i]);
		}
		
	}
	
	public static void main(String[] args) {
		new Kalkulator();
	}
	
}
