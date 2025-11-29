package Lingesh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/s?k=iphone+15+128%2Bgb&crid=241M9XXYV23QF&sprefix=ip%2Caps%2C205&ref=nb_sb_ss_mvt-t11-ranker_1_2");
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Blue']/../..//..//..//span[@class='a-price-whole']")).getText();
		
		
		
	}
}
