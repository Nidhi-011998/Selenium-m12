package Asignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment08 {
	  public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://petdiseasealerts.org/stories/heartworm-informational-video");
	 Thread.sleep(2000);
	
	 WebElement status = driver.findElement(By.xpath("(//a[@class='button compact yellow'])[1]"));
	 System.out.println(status.isDisplayed());
	 status.click();
     Thread.sleep(2000);
     
     WebElement selected = driver.findElement(By.xpath("//label[@for='accept-tou']/..//input[@type='checkbox']"));
     selected.click();
     System.out.println(selected.isSelected());
     Thread.sleep(2000);
    
     WebElement enable = driver.findElement(By.xpath("//button[@type='submit']"));
     System.out.println(enable.isEnabled());
    
     driver.quit();
    
     }
}
