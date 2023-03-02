class Team {
	
	private String teamName;
	private int teamRank;
	private String[] names;
	
	public Team(String teamName){
		this.teamName = teamName;
	}

	public void setRank(int teamRank){
		this.teamRank = teamRank;
	}

	public String toString() {
		return "Hold: "+ this.teamName + " Rang: " + this.teamRank;
	}
}