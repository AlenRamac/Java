package scanner;

public class Printf {
	
	public static void main(String[] args) {
		var skn = new java.util.Scanner(System.in);
		System.out.println("Unesi dva cijela broja: ");
		int a = skn.nextInt(), b = skn.nextInt();
		System.out.printf("Prvi broj je %d, a drugi broj je %d.%n", a, b);
		System.out.printf("%2$d %d", a ,b);
		}
	
}
