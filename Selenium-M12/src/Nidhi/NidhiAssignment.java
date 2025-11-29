package Nidhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NidhiAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		// Relative xpath by Attribute
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		//driver.findElement(By.xpath("//input[@value='Vote']")).click();
		Thread.sleep(5000);
		driver.close();

	}
}
