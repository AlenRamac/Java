package vjezba;

public class VjezbaIF {

	public static void main(String[] args) {
		
		boolean x = false;
		
		if (x) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		int a = 7;
		
		if (a>0) {
			System.out.println("2");
		}
		
		x = a>0;	
		if (x) {
			System.out.println("3");
		}
		
		if (a==7) {
			System.out.println("4");
		}
		
		if (a!=0) {
			System.out.println("5");
		}
		
		if (a>0 && a<10) {
			System.out.println("6");
		}
		
		if (a==3 || a==4) {
			System.out.println("7");
		}
	
		if (a>0) {
			if(a==1) {
				System.out.println("8");
			}else if(a==2) {
				System.out.println("9");
			}else if(a==3) {
				System.out.println("10");
			}else {
				System.out.println("11");
			}

		}
		
		int i = 1;
		int j = 3;
		
		System.out.println(i>j ? i:j);
		
	}
	
}
