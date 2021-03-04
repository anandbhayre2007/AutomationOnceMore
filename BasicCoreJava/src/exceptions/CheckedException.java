package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws Exception  {
		Testing.temp(1000);
		
		System.out.println("Anand");
		
		
		
		System.out.println("Santosh");
		
		wait2(1000);
		
		wait1(1000);
		
		FileInputStream file= new FileInputStream("");
		
	}

	
	public static void wait1(int time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	
	public static void wait2(int time)
	{
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

			System.out.println("Whatever logic you want to print");
		
		}
	}
}
