import java.util.ArrayList;

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
}