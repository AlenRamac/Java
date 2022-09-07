package vjezba;

public class Methods {

	public static void main(String[] args) {
		
		int[] polje = {1, 2, 3, 4, 5};
		
		ime();
		randomNumberBetween(2, 10);
		System.out.println(suma(polje));
	}

	private static int suma(int[] polje) {
		
		int suma = 0;
		
		for(int b:polje) {
			suma+=b;
		}
		
		return suma;
	}

	private static int randomNumberBetween(int a, int b) {
		int i;
		while (true) {
			i=(int)(Math.random()*100);
			if (i>=a && i<=b) {
				System.out.println(i);
				break;
			}
		}
		return i;
		
	}

	private static void ime() {
		System.out.println("Alen Ramac");
	}
	
	
	
}
