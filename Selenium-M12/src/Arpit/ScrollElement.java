package Arpit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		WebElement scroll = driver.findElement(By.xpath("//section[text()='Others']"));
	    WebElement Elememt = driver.findElement(By.xpath("//p[text()='Scenarios']"));
		Actions s = new Actions(driver);
		s.scrollToElement(scroll).perform();
		//s.moveToElement(Elememt).perform();
		//s.scrollByAmount(0, 200).perform();
        WebElement scrollableSection = driver.findElement(By.xpath("//div[contains(@class, 'scenarios_2')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scrollableSection);

	}

}
