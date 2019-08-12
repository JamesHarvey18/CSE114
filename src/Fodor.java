import java.util.*;

public class Fodor {

	public static void main(String[] args) {
		int i = 1;
		long factorial = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		input.close();
		
		while(i <= number) {
			factorial *= i;
			i++;
		}
		
		System.out.println("Factorial of " + number + " is: " + factorial);
		
		/*
		switch(factorial) 
		{
			case 6 : 
				System.out.println("Value is 6 and cool.");
				break;
			case 4 :
				System.out.println("Four");
				break;
		}
		*/

	}

}
