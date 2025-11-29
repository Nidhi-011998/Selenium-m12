package Asignment1;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class childwindowAssig {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		 driver.findElement(By.xpath("//a[text()='Men']")).click();
		 driver.findElement(By.xpath("//a[text()='T-Shirts']")).click();
		String parentid = driver.getWindowHandle();
		Set<String> allwID = driver.getWindowHandles();
		for (String id : allwID) {
			
			System.out.println(id);
			driver.switchTo().window(id);
			
			String tittle = driver.getTitle();
			if(tittle.contains(parentid));
			
			
		}
		 
		WebElement img = driver.findElement(By.xpath("//img[@title='CULT Shoulder Pop Active T-shirt']"));
		
		
		Actions a=new Actions(driver);
		a.scrollToElement(img).perform();
		
		
		
		
		
	}

}
