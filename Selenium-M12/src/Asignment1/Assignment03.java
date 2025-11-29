package Asignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment03 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Log ")).click();
		driver.findElement(By.className("email")).sendKeys("pandeeti.buela97@gmail.com");
		driver.findElement(By.className("password")).sendKeys("buela123");
	    driver.findElement(By.cssSelector("input[value='Log in']")).click();
	    
	}

}
