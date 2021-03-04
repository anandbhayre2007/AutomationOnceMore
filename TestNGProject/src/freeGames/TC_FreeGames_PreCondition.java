package freeGames;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import baseClass.Driver;

public class TC_FreeGames_PreCondition  extends Driver{


	@BeforeTest
	public void freeGamesPreCondition()
	{
		System.out.println("Stop the services");
		System.out.println("Copy config files related to freeGames module");
		System.out.println("Restart the services");
	}
	
	@AfterTest
	public void freeGamesPostCondition()
	{
		System.out.println("Kill the services");
	}
}
