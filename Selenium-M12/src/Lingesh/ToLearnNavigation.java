package Lingesh;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigation {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.redbus.in/");
		Dimension Size = Driver.manage().window().getSize();
		System.out.println("Size:"+Size.height);
		System.out.println("height:"+Size.width);
		Driver.manage().window().setPosition(new Point(350, 450));
		Driver.manage().window().setSize(new Dimension(650, 350));
		//Navigation
		Driver.navigate().back();
		Thread.sleep(3000);
		Driver.navigate().forward();
		Thread.sleep(3000);
		Driver.navigate().refresh();
		//URL
		String Url = Driver.getCurrentUrl();
		System.out.println(Url);
		//PageSource
		String Source = Driver.getPageSource();
		System.out.println(Source);
		//Quit
		Driver.quit();
		
		
		
		
		

		
	}
}
