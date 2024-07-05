package il.ac.tau.cs.sw1.ex9.starfleet;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Map.Entry;


public class StarfleetManager {

	/**
	 * Returns a list containing string representation of all fleet ships, sorted in descending order by
	 * fire power, and then in descending order by commission year, and finally in ascending order by
	 * name
	 */
	public static List<String> getShipDescriptionsSortedByFirePowerAndCommissionYear (Collection<Spaceship> fleet) {
		
		ArrayList<Spaceship> fleet_list = new ArrayList<>(fleet);
		Comparator<Spaceship> comp = new myShipComparator();
		fleet_list.sort(comp);
		//Collections.sort(fleet_list, new myShipComparator());
		ArrayList<String> sorted = new ArrayList<>();
		for(Spaceship p : fleet_list) {
			sorted.add(p.toString()); //if we wrote p, it would work as well
		}
		
		return sorted;
	}

	/**
	 * Returns a map containing ship type names as keys (the class name) and the number of instances created for each type as values
	 */
	public static Map<String, Integer> getInstanceNumberPerClass(Collection<Spaceship> fleet) {
		
		Map<String, Integer> ship_types = new HashMap<String, Integer>();
		ArrayList<Spaceship> fleet_list = new ArrayList<>(fleet);
		
		for(Spaceship p : fleet_list) {
			String curr_type = p.getClass().getSimpleName();
			if(ship_types.containsKey(curr_type) == true) {
				ship_types.put(curr_type, ship_types.get(curr_type) + 1);
			}
			else {
				ship_types.put(curr_type, 1);
			}
		}
		
		return ship_types;
	}


	/**
	 * Returns the total annual maintenance cost of the fleet (which is the sum of maintenance costs of all the fleet's ships)
	 */
	public static int getTotalMaintenanceCost (Collection<Spaceship> fleet) {
		
		int cost = 0;
		
		//collection is iterable therefore allowed
		for(Spaceship p : fleet) {
			cost += p.getAnnualMaintenanceCost();
		}
		
		return cost;
	}


	/**
	 * Returns a set containing the names of all the fleet's weapons installed on any ship
	 */
	public static Set<String> getFleetWeaponNames(Collection<Spaceship> fleet) {
		
		//a treeSet does not allow duplicates
		Set<String> result = new TreeSet<String>();
		
		for(Spaceship p : fleet) {
			
			//the only ship that doesn't have weapons is: transport ship
			if(p.getClass().getSimpleName().equals("TransportShip") != true){
				
				//the rest of the ships extend battleship or an extension of it
				myBattleShip battle_ship = (myBattleShip) p;
				List<Weapon> curr_weapons = battle_ship.getWeapon();
				
				for(Weapon curr_wep : curr_weapons) {
					
					String wep_name = curr_wep.getName();
					
					//Duplicate entries will not get added.
					result.add(wep_name);
				}
			}
		}
		
		return result;
	}

	/*
	 * Returns the total number of crew-members serving on board of the given fleet's ships.
	 */
	public static int getTotalNumberOfFleetCrewMembers(Collection<Spaceship> fleet) {
		
		int members = 0;
		
		//collection is iterable therefore allowed
		for(Spaceship p : fleet) {
			members += p.getCrewMembers().size();
		}
		
		return members;
	}

	/*
	 * Returns the average age of all OFFICERS (no other crew type) serving on board of the given fleet's ships. 
	 */
	public static float getAverageAgeOfFleetOfficers(Collection<Spaceship> fleet) {
		
		float sum_of_ages = 0;
		int counter = 0;
		
		for(Spaceship p : fleet) {
			Set<? extends CrewMember> p_crew = p.getCrewMembers();
			for(CrewMember member : p_crew) {
				if(member.getClass().getSimpleName().equals("Officer")){
					sum_of_ages += member.getAge();
					counter += 1;
				}
			}
		}
		
		return(sum_of_ages/counter);
	}

	/*
	 * Returns a map mapping the highest ranking officer on each ship (as keys), to his ship (as values).
	 */
	public static Map<Officer, Spaceship> getHighestRankingOfficerPerShip(Collection<Spaceship> fleet) {
		
		Map<Officer, Spaceship> rank_per_ship = new HashMap<Officer, Spaceship>();
		
		for(Spaceship p : fleet) {
			
			Set<? extends CrewMember> p_crew = p.getCrewMembers();
			Officer highest_ranked = null;
			boolean found_one = false;
			for(CrewMember member : p_crew) {
				
				if(member.getClass().getSimpleName().equals("Officer")) {
					if(found_one == false) {
						found_one = true;
						highest_ranked = (Officer) member;
					}
					else {
						Officer curr_member = (Officer) member;
						if(highest_ranked.getRank().compareTo(curr_member.getRank()) < 0) {
							highest_ranked = curr_member;
						}
					}
				}
			}
			if(highest_ranked != null) {
				rank_per_ship.put(highest_ranked, p);
			}
		}
		
		return rank_per_ship;
	}

	/*
	 * Returns a List of entries representing ranks and their occurrences.
	 * Each entry represents a pair composed of an officer rank, and the number of its occurrences among starfleet personnel.
	 * The returned list is sorted ascendingly based on the number of occurrences.
	 */
	public static List<Map.Entry<OfficerRank, Integer>> getOfficerRanksSortedByPopularity(Collection<Spaceship> fleet) {
		
		Map<OfficerRank, Integer> frequencies = getFrequencyOfEachRank(fleet);
		List<Map.Entry<OfficerRank, Integer>> ranks = new ArrayList<>(frequencies.entrySet());
		
		Comparator<Map.Entry<OfficerRank, Integer>> comp = new myRankFreqComparator();
		//Collections.sort(ranks, new myRankFreqComparator());
		ranks.sort(comp);
		return ranks;
	}
	
	//REPEATITIVE CODE, MAKE HELPER FUNC
	private static Map<OfficerRank, Integer> getFrequencyOfEachRank(Collection<Spaceship> fleet){
		
		Map<OfficerRank, Integer> frequencies = new HashMap<OfficerRank, Integer>();
		 
		for(Spaceship p : fleet) {
			Set<? extends CrewMember> p_crew = p.getCrewMembers();
			for(CrewMember member : p_crew) {
				if(member.getClass().getSimpleName().equals("Officer")){
					Officer officer = (Officer) member;
					if(frequencies.containsKey(officer.getRank())) {
						frequencies.put(officer.getRank(), frequencies.get(officer.getRank()) + 1);
					}
					else {
						frequencies.put(officer.getRank(), 1);
					}
				}
			}
		}
		
		return frequencies;
	}

}
