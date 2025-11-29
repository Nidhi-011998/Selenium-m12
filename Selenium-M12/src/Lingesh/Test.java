package Lingesh;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://demo.vtiger.com/vtigercrm/");
		
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@id='username']"));
		name.clear();
		name.sendKeys("lingesh");
		
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		pwd.sendKeys("295620");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement Signin = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
		js.executeScript("arguments[0].click()",Signin);
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Invalid credentials')]"));
		ele.getCssValue("colour");
		System.out.println(ele);
		Thread.sleep(2000);
		
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 driver.findElement(By.linkText("Vtiger")).click();
        Set<String> allWind = driver.getWindowHandles();
		for(String id : allWind)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.equals("https://www.vtiger.com/"))
			{
				break;
			}
		}
		 WebElement link = driver.findElement(By.partialLinkText("Training"));
		 js.executeScript("arguments[0].scrollIntoView(true)", link);
		 js.executeScript("arguments[0].click()",link);
          
		 Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		Object temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/vtiger.png");
		FileHandler.copy((File) temp, dest);
		
		 Thread.sleep(2000);
		String price = driver.findElement(By.xpath("//td[text()='CRM Administrator Training (6 x 2-Hour Sessions)']/..//td[text()='₹ 35,900 + 18% GST']")).getText();
		System.out.println(price);
		

		
		
	}
}
