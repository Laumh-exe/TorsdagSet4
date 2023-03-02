import java.util.Scanner;

class main{
	
	public static void main(String[] args) {

		int retirementAge = 67;

		// Ask question
		System.out.println("Please type your name");

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Declare name and assign to scanners call to nextLine()
		String name = input.nextLine();
		
		// Print name of user
		System.out.println("Hello " + name + ". Please type your age");

		// Get age from user
		int age = input.nextInt();

		// Print age
		System.out.println(age);


		// Calculate year until retirement
		int untilRetirement = retirementAge - age;

		// Print result
		System.out.println("Years until retirement: " + untilRetirement);

	}

}