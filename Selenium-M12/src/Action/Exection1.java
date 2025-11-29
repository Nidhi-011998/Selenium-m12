package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Exection1 {
 
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement click = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a=new Actions(driver);
		a.contextClick(click).perform();
		
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		a.contextClick(copy).perform();
		
	}
}
