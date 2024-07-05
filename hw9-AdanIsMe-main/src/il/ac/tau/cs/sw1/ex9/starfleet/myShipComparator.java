package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Comparator;

public class myShipComparator implements Comparator<Spaceship>{

	@Override
	public int compare(Spaceship o1, Spaceship o2) {
		// TODO Auto-generated method stub
		
		if(o1.getFirePower() > o2.getFirePower()) {
			return -1;
		}
		else {
			if(o1.getFirePower() < o2.getFirePower()) {
				return 1;
			}
			//in the case that fire power is equal, we check the next thing
			else {
				if(o1.getCommissionYear() > o2.getCommissionYear()) {
					return -1;
				}
				else {
					if(o1.getCommissionYear() < o2.getCommissionYear()) {
						return 1;
					}
					else {
						return (o1.getName()).compareTo(o2.getName());
				
					}
				}
			}
		}
	}
}
