package Asignment1;

import org.openqa.selenium.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {
	
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.linkText("Register")).click();
			
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.id("FirstName")).sendKeys("buela");
		    driver.findElement(By.name("LastName")).sendKeys("M");
		    driver.findElement(By.id("Email")).sendKeys("pandeeti.buela97@gmail.com");
		    driver.findElement(By.id("Password")).sendKeys("blue");
		    driver.findElement(By.id("ConfirmPassword")).sendKeys("blue");
		    driver.findElement(By.id("register-button")).click();
		    
		}}


