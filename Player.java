public class Player{
	public String name;
	public Team team;
	public Player(String name, Team team){
		this.name = name;
		this.team = team;
		team.teamPlayers.add(this);
	}
}
