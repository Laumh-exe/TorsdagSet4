import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
		// Create a Scanner object 
    	Scanner input = new Scanner(System.in);

        if (input.hasNextDouble()) {

	    	// Read user input
	    	int guess = input.nextInt();
	    	
			// if so...
	        //   Compare it with the random number		
			if (guess == rnd_number) {
        		//   Let the user know the result of the comparison
        		System.out.println(guess + " was the right number!");
        		return;
			}
			//   Let the user try again by calling this method recursively
			//   Help the user by revealing wether the guess was lower or higher than the target number

			else if (guess < rnd_number){
				System.out.println("My number is heigher.");
				makeAGuess();
			}
			else {
				System.out.println("My number is lower.");
				makeAGuess();
			}        	
        } 
        // if input was not numeric show an error message and call this method recursively
        else {
        	System.out.println("ERROR: input was not numeric! Try again.");
        	makeAGuess();
        }
    }
   
}