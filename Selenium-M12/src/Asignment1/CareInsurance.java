package Asignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("//input[@id='policynumber']")).sendKeys("1213244");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select s=new Select(month);
		s.selectByIndex(4);
		
		WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select s1=new Select(year);
		s1.selectByValue("1997");
		 
		driver.findElement(By.xpath("//a[text()='1']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("1234567");
		
	}

}
