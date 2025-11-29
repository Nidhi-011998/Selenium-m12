package Asignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Shadowolu");
		driver.findElement(By.id("LastName")).sendKeys("M");
		driver.findElement(By.name("Email")).sendKeys("Shadowolu@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Shadow@999");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Shadow@999");
		driver.findElement(By.name("register-button")).click();
		
		
		Thread.sleep(1500);
		driver.close();

	}

}
