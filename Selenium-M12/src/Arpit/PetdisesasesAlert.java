package Arpit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetdisesasesAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://petdiseasealerts.org/");
	    WebElement status = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
	    System.out.println(status.isDisplayed());
	    Thread.sleep(5000);
	    status.click();
	    
	    WebElement touch = driver.findElement(By.xpath("//label[contains(text(),'I have read and agree to the')]/preceding-sibling::input"));
	    Thread.sleep(8000);
	    touch.click();
	    System.out.println(touch.isSelected());
	    
	    WebElement enable = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
	    System.out.println(enable.isEnabled());
	}

}
