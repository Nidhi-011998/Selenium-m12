package DeepthiAssinment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Product')]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'OPPO K13x 5G')]/../..//div[text()='Bank Offer']")).click();
		Thread.sleep(10000);
		Set<String> allwindowids = driver.getWindowHandles();
		for(String id:allwindowids)
		{
			driver.switchTo().window(id);
			System.out.println(id);
		}
		
        
    }
		
	}


