package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class TransportShip extends mySpaceship {

	private int cargo_capacity;
	private int passenger_capacity;
	
	public TransportShip(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, int cargoCapacity, int passengerCapacity){
	
		super(name, commissionYear, maximalSpeed, crewMembers);
		cargo_capacity = cargoCapacity;
		passenger_capacity = passengerCapacity;
		annual_maintian = super.getAnnualMaintenanceCost() + (5 * cargo_capacity) + (3 * passenger_capacity);
	}

	
	public int getCargoCapacity() {
		return cargo_capacity;
	}
	
	public int getPassengerCapacity() {
		return passenger_capacity;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return ship_name;
	}

	@Override
	public int getCommissionYear() {
		// TODO Auto-generated method stub
		return comm_year;
	}

	@Override
	public float getMaximalSpeed() {
		// TODO Auto-generated method stub
		return max_speed;
	}

	@Override
	public int getFirePower() {
		// TODO Auto-generated method stub
		return fire_power;
	}

	@Override
	public Set<? extends CrewMember> getCrewMembers() {
		// TODO Auto-generated method stub
		return crew_members;
	}

	public String toString() {
		
		String result = super.toString();
		
		//enter
		result += System.lineSeparator();
				
		//tab
		result += "\t";
		
		result += "CargoCapacity=";
		result += cargo_capacity;
		
		//enter
		result += System.lineSeparator();
				
		//tab
		result += "\t";
		
		result += "PassengerCapacity=";
		result += passenger_capacity;
		
		return result;
	}
	
}
