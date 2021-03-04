package seleniumBasicFeatures;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Element_Alert {
	
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		
		//Navigate to URL		
		dr.get("https://demoqa.com/alerts");		
		
	
		//How to maximize the browser
		dr.manage().window().maximize();
		/*
		dr.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Alert alt=dr.switchTo().alert();
		
		alt.accept();
		
		dr.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Alert alt=dr.switchTo().alert();
		
		alt.dismiss();
		*/
		
		dr.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		Thread.sleep(2000);
		Alert alt=dr.switchTo().alert();
		Thread.sleep(2000);
		alt.sendKeys("Anand");
		
		alt.accept();
	}

}
