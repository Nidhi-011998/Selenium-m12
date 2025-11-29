package Asignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment05 {
       public static void main(String[] args) {
		     WebDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("file:///C:/Users/buela/Desktop/Movietable.html");
		     String collection = driver.findElement(By.xpath("//td[text()='kantara']/following-sibling::td[2]")).getText();
		     System.out.println(collection);
		     
		     String position = driver.findElement(By.xpath("//td[text()='KGF']/preceding-sibling::td")).getText();
		     System.out.println(position);
		     driver.quit();
		     
	}
}
