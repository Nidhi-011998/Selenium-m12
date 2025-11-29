package DeepthiAssinment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Toassigngetscrredbus {
	public static void main(String[] args) throws InterruptedException, IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	String title = driver.getTitle();
	System.out.println(title);
	if(title.contains("Bus Booking Online"))
	{
		System.out.println("welcome page is displayed");
	}
	else
	{
		System.out.println("welcome page is not displayed");

	}
	Thread.sleep(10000);
	driver.findElement(By.xpath("//img[@alt='Online Train Tickets Booking']")).click();
	driver.getCurrentUrl();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
    File dest = new File("./Screenshots/image1_" + timestamp + ".png");
    FileHandler.copy(temp, dest);
	}
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	
	



