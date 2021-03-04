package timersAndSweepers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SweeperInitiated extends TC_TimersAndSweepers_PreCondition{

	@BeforeClass
	public void SweeperInitiatedPreCondition()
	{
		System.out.println("Pre Condition SweeperInitiated tests");
	}
	
	@AfterClass
	public void SweeperInitiatedPostCondition()
	{
		System.out.println("Revert back the changes made in before class");
	}
	
	@BeforeMethod
	public void commonPreConditionForAllTheTestCases()
	{
		System.out.println("Delete log files");
	}
	
	@AfterMethod
	public void commonPostCondition()
	{
		System.out.println("Common post condition for all the test cases");
		System.out.println("Clear global variable data");
	}
	
	@Test
	public void test1()
	{
		System.out.println("SweeperInitiated test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("SweeperInitiated test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("SweeperInitiated test3");
	}
}
