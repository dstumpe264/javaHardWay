import java.util.Scanner;

public class 08RudeQuestions {
	public static void main( String[] args ){
		String name, job;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello, What is your name? ");
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("Where do you work " +name+ "? ");
		job = keyboard.next();
		
		System.out.println( job + "?? Sounds horrible!! Only kidding " + name );
		System.out.print( "Finally, what's your income, " + name + "? ");
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, ");
		System.out.println( name + "." );
	}
}
/*1. No it doesn't blow up. The double takes the integer and adds
		.0 to it. It's convertible, the double add a floating point to an integer.
  2. No. Numbers can be a string. But it won't be the same. You can't do math, it'll just be the numbers. 
  3. Any integer or double value has to hold a numeric value.
	 Integers can't have a floating point value. 
	 I really couldn't get any strings to blow up. Whatever you type it'll use.
	 Actually when I tried to type my full name with quotations it blew up. I think because the last part of my name wasn't of the type for the next variable.
	 
	 When the human types a space it will use that value for the next answer
	 and is not included on the present answer. 
*/
