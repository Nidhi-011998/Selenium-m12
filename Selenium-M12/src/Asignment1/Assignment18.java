package Asignment1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment18 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
	   	TakesScreenshot ts=(TakesScreenshot) driver;
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./TakescreenShot/image.png");
		 FileHandler.copy(temp,dest);
		 Thread.sleep(2000);
		 
		 JavascriptExecutor jst = (JavascriptExecutor)driver;
		 jst.executeScript("window.scrollBy(0,4000)");
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath(" //div[text()=' Hyderabad']")).click();
		 Thread.sleep(2000);
		
		 TakesScreenshot tss=(TakesScreenshot) driver;
		 File tep = tss.getScreenshotAs(OutputType.FILE);
		 File desst = new File("./TakescreenShot/logo.png");
		 FileHandler.copy(tep,desst);
		 Thread.sleep(2000);
		 driver.quit();
		 
		 
		 
		 
		 }

}
