
public class uebung3 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		double celsius, fahrenheit, zucelsius;
		String eingabe;
		System.out.print("Machen Sie die Eingabe in Grad Celsius: ");
		eingabe = scan.next();
		celsius = Double.parseDouble(eingabe);
		fahrenheit = celsius2fahrenheit (celsius);
		zucelsius = fahrenheit2celsius (fahrenheit);
		System.out.println(celsius +" sind " + fahrenheit);
		System.out.println(fahrenheit +" sind " + zucelsius);
	}

	public static double celsius2fahrenheit (double celsius) {
		double fahrenheit=((celsius*9.0)/5.0)+32;
		return fahrenheit;
	}
	
	public static double fahrenheit2celsius (double fahrenheit) {
		return (fahrenheit-32)*5/9;
	}
}
