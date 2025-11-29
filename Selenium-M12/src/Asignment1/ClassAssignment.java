package Asignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassAssignment {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
	driver.findElement(By.xpath("//input[@placeholder='Enter your User ID']")).sendKeys("buela");
	driver.findElement(By.xpath("//input[@placeholder='Enter your Password']")).sendKeys("12345");
	 WebElement store = driver.findElement(By.xpath("//button[@tabindex='0']"));
	 Actions a=new Actions(driver);
	// a.clickAndHold(store).moveToElement(store).release().perform();
	 a.clickAndHold(store).perform();
	
}}
