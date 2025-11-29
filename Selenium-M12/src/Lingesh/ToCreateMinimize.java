package Lingesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCreateMinimize 
{

		public static void main(String[] args) {
			
			WebDriver Driver = new ChromeDriver();
			Driver.get("https://www.makemytrip.com/");
			
			Driver.manage().window().maximize();
			String Url = Driver.getCurrentUrl();
			System.out.println(Url);
			Driver.quit();
		}
}
