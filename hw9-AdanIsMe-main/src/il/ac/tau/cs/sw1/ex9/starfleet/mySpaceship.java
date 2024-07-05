package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Objects;
import java.util.Set;

public abstract class mySpaceship implements Spaceship {

	protected static final int BASE_FIREPOWER = 10;
	protected static final int BASE_COST = 3000;
	protected String ship_name;
	protected int comm_year;
	protected float max_speed;
	protected int fire_power;
	protected int annual_maintian;
	protected Set<? extends CrewMember> crew_members;
	
	public mySpaceship(String name, int comm, float mspeed, Set<? extends CrewMember> crew) {
		
		ship_name = name;
		comm_year = comm;
		max_speed = mspeed;
		fire_power = BASE_FIREPOWER;
		annual_maintian = BASE_COST;
		crew_members = crew;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return ship_name;
	}

	public int getCommissionYear() {
		// TODO Auto-generated method stub
		return comm_year;
	}

	public float getMaximalSpeed() {
		// TODO Auto-generated method stub
		return max_speed;
	}

	public int getFirePower() {
		// TODO Auto-generated method stub
		return this.fire_power;
	}

	public Set<? extends CrewMember> getCrewMembers() {
		// TODO Auto-generated method stub
		return crew_members;
	}

	public int getAnnualMaintenanceCost() {
		// TODO Auto-generated method stub
		return annual_maintian;
	}

	public String toString() {
		String result = "";
		
		//crap, we need the class name, cant have that, gotta customize and add it, probably enum it?
		//or.... are we allowed that hack?
		result += this.getClass().getSimpleName();
		
		//enter
		result += System.lineSeparator();
		
		//tab
		result += "\t";
		
		result += "Name=";
		result += ship_name;
		
		//enter
		result += System.lineSeparator();
				
		//tab
		result += "\t";
		
		result += "CommissionYear=";
		result += comm_year;
		
		//enter
		result += System.lineSeparator();
				
		//tab
		result += "\t";		
		
		result += "MaximalSpeed=";
		result += max_speed;
		
		//enter
		result += System.lineSeparator();
				
		//tab
		result += "\t";
		
		result += "FirePower=";
		result += fire_power;
		
		//enter
		result += System.lineSeparator();
				
		//tab
		result += "\t";
				
		result += "CrewMembers=";
		result += crew_members.size();
		
		//enter
		result += System.lineSeparator();
				
		//tab
		result += "\t";
		
		result += "AnnualMaintenanceCost=";
		result += this.getAnnualMaintenanceCost();
		
		return result;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ship_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		mySpaceship other = (mySpaceship) obj;
		return Objects.equals(ship_name, other.ship_name);
	} 
}
