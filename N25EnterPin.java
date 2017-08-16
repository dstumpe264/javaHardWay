import java.util.Scanner;

public class N25EnterPin{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String typedPassword;
		
		pin = 12345;
		
		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PASSWORD: ");
		typedPassword = keyboard.next();
		
		while (! typedPassword.equalsIgnoreCase("password") ){
			System.out.println("INCORRECT PASSWORD. TRY AGAIN");
			System.out.print("ENTER YOUR PASSWORD: ");
			typedPassword = keyboard.next();
		}
			
		System.out.print("\nPASSWORD ACCEPTED. ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
		
		while (entry != pin ) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		
		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $0.0");
	}
}