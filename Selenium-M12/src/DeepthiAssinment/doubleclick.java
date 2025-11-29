package DeepthiAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.linkText("Right Click")).click();
		WebElement button = driver.findElement(By.id("btn_a"));
		Actions a=new Actions(driver);
		a.contextClick(button).perform();
	    WebElement yesbtn = driver.findElement(By.xpath("//div[text()='Yes']"));
		a.click(yesbtn).perform();
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		WebElement btn = driver.findElement(By.xpath("//button[text()='Yes']"));
		a.doubleClick(btn).perform();
		

}}
