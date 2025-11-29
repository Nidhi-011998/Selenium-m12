package Asignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='Naughty Ninos Girls Blue Denim Jeggings for 5 to 15 Years']")).click();
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("143143");
		WebElement checkbtn = driver.findElement(By.xpath("//button[text()='Check']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(checkbtn));
		checkbtn.click();
		
		  
	}
}
 