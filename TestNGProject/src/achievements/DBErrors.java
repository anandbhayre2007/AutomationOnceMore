package achievements;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DBErrors extends TC_Achievements_PreCondition{
	
	@BeforeClass
	public void dbErrorsPreCondition()
	{
		System.out.println("Update config files to 20 from 900");
		System.out.println("Run the jobs");
		System.out.println("Update DB settings ");
	}
	
	@AfterClass
	public void dbErrorsPostCondition()
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
		System.out.println("Achievements DBErrors test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Achievements DBErrors test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Achievements DBErrors test3");
	}
	
	@Test
	public void achievements_saveAchievement_userInitiated()
	{
		
		try
		{
			//Create user
			System.out.println("Create user");
			
			//Upload test data
			System.out.println("Upload test data");
			
			//first spin
			System.out.println("First spin");
			
			//second spin
			System.out.println("Second spin");
			
			//insert error
			System.out.println("Insert error");
			
			//third spin
			System.out.println("Third spin");
			
			//validate error in response
			System.out.println("You should get error on front end");
			
			//Validate log file
			System.out.println("Error should present in log file");
			
			//Revert the change
			System.out.println("Remove error from db");
			
			System.out.println("Refresh the game");
			
			System.out.println("Validate database");
			
			
		}catch(Exception e)
		{
			System.out.println("Log the error in to report");
		}finally {
			
			System.out.println("Validate log file - no other error should present in log file");
			System.out.println("Remove the error if it is not removed");
		}
		
		
	}
}
