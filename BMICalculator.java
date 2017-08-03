import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, ft, in, lbs;
		
		System.out.print( "Your height (feet only): " );
		ft = keyboard.nextDouble();
		System.out.print( "Your height (inches): ");
		in = keyboard.nextDouble();
		m = ((ft*0.3048)+(in*0.0254));
		
		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();
		kg = (lbs*0.453592);
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}