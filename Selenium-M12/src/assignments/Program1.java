package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program1 {
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(5000);
		
		driver.manage().window().fullscreen();
		
		String Source = driver.getPageSource();
			System.out.println(Source);
			
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
		
	}

}
