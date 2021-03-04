package testing;

import org.testng.annotations.Test;

public class Annotations {

	
	
	@Test(priority=0)
	public void test2()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=1)
	public void test3()
	{
		System.out.println("Test case 3");
	}
	
	@Test(priority=2)
	public void test1()
	{
		System.out.println("Test case 1");		
	}
}
