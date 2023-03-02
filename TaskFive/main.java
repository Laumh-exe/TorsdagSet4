import java.util.ArrayList;

class main{
	
	public static void main(String[] args) {
		ArrayList<String> actions = new ArrayList<String>();

		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		// Instantiate GameMenu
		GameMenu gameMenu = new GameMenu(actions);
		
		// Call displaymenu method
		gameMenu.displayMenu();

		// Initialise choice varible with getAction method
		String userChoice = gameMenu.getAction();
		int userNr = Integer.parseInt(userChoice);

		doAction(userNr);
	}

	public static void doAction(int action) {

		// Create switch
		switch(action) {
		case 1: 
			System.out.println("Starting the game now");
			break;
		case 2: 
			System.out.println("Fetching previously saved game data");
			break;
		case 3: 
			System.out.println("Game Paused");
			break;
		case 4: 
			System.out.println("Ending game"); 
			break;
		default:
			System.out.println("ERROR: Input does not correspond to an option");
			break;
		}

	}

}