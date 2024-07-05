package il.ac.tau.cs.sw1.ex9.starfleet;

public class Cylon extends myCrewMember {

	private int model_number; //between 1-12
	
	public Cylon(String name, int age, int yearsInService, int modelNumber) {
		
		super(age, yearsInService, name);
		model_number = modelNumber;
	}
	
	public int getModelNumber() {
		return model_number;
	}
}
