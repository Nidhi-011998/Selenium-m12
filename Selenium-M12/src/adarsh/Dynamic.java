


	package adarsh;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Dynamic {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.reliancedigital.in/");
			driver.findElement(By.xpath("(//input[@class='search-input'])[1]")).sendKeys("iphone",Keys.ENTER);
			String price = driver.findElement(By.xpath("(//div[contains(text(),' Apple iPhone 15 512 GB Green ')])[1]/..//div[@class='price']")).getText();
			System.out.println(price);
		}

	}



