package Asignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment20 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		
      
		
		WebElement inter = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
 
         
        WebElement mob = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
        WebElement lap = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
        WebElement cov = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
        Actions a= new Actions(driver);
        

        WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));

        a.dragAndDrop(inter,mobile).perform();
        a.dragAndDrop(mob, mobile).perform();
        WebElement laptop = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
        a.dragAndDrop(cov, laptop).perform();
        a.dragAndDrop(lap, laptop).perform();

  
        
        
       
        
        
        
        
        
		
		
		
 
	}
}
