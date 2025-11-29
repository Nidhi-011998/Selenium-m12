package DeepthiAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentLocator {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Deepthi");
		driver.findElement(By.id("LastName")).sendKeys("K S");
		driver.findElement(By.name("Email")).sendKeys("deepthisubbanna@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("deepu@401");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("deepu@401");
		driver.findElement(By.name("register-button")).click();
		
		
		
		
	}

}
