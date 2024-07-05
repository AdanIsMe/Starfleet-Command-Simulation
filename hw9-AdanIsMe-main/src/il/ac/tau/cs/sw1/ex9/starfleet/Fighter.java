package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class Fighter extends myBattleShip {
	
	protected static final int FIGHTER_BASE_COST = 2500;
	
	public Fighter(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons){

		super(name, commissionYear, maximalSpeed,crewMembers, weapons);
		
		//this.annual_maintian += this.total_annual_costs; /NEED TO CHECK THE RULE FOR THIS ONE, DESCRIPTION
		this.annual_maintian = FIGHTER_BASE_COST + super.total_annual_costs + (int)Math.round((1000 * this.getMaximalSpeed()));
	}
}
