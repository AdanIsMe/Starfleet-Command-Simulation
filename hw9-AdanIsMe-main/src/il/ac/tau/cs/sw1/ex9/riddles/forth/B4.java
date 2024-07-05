package il.ac.tau.cs.sw1.ex9.riddles.forth;

import java.util.Iterator;

public class B4 implements Iterator<String> {
	//fields
	private String[] inputs;
	private int k;
	private int i;

	//constructor
	public B4(String[] strings, int k) {
		inputs = strings;
		i = 0;
		this.k = k;
	}
	
	//implementing iterator means implementing those 2 methods:

	@Override
	public boolean hasNext() {
		if (i < (k * inputs.length)) {
			return true;
		}
		return false;
	}

	@Override
	public String next() {
		String result = inputs[(this.i)%inputs.length];
		i += 1;
		return result;
	}
}
