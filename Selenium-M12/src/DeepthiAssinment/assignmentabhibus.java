package DeepthiAssinment;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class assignmentabhibus {
	public static void main(String[] args) throws  IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(10000);
WebElement ele = driver.findElement(By.xpath("(//div[text()='Bangalore ']/..//a[text()='View Buses'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(false)",ele);
		ele.click();
	}

		
}
	
	


