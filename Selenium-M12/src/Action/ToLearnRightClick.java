package Action;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ToLearnRightClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		WebElement button = driver.findElement(By.xpath("//button[text()='Right Click']"));
		Actions ele= new Actions(driver);
		ele.contextClick(button).perform();
		
		WebElement select = driver.findElement(By.xpath("//div[text()='Yes']"));
		ele.click(select).perform();
		
		
		
	}
}
