package Asignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asssignment07 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://demo.vtiger.com/vtigercrm/");
	Thread.sleep(3000);
	WebElement submit = driver.findElement(By.xpath("(//input[contains(@id,'username')])[1]"));
    Thread.sleep(3000);
	submit.clear();
	Thread.sleep(3000);
	submit.sendKeys("Seleinium");
		
	WebElement  password = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
	Thread.sleep(3000);
    password.clear();
    Thread.sleep(3000);
    password.sendKeys("test@123");
    Thread.sleep(3000);
	   
    driver.findElement(By.xpath("(//button[contains(@type,'submit')])[1]")).click();
    Thread.sleep(3000);
    String element = driver.findElement(By.xpath("//span[@class=' failureMessage']")).getText();
    System.out.println(element);
    Thread.sleep(3000);
    driver.quit();
    }

}
