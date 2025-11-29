package Asignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassAssignment2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		//WebElement store = driver.findElement(By.xpath("//section[text()='Others']"));
		//Actions a=new Actions(driver);
		
		//a.scrollToElement(store).perform();
		WebElement store = driver.findElement(By.xpath("//p[text()='Write a script to click on the \"show password\" icon?']"));
		
	}

}
