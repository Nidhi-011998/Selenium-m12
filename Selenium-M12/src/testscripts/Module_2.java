package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Module_2 extends BaseClass{

	@Test(groups = "Smoke_test")
	public void tc_04() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		Reporter.log("Test Case 4 has been executed",true);
	}
		@Test(groups = "Regression_test")
	public void tc_05() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		Reporter.log("Test Case 5 has been executed",true);
	}
		@Test(groups = "Regression_test")
	public void tc_06() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		Reporter.log("Test Case 6 has been executed",true);
	}
}
