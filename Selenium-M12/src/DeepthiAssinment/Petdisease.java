package DeepthiAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Petdisease {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/");
		WebElement res = driver.findElement(By.xpath("//a[text()='Sign up']"));
		System.out.println(res.isDisplayed());
		res.click();
		WebElement res1 = driver.findElement(By.xpath("//label[text()='I have read and agree to the ']/..//input[@type='checkbox']"));
		System.out.println(res1.isSelected());
		WebElement res2 = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(res2.isEnabled());
	}

}
