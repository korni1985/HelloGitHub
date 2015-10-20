
public class TestRechnung {

	public static void main(String[] args) {

		double laenge = 10.9;
		double breite = 17.3;
		double umfang = (laenge+breite)*2;
		double flaeche = (laenge*breite);
		System.out.println ("die Flaeche beträgt: "+flaeche);
		System.out.println ("der Umfang beträgt: "+umfang);
		
		int a,b;
		a=2;
		b=2;
		boolean ok = (a==b);
		if(ok) {System.out.println("a und b enthalten den gleichen wert. "+a);
		}
	}

}
