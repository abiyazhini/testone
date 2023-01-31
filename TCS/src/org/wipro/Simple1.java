package org.wipro;
import org.tcs.Sample1;

public class Simple1 extends Sample1 {

	
	//using extends
	public static void main(String[] args) {
		Simple1 s1=new Simple1();
		s1.protectedBus();
		s1.publicBus();

		
		//using objects
		Sample1 s=new Sample1();
		s.publicBus();
		
	}

}
