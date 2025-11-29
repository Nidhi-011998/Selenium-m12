package Asignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flieupload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Buela rani");Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("pandeeti.buela97@gmail.com");Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("buelarani");Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("1234567891");Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("//select[@id='city']"));
		Select s=new Select(city);
		s.selectByVisibleText("Bangalore");
		
		//driver.findElement(By.xpath("//input[contains(@id,'resume')]")).sendKeys("‪‪C:\\Users\\APPLE\\Desktop\\resumeAI.pdf");
		
		WebElement upload = driver.findElement(By.id("resume"));
        upload.sendKeys("C:\\Users\\APPLE\\Desktop\\resumeAI.pdf");
        Thread.sleep(2000);
		
		
		WebElement skills = driver.findElement(By.xpath("//select[@class='MuiNativeSelect-select MuiNativeSelect-outlined MuiNativeSelect-multiple MuiInputBase-input MuiOutlinedInput-input css-h8h8y']"));
		Select s1 =new Select(skills);
		s1.selectByVisibleText("HTML");
		
		driver.findElement(By.xpath("//button[text()='Create Profile']")).click();
		
		
	}

}
