package seleniumBasicFeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Element_Webtable {

	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		
		//How to maximize the browser
		dr.manage().window().maximize();
				
		//Navigate to URL		
		dr.get("https://www.w3schools.com/html/html_tables.asp");	
		
		List<WebElement> rows=dr.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		for(int r=2; r<=rows.size(); r++)
		{
			List<WebElement> cols=dr.findElements(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td"));
			for(int c=1; c<=cols.size(); c++)
			{
				WebElement ele=dr.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]"));
				
				System.out.println(ele.getText());
			}
		}
	}
}
