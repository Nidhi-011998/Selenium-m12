package Asignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment02 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//span[text()='Train tickets']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Live train status']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='menu-item'])[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("6381796800");
		Thread.sleep(10000);
		driver.quit();
		}
}
