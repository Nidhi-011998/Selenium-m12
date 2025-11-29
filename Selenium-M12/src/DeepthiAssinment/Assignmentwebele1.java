package DeepthiAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentwebele1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		  WebElement res = driver.findElement(By.xpath("//input[contains(@placeholder,' Brands and More')]"));
	System.out.println(res.getAttribute("placeholder"));
		res.sendKeys("mobiles",Keys.ENTER);
		WebElement res1 = driver.findElement(By.xpath("//a[text()='Login']"));
		System.out.println(res1.getCssValue("color"));
		 Rectangle res2 = driver.findElement(By.xpath("//a[text()='Login']")).getRect();
		 System.out.println(res2.getX());
		 System.out.println(res2.getY());
		 System.out.println(res2.getWidth());
		 System.out.println(res2.getHeight());

		
		
	}

}
