package DeepthiAssinment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		 String title = driver.getTitle();
	  		System.out.println(title);
	  		if(title.equals("Bus Booking Online and Train Tickets at Lowest Price - redBus"))
			{
				System.out.println("welcomepage is dispalyed");
			}
				else
	
				{
					System.out.println("welcomepage is not displayed");
				}
	  		Dimension size = driver.manage().window().getSize();
	 System.out.println(size.getHeight());
	  		System.out.println(size.getWidth());
	  		Point position = driver.manage().window().getPosition();
			System.out.println(position);
	  		driver.manage().window().setPosition(new Point(350,450));
	  		driver.manage().window().setSize(new Dimension(650, 350));
	  		driver.navigate().forward();
	  		driver.navigate().refresh();
	  		String url = driver.getCurrentUrl();
	  		System.out.println(url);
	  		driver.quit();
			
	
}
	
	  		
	  		
	  		

}

