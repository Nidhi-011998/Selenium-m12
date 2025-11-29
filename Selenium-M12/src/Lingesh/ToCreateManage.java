package Lingesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCreateManage 
{
	
	public static void main(String[] args) {
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.instagram.com/");
		
		String Url = Driver.getCurrentUrl();
		System.out.println(Url);
		
		Driver.close();
		
		
		
	}
}
