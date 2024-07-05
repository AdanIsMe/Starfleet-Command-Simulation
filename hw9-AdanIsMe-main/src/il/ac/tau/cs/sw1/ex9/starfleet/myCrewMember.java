package il.ac.tau.cs.sw1.ex9.starfleet;

public abstract class myCrewMember implements CrewMember{
	protected int member_age;
	protected int years_in_service;
	protected String member_name;
	
	public myCrewMember(int age, int years, String name) {
		member_age = age;
		years_in_service = years;
		member_name = name;
	}
	
	public int getAge() {
		// TODO Auto-generated method stub
		return member_age;
	}

	public int getYearsInService() {
		// TODO Auto-generated method stub
		return years_in_service;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return member_name;
	}	
}
