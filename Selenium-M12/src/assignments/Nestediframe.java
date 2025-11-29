package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nestediframe {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement mouseover = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		Actions s = new Actions(driver);
		s.moveToElement(mouseover).perform();
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		
		driver.findElement(By.partialLinkText("Iframe with in an Iframe")).click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
		
	}

}
