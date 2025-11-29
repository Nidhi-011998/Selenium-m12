package DeepthiAssinment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		  String url = driver.getCurrentUrl();
		  System.out.println(url);
		  if(url.contains("https://www.makemytrip.com/"))
		  {
			  System.out.println("welcome page is displayed");
		  }
			  else
			  {
				  System.out.println("welcome page is not displayed");
				  
			  }
		String source = driver.getPageSource();
		System.out.println(source);
		driver.quit();
		  }
}
		
		
	


