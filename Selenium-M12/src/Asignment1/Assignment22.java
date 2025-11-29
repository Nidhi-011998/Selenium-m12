package Asignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment22 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		WebElement women = driver.findElement(By.xpath("//a[@data-group='women']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(women).perform();
		driver.findElement(By.xpath("//[@data-reactid='196']")).click();
		driver.findElement(By.xpath("//div"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
