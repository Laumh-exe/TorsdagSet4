class main{
	
	public static void main(String[] args) {
		// Instantiate Team classes
		Team team1 = new Team("De Bedste");
		Team team2 = new Team("De Uovervindelige");
		Team team3 = new Team("Taberne");
		Team team4 = new Team("FCK");
		Team team5 = new Team("Dem der var ok");
		Team team6 = new Team("Team 1");
	
		// Call method setRank
		team1.setRank(1);
		team2.setRank(2);
		team3.setRank(3);
		team4.setRank(4);
		team5.setRank(5);
		team6.setRank(6);

		// Print teams
		System.out.println("TEAMS: ");
		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
		System.out.println(team5);
		System.out.println(team6);
	}

}