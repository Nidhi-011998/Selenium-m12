package DeepthiAssinment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaassignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(15000);
	driver.findElement(By.xpath("//span[contains(text(),'Meta AI Articles')]")).click();
	Thread.sleep(15000);
	Set<String> allwindowids = driver.getWindowHandles();
	for (String handle : allwindowids) {
            driver.switchTo().window(handle);
            System.out.println(handle);
        }
                
		
		
	}


}

