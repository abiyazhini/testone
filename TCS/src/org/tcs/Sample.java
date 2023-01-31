package org.tcs;


public class Sample extends Sample1{

	public static void main(String[] args) {
		Sample s = new Sample();
		s.protectedBus();
		s.publicBus();
		s.defaultBus();
	}

}
