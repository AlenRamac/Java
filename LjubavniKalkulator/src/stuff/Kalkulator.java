package stuff;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Kalkulator {

	public Kalkulator() {
		unosiBrojanje();
	}


	public void brojacSlova(String ime1, String ime2) {
		int[] imenaInt = new int[ime1.length()+ime2.length()+1];
		char[] imena = spojiString(ime1, ime2);
		String a;
		String b;
		int[] prvoInt = new int[ime1.length()];
		int[] drugoInt = new int[ime2.length()];
		
		for (int i = 0; i < imena.length; i++) {
			imenaInt[i]=0;
			for (int j = 0; j < imena.length; j++) {
				a = Character.toString(imena[i]);
				b = Character.toString(imena[j]);
				if(a.compareToIgnoreCase(b)==0) {
					imenaInt[i]++;
				}
			}
		}
		for (int i = 0; i < ime1.length(); i++) {
			prvoInt[i]=imenaInt[i];
			System.out.print(prvoInt[i]);
		}
		
		System.out.print(" ");
		
		for (int i = 0; i < ime2.length(); i++) {
			drugoInt[i]=imenaInt[i+ime1.length()+1];
			System.out.print(drugoInt[i]);
		}
		System.out.println();
		List<Integer> zbrojeno = zbroj(prvoInt, drugoInt);
		for(int x:zbrojeno) {
			System.out.print(x);
		}
	}
	
	
	public char[] spojiString(String ime1, String ime2) {
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
		System.out.println(spojiString(prvo, drugo));
		brojacSlova(prvo, drugo);
	}
	
	public List<Integer> zbroj(int[] prva, int[] druga) {
		
		int i = druga.length-1;
		int j = 0;
		List<Integer> rezultat = new ArrayList<>();
		
		for(int a:prva) {
			prva[j]=a + druga[i];
			i--;
			j++;
			if (i<0) {
				break;
			}
		}
		for(int a:prva) {
			rezultat.add(a);
		}
		if (prva.length<druga.length) {
			for (int k = druga.length-prva.length-1; k >= 0 ; k--) {
				rezultat.add(druga[k]);
			}
		}
		return rezultat;
	}
	
	public static void main(String[] args) {
		new Kalkulator();
	}
	
}