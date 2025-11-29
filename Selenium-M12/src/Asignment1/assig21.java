package Asignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assig21 {
	public static void main(String[] args) throws InterruptedException {  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		
		Actions a=new Actions(driver);
		
		 List<WebElement> accessories = driver.findElements(By.xpath("//div[@class='draggable']"));

	        WebElement mobileDrop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	        WebElement laptopDrop = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));


	        for (WebElement item :accessories) { 
	            String name = item.getText().toLowerCase();
	            System.out.println("Dragging: " + name);

	            if (name.contains("mobile")) {
	                a.dragAndDrop(item, mobileDrop).perform();
	                System.out.println("Moved to Mobile Accessories ");
	            } else  {
	                a.dragAndDrop(item, laptopDrop).perform();
	                System.out.println("Moved to Laptop Accessories ✅");
	            }
		Thread.sleep(1000);
	}

	}
}
