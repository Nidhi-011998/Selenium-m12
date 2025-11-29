package Arpit;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		Alert Popup = driver.switchTo().alert();
		Thread.sleep(2000);
	    Popup.accept();
        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
        Alert click = driver.switchTo().alert();
        Thread.sleep(2000);
        click.accept();
        WebElement dem = driver.findElement(By.id("demo"));
        String demtext = dem.getText();
        System.out.println(demtext);
        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
        Alert Pop = driver.switchTo().alert();
        Thread.sleep(2000);
        Pop.sendKeys("nobi");
        Pop.accept();
        
        
		
	}

}
