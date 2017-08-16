public class N05CreatingVariables {
	public static void main( String[] args ) {
		int x, y, z, age;
		double seconds, minutes, e, checking;
		String firstName, lastName, title, branch;
		
		x = 10;
		y = 400;
		z = -150;
		age = 39;
		
		seconds = 4.71;
		minutes = 5.12; 
		e = 2.71828182845904523536;
		checking = 1.89;
		
		firstName = "David";
		lastName = "Stumpe";
		title = "CPL";
		branch = "United States Marine Corps";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "Integers like z can be negative, such as" + z +".");
		System.out.println( "The experiment took " + seconds + " seconds.");
		System.out.println( "Minutes: " + minutes);
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( "I serve in the " + branch);
	}
}
