package JUnit;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParameterExample {
	Integer inputNumber;
	  Boolean expectedResult;
	 
	  

	 @Parameters
	 public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2, true },
	         { 6, true },
	         { 19, true },
	         { 22, false },
	         { 23, true }
	      });
	   }
	 

	   public ParameterExample(Integer inputNumber, Boolean expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }
	   
	   @Test
	   public void testPrimeNumberChecker() {
	      System.out.println("Parameterized Number is : " + inputNumber);
	      assertEquals(expectedResult, Calculation.validate(inputNumber));
	   }
	   @Test
	   public void testPrimeNumberChecker1() {
	      System.out.println("Parameterized Number is : " + inputNumber);
	      assertEquals(expectedResult, Calculation.validate(inputNumber));
	   }
	
}
