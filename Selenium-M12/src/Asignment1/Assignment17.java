package Asignment1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment17 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		WebElement displayed = driver.findElement(By.xpath("//h1[contains(text(),'bus ticket booking site')]"));
		System.out.println(displayed.isDisplayed());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Train tickets']")).click();
		Thread.sleep(10000);
		
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./TakescreenShot/imag.png");
		 FileHandler.copy(temp,dest);
		 driver.quit();
		 }

}
