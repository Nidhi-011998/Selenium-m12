package Lingesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCreateSourceurl 
{

	public static void main(String[] args) 
	{
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.makemytrip.com/");
		
		String Source = Driver.getPageSource();
		
		System.out.println(Source);
		
		
	}
}
