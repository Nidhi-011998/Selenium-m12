package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
//	@Parameters("browser")
	@BeforeTest(groups = { "Smoke_test", "Regression_test" })
	public void openBrowser() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com");
		Reporter.log("openBrowser", true);
//		if(browser.equalsIgnoreCase("Chrome")) {
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--incognito");
//		driver=new ChromeDriver(opt);
//	}else if(browser.equalsIgnoreCase("Edge")) {
//		EdgeOptions opt=new EdgeOptions();
//		opt.addArguments("--incognito");
//		driver=new EdgeDriver(opt);
//	}else if(browser.equalsIgnoreCase("Firefox")) {
//		FirefoxOptions opt=new FirefoxOptions();
//		opt.addArguments("--incognito");
//		driver=new FirefoxDriver(opt);
//	}
	}

	@BeforeMethod(groups = { "Smoke_test", "Regression_test" })
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("admin123@email.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.className("login-button")).click();
		Reporter.log("login", true);
	}

	@AfterMethod(groups = { "Smoke_test", "Regression_test" })
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("logout", true);
	}

	@AfterTest(groups = { "Smoke_test", "Regression_test" })
	public void closeBrowser() {
		driver.quit();
		Reporter.log("closeBrowser", true);
	}
}
