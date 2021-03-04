package achievements;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import baseClass.Driver;

public class TC_Achievements_PreCondition extends Driver{

	@BeforeTest
	public void achievementsPreCondition()
	{
		System.out.println("Stop the services");
		System.out.println("Copy config files related to Achievements module");
		System.out.println("Restart the services");
	}
	
	@AfterTest
	public void achievementsPostCondition()
	{
		System.out.println("Kill the services");
	}
}
