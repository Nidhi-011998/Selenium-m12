package Asignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		String source = driver.getPageSource();
		System.out.println(source);
		driver.close();

	}

}
