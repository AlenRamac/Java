package scanner;

public class Zadatak1 {
	
	public static void main(String[] args) {
		var skn = new java.util.Scanner(System.in);
		System.out.println("Unesi koordinate 3 tocke(x y)");
		System.out.print("Prva tocka: ");
		double xA = skn.nextInt(), yA = skn.nextInt();
		System.out.print("Druga tocka: ");
		double xB = skn.nextInt(), yB = skn.nextInt();
		System.out.print("Treca tocka: ");
		double xC= skn.nextInt(), yC = skn.nextInt();
		System.out.printf("Prva tocka je (%1.2f, %1.2f), druga je (%1.2f, %1.2f), a treca je ( %1.2f, %1.2f).%n", xA, yA, xB, yB, xC, yC);
		double a = duljinaStranice(xB, yB, xC, yC);
		double b = duljinaStranice(xC, yC, xA, yA);
		double c = duljinaStranice(xA, yA, xB, yB);
		double s = (a+b+c)/2;
		double P = (double)Math.abs(xA*(yB-yC) + xB*(yC-yA) + xC*(yA-yB))/2;
		System.out.printf("Površina je %1.2f.", P);
	}
	
	private static double duljinaStranice(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
	
}
