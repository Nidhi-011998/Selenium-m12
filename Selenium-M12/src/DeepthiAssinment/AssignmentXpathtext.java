package DeepthiAssinment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentXpathtext {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	String title = driver.getTitle();
	System.out.println(title);
	if(title.contains(title))
	{
		System.out.println("redbus welcomepage is displayed");
	}
		else
		{
		
			System.out.println("welcomepage is not displayed");
		}
	driver.findElement(By.xpath("//span[text()= 'Train tickets']")).click();
	Thread.sleep(10000);

	driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
	Thread.sleep(10000);
	

	driver.findElement(By.xpath("//span[text()='Live train status']")).click();
	driver.findElement(By.xpath("//img[@alt='user profile']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='SignUp / Signin']")).click();
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9999999999");
	
	}

	
		
		
	}


