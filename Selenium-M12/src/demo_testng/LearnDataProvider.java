package demo_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LearnDataProvider {	
	@Test(dataProvider = "getData",dataProviderClass = DemoDataProvider.class)
	public void demo(String un,String pwd) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys(un);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
