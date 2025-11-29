package DeepthiAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngettext {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("(//input[contains(@name,'username')])[1]")).clear();
		driver.findElement(By.xpath("(//input[contains(@name,'username')])[1]")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).sendKeys(" ",Keys.ENTER);
		String text = driver.findElement(By.xpath("//button[text()='Sign in']")).getText();
		System.out.println(text);
		
		
		
	}

}


