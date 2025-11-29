package DeepthiAssinment;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program11 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
	String title = driver.getTitle();
	System.out.println(title);
if(title.equals("Bus Booking Online and Train Tickets at Lowest Price - redBus"))
{
	System.out.println("redbus page is displayed");
}
else
{
	System.out.println("redbus page is not displayed");
}
	String source = driver.getPageSource();
	System.out.println(source);
}

	}
	


