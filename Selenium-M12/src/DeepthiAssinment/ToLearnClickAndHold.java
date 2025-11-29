package DeepthiAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickAndHold {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.abhibus.com/");
		WebElement ele = driver.findElement(By.partialLinkText("bus booking offers"));
		Actions a=new Actions(driver);
		a.scrollToElement(ele).perform();
		a.click(ele).perform();
		
	}

}
