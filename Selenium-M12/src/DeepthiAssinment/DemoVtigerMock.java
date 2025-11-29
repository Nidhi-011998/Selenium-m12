package DeepthiAssinment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoVtigerMock {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement ele = driver.findElement(By.xpath("(//input[@value='admin'])[1]"));
		ele.clear();
		ele.sendKeys("Deepthi");
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		element.clear();
		element.sendKeys("Deepu@123");
		WebElement btn = driver.findElement(By.xpath("//button[text()='Sign in']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",btn);
	WebElement vtiger = driver.findElement(By.xpath("//a[text()='Vtiger']"));
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	vtiger.click();
	Set<String>allwebelements  = driver.getWindowHandles();
	for(String id:allwebelements)
	{
		driver.switchTo().window(id);
	
		
	}
WebElement training = driver.findElement(By.linkText("Training"));
	js.executeScript("arguments[0].scrollIntoView(true)",training);
	js.executeScript("arguments[0].click()",training);
String txt = driver.findElement(By.xpath("//td[contains(text(),'CRM Administrator')]/following-sibling::td")).getText();
System.out.println(txt);
	
	
	
	
	
	
	
		

	
		
		
		
 	}
	

}
