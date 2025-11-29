package Lingesh;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.get("https://shoppersstack.com/products_page/3864");
		Thread.sleep(12000);
		Driver.findElement(By.id("compare")).click();
		
		Set<String> AllWindowId = Driver.getWindowHandles();
		for(String id: AllWindowId)
		{
			Driver.switchTo().window(id);
		if(id.equals("https://www.ebay.com/"))
			{
			Point Position = Driver.manage().window().getPosition();
			System.out.println(Position);
				break;
			}
		}Driver.close();
	}
}
