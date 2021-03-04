package seleniumBasicFeatures;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Element_UploadFile {
	
	@Test
	public void test1() throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		
		//Navigate to URL		
		dr.get("https://demoqa.com/upload-download");		
	
		//How to maximize the browser
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//label[@for='uploadFile']")).click();
		
		//Keyboard and mouse related operations
		Robot robot= new Robot();
		
		StringSelection cb = new StringSelection("D:\\Anand\\19012020\\19012020\\SeleniumProject\\src\\Fileupload\\Testing.java");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb,null);

		Thread.sleep(10000);		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);		
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
