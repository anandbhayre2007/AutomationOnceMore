package webElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser2 {

	WebDriver dr;
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\89\\chromedriver.exe");		
		dr= new ChromeDriver();		
		dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/index.php");
	}
}
