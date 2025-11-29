package Lingesh;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Complete {

	public static void main(String[] args) throws InterruptedException, IOException {
		String time = LocalDate.now().toString().replace(":", "_");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("history.go(0)");
	    Thread.sleep(2000);
	    JavascriptExecutor sc=(JavascriptExecutor) driver;
		sc.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/image_/"+time+".png");
		FileHandler.copy(temp, dest);
		Thread.sleep(4000);
		
		
        
	    private static void switchTo(WebDriver driver, String string) {
		// TODO Auto-generated method stub
	        	
		Set<String> ids = driver.getWindowHandles();
		for(String id : ids)
		{
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.contains(url))
			break;
		}
	}

		
	}


