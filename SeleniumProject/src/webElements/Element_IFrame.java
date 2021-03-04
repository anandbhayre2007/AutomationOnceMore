package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_IFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		
		//Navigate to URL		
		dr.get("https://paytmmall.com/");		
	
		//How to maximize the browser
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		Thread.sleep(5000);
		dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
		
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();

		dr.switchTo().defaultContent();
	}

}
