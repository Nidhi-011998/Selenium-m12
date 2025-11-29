package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcasefull {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://demowebshop.tricentis.com/login");Thread.sleep(2000);
		 driver.findElement(By.linkText("Log in")).click();Thread.sleep(2000);
		 driver.findElement(By.id("Email")).sendKeys("admin123@gmail.com");Thread.sleep(2000);
		 driver.findElement(By.id("Password")).sendKeys("12345678");Thread.sleep(2000);
		 driver.findElement(By.className("login-button")).click();Thread.sleep(2000);
		 driver.findElement(By.linkText("Electronics")).click();Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@title='Show products in category Cell phones']")).click();Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Smartphone']/../..//input[@value='Add to cart']")).click();
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0,-100)");
		 driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		 
		 
	}

}
