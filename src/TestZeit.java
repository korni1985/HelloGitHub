import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TestZeit {

	public static void main(String[] args) {

		LocalDate jetzt = LocalDate.now();
		DateTimeFormatter myformatter =
				DateTimeFormatter.ofPattern ( "EEEE, d. MMM yyyy");
		System.out.println("Heute ist " + myformatter.format(jetzt)+ ".");
		System.out.println("ein weiteres Bespiel.....");
		java.util.Random r = new java.util.Random();
		int x = r.nextInt(1000);
		System.out.println("eine Zufallszahl: " + x);
	}

}
