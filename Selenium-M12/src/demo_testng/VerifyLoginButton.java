package demo_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginButton {
	@Test
public void verifyButton() {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.instagram.com/");
boolean res = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
Assert.assertTrue(res);
driver.quit();
}
}
