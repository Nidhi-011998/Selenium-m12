package Nidhi;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class RedBusTakeScreenshotAsAssignment {
	public static void main(String[] args) throws IOException {
		String time = LocalDateTime.now().toString().replace(":","-");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		 
		// Verify if Red Bus Page is displayed or not
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Bus Booking Online and Train Tickets at Lowest Price - redBus")) {
		System.out.println("red bus launched");	
		}
		else {
			System.out.println("red bus application Failed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		// Then Click on Train Tickets
		driver.findElement(By.xpath("//span[text()='Train tickets']")).click();

		//Take screenshot of Web Page
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots/redbustrainwebpage_"+time+".png");
		FileHandler.copy(temp, destination);
		
	 }
}
