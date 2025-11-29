package Asignment1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment23 { 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(5000);
		Alert popup = driver.switchTo().alert();
		String text = popup.getText();
		System.out.println(text);
		popup.accept();
		
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		WebElement text1 = driver.findElement(By.xpath("//p[text()='You Pressed Cancel']"));
		System.out.println(text1.getText());
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		Thread.sleep(3000);
		Alert popup1 = driver.switchTo().alert();
		Thread.sleep(3000);
		popup1.sendKeys("buela");
		popup1.accept();
		
		
		
	}

}
