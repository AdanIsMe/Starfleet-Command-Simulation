package il.ac.tau.cs.sw1.ex9.riddles.third;

public class B3 extends A3 {
	
	public B3(String s) {
		//there's no default constructor for super class
		super(s);
	}	
	
	public void foo(String s) throws Exception{
		throw this;
	}
	
	public String getMessage() {
		return s;
	}
}
