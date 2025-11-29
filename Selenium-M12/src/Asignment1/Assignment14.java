package Asignment1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/products_page/3864");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		
		Set<String> windowallids = driver.getWindowHandles();
		
		for(String id : windowallids) {
			driver.switchTo().window(id);		
			String url = driver.getCurrentUrl();
			if(url.contains("https://www.ebay.com/")) {
				Point position = driver.manage().window().getPosition();
				System.out.println("Position of Ebay Width and Height : "+position);
				break;
			}
		}
		System.out.println("--------------------------");
		for(String ids : windowallids) {
			driver.switchTo().window(ids);		
			String url = driver.getCurrentUrl();
			if(url.contains("https://www.amazon.in/")) {
				Dimension size = driver.manage().window().getSize();
				System.out.println("Size of Amazon X and Y Coordinate : "+size);
				break;
			} 
		}
		driver.quit();

	}

}
