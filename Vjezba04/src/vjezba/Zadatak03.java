package vjezba;

public class Zadatak03 {

	// Za dani jednodimenzinalni niz
	// cjelih brojeva program ispisuje 
	// najveći
	
	public static void main(String[] args) {
		int najveci = 0;
		int[] niz = {5,5,8,6,-6,8,-1,0,9,0};	//9
		for (int i = 0; i < niz.length; i++) {
			if (najveci<niz[i]) {
				najveci=niz[i];
			}
		}
		System.out.println(najveci);
	}
}
