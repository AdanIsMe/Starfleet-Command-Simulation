package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CylonRaider extends myBattleShip {

	private static int BASE_RAIDER_COST = 3500;

	
	public CylonRaider(String name, int commissionYear, float maximalSpeed, Set<Cylon> crewMembers,
			List<Weapon> weapons) {

		super(name, commissionYear, maximalSpeed, crewMembers, weapons);
		
		annual_maintian = Math.round(BASE_RAIDER_COST + super.total_annual_costs + 500 * (crewMembers.size()) + 1200 * this.getMaximalSpeed());
	}
}
