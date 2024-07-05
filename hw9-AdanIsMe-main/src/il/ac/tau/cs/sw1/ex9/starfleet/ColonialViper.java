package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ColonialViper extends myBattleShip {

	private static int BASE_VIPER_COST = 4000;
	
	public ColonialViper(String name, int commissionYear, float maximalSpeed, Set<CrewWoman> crewMembers,
			List<Weapon> weapons) {

		super(name, commissionYear, maximalSpeed, crewMembers, weapons);
		
		int cost = Math.round(BASE_VIPER_COST + this.total_annual_costs + 500 * (crewMembers.size()) + 500 * super.getMaximalSpeed());
	
		annual_maintian = cost;

	}
}
