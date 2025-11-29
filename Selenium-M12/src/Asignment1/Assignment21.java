package Asignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment21 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		Actions a=new Actions(driver);
		//WebElement mobilecharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		//WebElement laplopcharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		//WebElement mobilecover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		//WebElement laptopcover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		WebElement mobileDroparea = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement laptopDroparea = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		//a.dragAndDrop(mobilecover, mobileDroparea).perform();
		//a.dragAndDrop(mobilecharger,mobileDroparea).perform();
		//a.dragAndDrop(laplopcharger, laptopDroparea).perform();
		//a.dragAndDrop(laptopcover, laptopDroparea).perform();
		List<WebElement> draggble =  driver.findElements(By.xpath("//div@class='draggble']"));
		for(WebElement dragelements:draggble)
			
		{
			String text = dragelements.getText().toLowerCase();
			if(text.contains("moblie"))
			{
		
		
			a.dragAndDrop(dragelements, mobileDroparea).perform();
			}
			else
			{
				a.dragAndDrop(dragelements, laptopDroparea).perform();
			}
		
	}

	}
}
