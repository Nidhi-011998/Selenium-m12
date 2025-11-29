package Lingesh;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwap {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://shoppersstack.com/products_page/27");
			Thread.sleep(15000);
			driver.findElement(By.id("compare")).click();
			
			SwitchToWindow(driver, "ebay");
			Point pos = driver.manage().window().getPosition();
			System.out.println("ebay position : " + pos);
			
			SwitchToWindow(driver, "flipkart");
			Point pos1 = driver.manage().window().getPosition();
			System.out.println("flipkart position : " + pos1);
		
			swapWindow(driver,pos, pos1);
			
		}
		public static  void SwitchToWindow(WebDriver driver,String url)
		{
	     Set<String> ids = driver.getWindowHandles();
			
			for(String id : ids)
			{
				driver.switchTo().window(id);
				String url1 = driver.getCurrentUrl();
				if(url1.contains(url))
				{
					break;
				}
		   }
		}
		public static void swapWindow(WebDriver driver,Point pos,Point pos1)
		{
			 SwitchToWindow(driver, "ebay");
			driver.manage().window().setPosition(pos1);
			 SwitchToWindow(driver, "flipkart");
			driver.manage().window().setPosition(pos);
		}
}
