package il.ac.tau.cs.sw1.ex9.starfleet;

public class Officer extends CrewWoman {
		
	OfficerRank officer_rank;
	
	public Officer(String name, int age, int yearsInService, OfficerRank rank) {
		
		super(age, yearsInService, name);
		officer_rank = rank;
	}
	
	public OfficerRank getRank() {
		return officer_rank;
	}
}
