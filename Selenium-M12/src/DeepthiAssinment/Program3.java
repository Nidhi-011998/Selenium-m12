package DeepthiAssinment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		
        String title = driver.getTitle();
  		System.out.println(title);
  		if(title.equals("Instagram"))
		{
			System.out.println("welcomepage is dispalyed");
		}
			else
			
				System.out.println("welcomepage is not displayed");
  		
  		
  		String url = driver.getCurrentUrl();
  		System.out.println(url);
  		
  		driver.quit();
			}
  		

          
		
	}


