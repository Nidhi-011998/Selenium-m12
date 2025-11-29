package demo_testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle {
	@Test
public void verifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com");
	String actualTitle = driver.getTitle();
	String expectedTitle="google";
//	Assert.assertEquals(actualTitle, expectedTitle);
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualTitle, expectedTitle);
//	if(actualTitle.equals(expectedTitle)) {
//		Reporter.log("Pass, Title are same",true);
//	}else {
//		Reporter.log("Fail, Title are not same",true);
//	}
	driver.quit();
	s.assertAll();
}
}
