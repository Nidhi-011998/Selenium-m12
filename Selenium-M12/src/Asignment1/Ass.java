
	package Asignment1;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class  Ass{
	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	        driver.get("https://demoapps.qspiders.com/");
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//section[text()='Popups']")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.id("fullName")).sendKeys("Buela rani");
	        Thread.sleep(2000);

	        driver.findElement(By.id("emailId")).sendKeys("pandeeti.buela97@gmail.com");
	        Thread.sleep(2000);

	        driver.findElement(By.id("password")).sendKeys("buela");
	        Thread.sleep(2000);

	        driver.findElement(By.id("mobile")).sendKeys("1234567891");
	        Thread.sleep(2000);

	        WebElement city = driver.findElement(By.id("city"));
	        Select s = new Select(city);
	        s.selectByVisibleText("Bangalore");
	        Thread.sleep(2000);
	        
	        WebElement upload = driver.findElement(By.id("resume"));
	        upload.sendKeys("C:\\Users\\APPLE\\Desktop\\resumeAI.pdf");
	        Thread.sleep(2000);

	        System.out.println("✅ Resume Uploaded Successfully");

	         //Optional: click Submit if available
	        //Object skills = driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    }
	}



