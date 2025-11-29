package DeepthiAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnHandlingDivision {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
		driver.findElement(By.xpath("//input[@id='customerName']")).sendKeys("Deepthi");
		driver.findElement(By.xpath("//input[@id='customerEmail']")).sendKeys("deepthisubbanna@gmail.com");
		WebElement Mobile = driver.findElement(By.xpath("//select[@id='prod']"));
		Select s =new Select(Mobile);
		s.selectByIndex(1);
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("hi deepu");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	}

}
