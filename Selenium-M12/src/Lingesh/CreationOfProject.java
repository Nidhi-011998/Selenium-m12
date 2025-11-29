package Lingesh;

import java.awt.Dimension;
import java.util.Set;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreationOfProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://shoppersstack.com/products_page/107");
		//URL
		String Url = Driver.getCurrentUrl();
		System.out.println(Url);
		//PageSource
		String Source = Driver.getPageSource();
		System.out.println(Source);
		//Title
		String Title = Driver.getTitle();
		System.out.println(Title);
		//GetPosition
		Point Position = Driver.manage().window().getPosition();
		System.out.println(Position);
		//SetPosition
		Driver.manage().window().setSize(new org.openqa.selenium.Dimension(300, 500));
		//WindowHandle
		String WindowID = Driver.getWindowHandle();
		System.out.println(WindowID);
		//WindowHandles
		Set<String> AllWindowID = Driver.getWindowHandles();
		for(String ID : AllWindowID)
		{
			System.out.println(ID);
		}
		Driver.navigate().back();
		Thread.sleep(2000);
		Driver.navigate().forward();
		Thread.sleep(2000);
		Driver.navigate().refresh();
		
		
		Driver.quit();
		
		
	}
}
