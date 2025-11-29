package testscripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Module_3 extends BaseClass {

	@Test(groups = "Smoke_test")
	public void tc_07() {
		driver.findElement(By.linkText("Wishlist")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		Reporter.log("Test Case 7 has been executed", true);
	}

	@Test(groups = "Regression_test")
	public void tc_08() {
		driver.findElement(By.linkText("Wishlist")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {		}
		Reporter.log("Test Case 8 has been executed", true);
	}

	@Test(groups = "Regression_test")
	public void tc_09() {
		driver.findElement(By.linkText("Wishlist")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {		}
		Reporter.log("Test Case 9 has been executed", true);
	}
}
