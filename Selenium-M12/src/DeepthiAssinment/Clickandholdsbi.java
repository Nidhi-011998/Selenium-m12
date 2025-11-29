package DeepthiAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandholdsbi {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
	driver.findElement(By.id("userName")).sendKeys("deepthi@abc");
	driver.findElement(By.id("password")).sendKeys("deepu@123");
	WebElement clckhold = driver.findElement(By.xpath("(//img[@class='ng-star-inserted'])[1]"));
	Actions a=new Actions(driver);
a.clickAndHold(clckhold).perform();

	
	}
}
