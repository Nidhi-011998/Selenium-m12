package Lingesh;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnscrollwebpage {

	public static void main(String[] args) throws IOException {
		String Time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");	
		TakesScreenshot ts1=(TakesScreenshot) driver;
		File temp1 = ts1.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./screenshot/image_"+Time+".png");
	    org.openqa.selenium.io.FileHandler.copy(temp1, dest1);
		
		driver.findElement(By.xpath("//a[text()='Hyderabad to Bangalore Bus']")).click();
		
		TakesScreenshot ts2=(TakesScreenshot) driver;
		File temp2 = ts2.getScreenshotAs(OutputType.FILE);
		File dest2=new File("./screenshot/image_"+Time+".png");
	    org.openqa.selenium.io.FileHandler.copy(temp2, dest2);
		
		
		
	}
}
