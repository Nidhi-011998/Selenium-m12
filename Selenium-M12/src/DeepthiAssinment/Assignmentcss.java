package DeepthiAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentcss {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.className("email")).sendKeys("deepthisubbanna@gmail.com");
		driver.findElement(By.className("password")).sendKeys("deepu@401");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}

}

