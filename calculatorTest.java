package calc;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {

	@Test
	void test() 
	{
		Add addtest = new Add();
		Subtract subtracttest = new Subtract();	
		Multiply multiplytest = new Multiply();
		Divide dividetest = new Divide();
		
		assertEquals(9,addtest.addTwonumbers(6,3));
		assertEquals(3,subtracttest.subtractTwonumbers(6,3));
		assertEquals(18,multiplytest.multiplyTwonumbers(6,3));
		assertEquals(2,dividetest.divideTwonumbers(6,3));
		
		//fail("Not yet implemented");
	}

}
