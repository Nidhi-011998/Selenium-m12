package DeepthiAssinment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/27");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Set<String> allwindowsIds = driver.getWindowHandles();
		for(String id :allwindowsIds)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
	
			if(url.equals("https://www.ebay.com/"))
				
			{
				driver.manage().window().maximize();
				break;
			}
		}
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		
		Set<String> allwindowsId = driver.getWindowHandles();
		for(String ids :allwindowsId)
		{
			driver.switchTo().window(ids);
			String url = driver.getCurrentUrl();
	
			if(url.equals("https://www.amazon.in/"))
				
			{
				driver.manage().window().maximize();
				break;
			}
		}
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		
			
		
	}

	}


