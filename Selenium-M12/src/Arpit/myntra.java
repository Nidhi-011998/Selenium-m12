package Arpit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {

	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.myntra.com/");
       String title = driver.getTitle();
       System.out.println(title);
       
       if (title.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"))
       {
    	   System.out.println("Myntra is launched");
       }
	    else
	{
		System.out.println("Myntra is not launched");
	}

    }
}