package il.ac.tau.cs.sw1.ex9.starfleet;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StealthCruiser extends Fighter {
	
	private static int counter = 0;
	
	public StealthCruiser(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons) {
	
		super(name, commissionYear, maximalSpeed, crewMembers, weapons);
		counter += 1;	
	}


	public StealthCruiser(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers) {

		this(name, commissionYear, maximalSpeed, crewMembers, StealthCruiser.getDefaultWeapons());
		//since we are calling the previous constructor, it handles the counter on its own
	}
	
	private static List<Weapon> getDefaultWeapons() {
		List<Weapon> default_weapons = new ArrayList<Weapon>();
		default_weapons.add(new Weapon ("Laser Cannons",10,100));
		return default_weapons;
	}
	
	@Override
	public int getAnnualMaintenanceCost() {
		
		//counter is not done in constructor
		return super.getAnnualMaintenanceCost() + (50 * counter);
	}
}
