package DeepthiAssinment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PomGlobalsqa {
	@FindBy(xpath = "//img[contains(@alt,'The peaks')]")
	private WebElement Drag;
	@FindBy(id="trash")
	private WebElement Drop;
	public PomGlobalsqa(WebDriver driver) 
	{
	PageFactory.initElements(driver,this);
	}

	public WebElement getDrag() {
		return Drag;
	}

	public WebElement getDrop() {
		return Drop;
	}
	
}