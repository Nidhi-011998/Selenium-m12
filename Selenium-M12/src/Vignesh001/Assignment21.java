package Vignesh001;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment21{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='Experience the seamless interactions and responsive designs']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		
		WebElement element = driver.findElement(By.id("select-multiple-native"));
		Select s = new Select(element);
		List<WebElement> multivalues = s.getOptions();
		  
		int alloptionsSelect= multivalues.size();
		System.out.println(s.isMultiple());
		for(int i=0; i<alloptionsSelect; i++) {
			s.selectByIndex(i);
			Thread.sleep(500);
		}
		for(int i=alloptionsSelect-1; i>=0; i--) {
			s.deselectByIndex(i);
			Thread.sleep(500);
		}
}
}
