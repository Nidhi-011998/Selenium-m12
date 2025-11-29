package Asignment1;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment19 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		boolean displayed = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
		System.out.println(displayed);
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go()");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(4000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Takescreenshot/image.png");
		FileHandler.copy(temp, dest);

		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[text()='Facebook']"));
		js.executeScript("arguments[0].click()", element);

		Thread.sleep(2000);
		Set<String> getallwindowid = driver.getWindowHandles();
		for (String id : getallwindowid) {
			driver.switchTo().window(id);
			@Nullable
			String url = driver.getCurrentUrl();
			if (url.contains("https://www.facebook.com/nopCommerce")) {
				System.out.println("isDisplayed");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				Set<String> allids = driver.getWindowHandles();
				Thread.sleep(2000);
				for (String ids : allids) {
					driver.switchTo().window(ids);
					@Nullable
					String ur = driver.getCurrentUrl();
					if (ur.contains("https://www.facebook.com/reg/?entry_point=logged_out_dialog")) {
						System.out.println("now entered");
						Thread.sleep(2000);
						break;

					}
				}

			}
		}
		WebElement textfield = driver.findElement(By.xpath("//input[@name='firstname']"));
		textfield.clear();
		js.executeScript("arguments[0].value=('Buela')", textfield);
		Thread.sleep(2000);
		String backgroundcolor = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).getCssValue("background-color");
		System.out.println(backgroundcolor);
		Thread.sleep(2000);
		driver.quit();
	}

}
