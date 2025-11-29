package Asignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment06 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		String capture = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).getAttribute("title");
		System.out.println(capture);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@title,'Search for Products, Brands and More')]")).sendKeys("mobiles",Keys.ENTER);
		Thread.sleep(3000);

		Rectangle rect = driver.findElement(By.linkText("Login")).getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		
		Thread.sleep(2000);
		String color = driver.findElement(By.linkText("Login")).getCssValue("color");
		System.out.println(color);
		Thread.sleep(3000);
	    driver.quit();
		}

}
