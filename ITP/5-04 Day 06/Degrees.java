/*  Input a temperature in Fahrenheit degrees.  Print the temperature
    in Fahrenheit and Celsius  */
public class Degrees {
	public static void main(String[] args) {
		double fahrenheit = Double.parseDouble(args[0]);
        double cTemp = f2c(fahrenheit);
		System.out.printf("%.2f\u00b0F is %.2f\u00b0C\n", fahrenheit, cTemp);
	}
	public static double f2c(double fTemp) {
		// Function that returns a Celsius temerature for a supplied
		//    fahrenheit temperature
		double cTemp = (fTemp-32)*5/9;
		return cTemp;
	}
}