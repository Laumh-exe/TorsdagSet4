import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
	
	// Add ArrayList<String>
	private ArrayList<String> actions = new ArrayList<String>();

	public GameMenu(ArrayList<String> actions) {
		this.actions = actions;
	}

	public void displayMenu() {
		for(String s : this.actions) {
			System.out.println(s);
		}
	}

	public String getAction() {

		// Ask user
		System.out.println("Type a number to choose and action.");
		displayMenu();

		// Create Scanner and use
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine();

		return choice;
	}
}