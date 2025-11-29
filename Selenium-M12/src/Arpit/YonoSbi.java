package Arpit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YonoSbi {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		driver.findElement(By.id("userName")).sendKeys("GodLxSyarit18");
		driver.findElement(By.id("password")).sendKeys("Chalrenoob");
		WebElement Hidebutton = driver.findElement(By.xpath("//button[@tabindex='0']"));
		Actions s = new Actions(driver);
		s.clickAndHold(Hidebutton).perform();

	}

}
