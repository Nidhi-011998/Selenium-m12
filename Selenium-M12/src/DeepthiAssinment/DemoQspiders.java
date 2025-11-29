package DeepthiAssinment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQspiders {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
	

		
	WebElement dropdown = driver.findElement(By.xpath("//section[text()='Dropdown']"));
	

	JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",dropdown);
		Thread.sleep(3000);

		js.executeScript("arguments[0].click()",dropdown);
		Thread.sleep(3000);
WebElement multiselect = driver.findElement(By.xpath("//a[text()='Multi Select']"));
		js.executeScript("arguments[0].scrollIntoView(true)",multiselect);
		Thread.sleep(3000);

		js.executeScript("arguments[0].click()",multiselect);
		
		

		
	
	
	
	
	
	
		
	}

}
