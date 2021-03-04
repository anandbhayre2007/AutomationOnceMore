package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Element_Button_DoubleClick {
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		
		//Navigate to URL		
		dr.get("https://demoqa.com/buttons");		
	
		//How to maximize the browser
		dr.manage().window().maximize();	
		
		//double click, right click, mouse hover, drag and drop
		Actions act= new Actions(dr);
		
		WebElement ele=dr.findElement(By.xpath("//button[text()='Double Click Me']"));
		
		act.doubleClick(ele).build().perform();
		
	}

}
