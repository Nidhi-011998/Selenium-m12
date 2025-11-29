package testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class Module_1 extends BaseClass{
	@Test(groups="Smoke_test")
	public void tc_01() {
		Assert.fail();
		Reporter.log("Test Case 1 has been executed",true);
	}
	@Test(groups = "Regression_test")
	public void tc_02() {
		Reporter.log("Test Case 2 has been executed",true);
	}
	@Test(groups = "Regression_test",dependsOnMethods = "tc_01")
	public void tc_03() {
		Reporter.log("Test Case 3 has been executed",true);
	}
}
