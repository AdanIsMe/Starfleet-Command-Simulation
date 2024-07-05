package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class myBattleShip extends mySpaceship {
	
	protected List<Weapon> ship_weapons;
	protected int total_fire_power; //for the weapons
	protected int total_annual_costs; //for the weapons
	
	public myBattleShip(String name, int comm, float mspeed, Set<? extends CrewMember> crew, List<Weapon> weapons) {
		//might not need to send comm anywhere, since they all use base, and then math equations in get funcs
		//also maybe not
		
		super(name, comm, mspeed, crew);
		ship_weapons = new ArrayList<Weapon>(weapons);
		total_fire_power = 0;
		total_annual_costs = 0;
		
		for(Weapon weapon : weapons) {
			total_fire_power += weapon.getFirePower();
			total_annual_costs += weapon.getAnnualMaintenanceCost();
		}
		
		this.fire_power += this.total_fire_power;
	}
	
	@Override
	public int getFirePower() {
		// TODO Auto-generated method stub
		return BASE_FIREPOWER + total_fire_power;
	}
	
	//for users
	public List<Weapon> getWeapon(){
		return ship_weapons;
	}
	
	//helper func
	public int getNumOfCrewMembers() {
		 Set<? extends CrewMember> crew = super.getCrewMembers();
		 return crew.size();
	}
	
	
	@Override
	public String toString() {
		
		String result = super.toString();
		
		//enter
		result += System.lineSeparator();
				
		//tab
		result += "\t";
		
		result += "WeaponArray=";
		result += ship_weapons;
		return result;
	}
	

}
