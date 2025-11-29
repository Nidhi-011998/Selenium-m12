package Asignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Buela");
    driver.findElement(By.name("LastName")).sendKeys("a");
    driver.findElement(By.id("Email")).sendKeys("pandeeti.buela97@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("buela123");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("buela123");
    driver.findElement(By.id("register-button")).click();
    
	}
}