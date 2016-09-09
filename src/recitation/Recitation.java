package recitation;

import java.util.Scanner; 


public class Recitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//asks the user for his/her name and then welcomes the user (by name, of course)
		System.out.println("Please enter your name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Welcome "+name+" to Recitation for CIT 591!");
		
		// Ask the user for his/her age. Report back to the user the square root of their age. 
		System.out.println("Please enter your age: ");
//		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		double sqrtAge = Math.sqrt(age);
		System.out.println("The square root of your age is: "+sqrtAge);
		
		//Ask the user to enter your partner's age. Store this age in a different variable.
		System.out.println("Please enter your partner's age");
		int partnerAge = input.nextInt();
		
		int productOfAge = age * partnerAge;
		int quotientOfAge = age / partnerAge;
		int modOfAge = age % partnerAge;
		
		System.out.println("The product of your age is " + productOfAge);
		System.out.println("The quotient of your age is " + quotientOfAge);
		System.out.println("The remainder of your age is " + modOfAge);
		

	}

}
