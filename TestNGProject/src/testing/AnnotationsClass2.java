package testing;

import org.testng.annotations.Test;

public class AnnotationsClass2 {
	
	@Test(priority=0)
	public void login() throws Exception
	{
		System.out.println("Login test");
		
		throw new Exception("Some exception occurred while login");
	}
	
	@Test(priority=1, dependsOnMethods = {"login"})
	public void sendEmail()
	{
		System.out.println("Send email");
	}
	
	@Test(priority=2, dependsOnMethods = {"sendEmail"})
	public void logout()
	{
		System.out.println("Logout");
	}

}
