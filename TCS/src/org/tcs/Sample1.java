package org.tcs;

public class Sample1 {
	public void publicBus() {
		System.out.println("Public Bus");
	}
	
	private void privateBus() {
		System.out.println("Private Bus");

	}
	protected void protectedBus() {
		System.out.println("Protected Bus");

	}
    void defaultBus() {
    	System.out.println("Default Bus");

	}

	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		s1.publicBus();
		s1.privateBus();
		s1.protectedBus();
		s1.defaultBus();

	}

}
