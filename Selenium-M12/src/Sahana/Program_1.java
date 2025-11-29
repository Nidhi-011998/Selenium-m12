package Sahana;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program_1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//span[text()='US POLO KIDS ']")).click();
		
		 driver.findElement(By.id("Check Delivery")).sendKeys("653378");
		 WebElement btn = driver.findElement(By.id("Check"));
		 
		 WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wt.until(ExpectedConditions.elementToBeClickable(btn));
		 btn.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dist = new File("./Screenshot/shopper.png");
		FileHandler.copy(temp, dist);
	}
}
