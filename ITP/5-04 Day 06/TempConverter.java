/*  Input a temperature in Fahrenheit degrees.  Print the temperature
    in Fahrenheit and Celsius  */
public class TempConverter {
	public static void main(String[] args) {
		double fahrenheit = Double.parseDouble(args[0]);
        double cTemp = f2c(fahrenheit);
		System.out.printf("%.2f\u00b0F is %.2f\u00b0C\n", fahrenheit, cTemp);
		System.out.printf("However %.2f\u00b0C is %.2f\u00b0F\n", fahrenheit, c2f(fahrenheit));
	}
	public static double f2c(double fTemp) {
		// Function that returns a Celsius temerature for a supplied
		//    fahrenheit temperature
		double centigrade = (fTemp-32)*5/9;
		return centigrade;
	}
	public static double c2f(double cTemp) {
		// Function that returns a Fahrenheit temerature for a supplied
		//    Celsius temperature
		double fahrenheit = (cTemp*9/5)+32;
		return fahrenheit;
	}
}