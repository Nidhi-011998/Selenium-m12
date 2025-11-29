package adarsh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopperstack {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	}

}
