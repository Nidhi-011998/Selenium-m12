package DeepthiAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIframes {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.rediff.com/");
		WebElement imoneyframe = driver.findElement(By.id("moneyiframe"));
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("moneyiframe");
		driver.switchTo().frame(imoneyframe);
		driver.findElement(By.xpath("//span[text()='NSE']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Sign in")).click();
		
		
		
		
		
	}

}
