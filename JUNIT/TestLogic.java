package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestLogic {

	@Test
	public void testFindMax(){
		assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
	}
	@ Test 
	public void testFindMax1()
	{
		assertEquals(-4,Calculation.findMax(new int[]{-12,-3,-4,-2}));
		
	}
}
