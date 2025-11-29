package Lingesh;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnTakeScreenshot {

	public static void main(String[] args) throws IOException {
		String Time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Train tickets')]")).click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File desp =new File("./screenshot/image"+Time+".png");
		FileHandler.copy(temp, desp);
	}
}
