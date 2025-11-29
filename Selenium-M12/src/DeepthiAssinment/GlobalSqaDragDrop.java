package DeepthiAssinment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GlobalSqaDragDrop {
	@Test
	public void readData() throws IOException {
	FileInputStream fis=new FileInputStream("./Testdata/commondata.properties");
	Properties pr=new Properties();
	pr.load(fis);
	String url = pr.getProperty("url2");
	System.out.println(url);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	PomGlobalsqa drag=new PomGlobalsqa(driver);

	
	
	
	
	
	
	
	

}
}