package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class Bomber extends myBattleShip {
	
	private static final int BASE_BOMB_COST = 5000;
	private int number_of_technicians;
	
	public Bomber(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons, int numberOfTechnicians){
	
		super(name, commissionYear, maximalSpeed, crewMembers, weapons);
		number_of_technicians = numberOfTechnicians;

		int cheaper = Math.round(super.total_annual_costs - (float)((number_of_technicians * 0.1) * super.total_annual_costs));
		annual_maintian = BASE_BOMB_COST + cheaper;
		
	}

	public String toString() {
		//t for tab
		//line separator for enter
		///////////////////might need to add annual costs to it///////////////
		String s = super.toString() + System.lineSeparator() + "\t" + "NumberOfTechnicians=" + this.getNumberOfTechnicians();
		return s;
	}
	
	public int getNumberOfTechnicians() {
		return number_of_technicians;
	}

}
