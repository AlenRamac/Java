package vjezba;

public class VjezbaSwitch {

	public static void main(String[] args) {
		
		int ocijenaBroj = 5;
		
		if (ocijenaBroj==1) {
			System.out.println("Nedovoljan");
		}else if(ocijenaBroj==2) {
			System.out.println("Dovoljan");
		}else if(ocijenaBroj==3) {
			System.out.println("Dobar");
		}else if(ocijenaBroj==4) {
			System.out.println("Vrlo dobar");
		}else if(ocijenaBroj==5){
			System.out.println("Odlican");
		}else {
			System.out.println("Nepravilan unos");
		}
		
		String ocjena;
		
		switch (ocijenaBroj) {
		case 1:
			ocjena="Nedovoljan";
			break;
		case 2:
			ocjena="Dovoljan";
			break;
		case 3:
			ocjena="Dobar";
			break;
		case 4:
			ocjena="Vrlo dobar";
			break;
		case 5:
			ocjena="Odlican";
			break;
		default:
			ocjena="Nepravilan unos";
			break;
		}
		
		System.out.println(ocjena);
	}
	
}
