package adarsh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauce {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sauce-demo.myshopify.com/");
		driver.findElement(By.id("customer_register_link")).click();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Aadhi");
	}

}
