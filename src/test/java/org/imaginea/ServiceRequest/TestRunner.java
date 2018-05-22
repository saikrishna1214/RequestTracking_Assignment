package org.imaginea.ServiceRequest;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * runs the test classes that are given in
 * TestSuite class.
 * @author saikrishnak
 *
 */

public class TestRunner {

	/**
	 * prints the result true if all the test 
	 * cases are true other wise false.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestSuite.class);
		for(Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
