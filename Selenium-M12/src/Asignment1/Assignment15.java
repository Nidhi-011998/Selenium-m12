package Asignment1;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment15 {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shoppersstack.com/products_page/5267");
        Thread.sleep(20000);

        // click compare
        driver.findElement(By.id("compare")).click();

        // switch to Flipkart
        swaps(driver,"https://www.flipkart.com/");
        Dimension flipkartSize = driver.manage().window().getSize();
        System.out.println("Flipkart window size: " + flipkartSize);

        Thread.sleep(2000);

        // switch to eBay
        swaps(driver,"https://www.ebay.com/");
        Dimension ebaySize = driver.manage().window().getSize();
        System.out.println("eBay window size: " + ebaySize);

        Thread.sleep(2000);
	}
	
    public static void swaps(WebDriver driver,String swap) {
        Set<String> allwindowids = driver.getWindowHandles();
        for(String id : allwindowids) {
            driver.switchTo().window(id);
            String url = driver.getCurrentUrl();
            if(url.contains(swap)) {
                break;
            }
        }
    }
}
