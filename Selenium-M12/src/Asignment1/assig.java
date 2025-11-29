package Asignment1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assig {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demo.automationtesting.in/Alerts.html");
	Thread.sleep(3000);
	driver.findElement(By.id("OKTab")).click();
	Thread.sleep(3000);
    Alert alert = driver.switchTo().alert();
    String text = driver.switchTo().alert().getText();
	System.out.println(text);
	alert.accept();
	
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
	Thread.sleep(3000);
	Alert popupalert = driver.switchTo().alert();
	popupalert.dismiss();
	Thread.sleep(3000);
	
	WebElement textvalue = driver.findElement(By.xpath("//p[text()='You Pressed Cancel']"));
	System.out.println(textvalue.getText());
	
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
	Thread.sleep(3000);
	Alert prompt = driver.switchTo().alert();
	Thread.sleep(3000);
	prompt.sendKeys("text");
	Thread.sleep(3000);
	prompt.accept();
	
	
	driver.quit();
  }
}
