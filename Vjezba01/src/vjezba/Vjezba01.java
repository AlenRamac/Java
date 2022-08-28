package vjezba;

import javax.swing.JOptionPane;

public class Vjezba01 {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		int broj;
		
		broj = 2;
		
		boolean logika = true;
		
		float decimala = 2.3f;
		double decimala2 = 2.3;
		char znak = 'a';
		
		
		boolean aktivan=Boolean.parseBoolean("true");
		
		int integer=Integer.parseInt("31");
		System.out.println(integer);
		
		float f = Float.parseFloat("1e-3");
		System.out.println(f);
		
		
		
//		String unos=JOptionPane.showInputDialog("unesi broj");
//		int varijabla = Integer.parseInt(unos);
//		System.out.println(varijabla);
//		
//		varijabla +=5;
//		System.out.println(varijabla);
		
		int k,l,z,q;
		float rezultat;
		
		k=3;
		l=5;
		z=4;
		q=7;
		
		rezultat=(float)k/l;
		System.out.println(rezultat);
		
		System.out.println(q/k + " ostatak: " + q%k);
		
		int i = Integer.MAX_VALUE;
		System.out.println(i+1);
		
		double prvi = Double.parseDouble("2e+9");
		double drugi = Double.parseDouble("3e+9");
		System.out.println((int)prvi+(int)drugi);
		
		
		
		
		
	}
	
}
