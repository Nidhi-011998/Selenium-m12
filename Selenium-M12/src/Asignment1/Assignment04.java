package Asignment1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment04 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]")).sendKeys("mobiles");	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Products, Brands and More')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[contains(text(),'Bank Offer')])[1]")).click();
		Thread.sleep(3000);
			  Set<String> allwindows = driver.getWindowHandles();
		 driver.getWindowHandles();
		 for (String id : allwindows) {
			 driver.switchTo().window(id);
			 String url = driver.getCurrentUrl();
			 
		 if (url.equals("https://www.flipkart.com/")) {
	
		     driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		     Thread.sleep(6000);
		     break;
		 
		   }
		 }
	   }
	}
