public class Main{
	public static void main(String[] args){
		System.out.println("Hello World!");
		SearchPage sp = new SearchPage("soroush");
		System.out.println(sp.name);
		Team t1 = new Team("Iran");
		Player p1 = new Player("Ali", t1);
		Player p2 = new Player("Mohammad", t1);
		Player p3 = new Player("Hassan", t1);
		Player p4 = new Player("Sarah", t1);
		for(Player p : t1.teamPlayers){
			System.out.println(p.name);
		}
		sp.soroush = 3;
		System.out.println(sp.toString());
	}
}
