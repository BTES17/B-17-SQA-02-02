package JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestCase2.class,TestLogic.class})



public class ParallelExecutionClasses {
/* Run multiple classes having testcases at same time parallel 
 * TestCase2 contain 2 testcase
 * TeestLogic has 1 test case
 * I Want them to run same time 
 * Create a suit/Package under in which the execeution of these classes will take place
 * Put the classses which is to be executed in the suite
 * Segegregate the test cases in classes according to the prerequisite 
 * Put the test case with same requisite in same class
 * Error Collector class the add error method add the reason with the failed test case*/
	
	
}
