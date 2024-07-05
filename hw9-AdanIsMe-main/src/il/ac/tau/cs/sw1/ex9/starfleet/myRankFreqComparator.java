package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class myRankFreqComparator implements Comparator<Map.Entry<OfficerRank, Integer>> {

	@Override
	public int compare(Entry<OfficerRank, Integer> o1, Entry<OfficerRank, Integer> o2) {
		//comparing integers is normal
		if(o1.getValue() > o2.getValue()) {
			return 1; //upper order
		}
		else {
			if(o1.getValue() < o2.getValue()) {
				return -1;
			}
			
			//we only get here if values are equal
			return o1.getKey().compareTo(o2.getKey());
		}
	}

}
