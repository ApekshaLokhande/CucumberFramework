package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	
	WebDriver driver;
	
	@FindBy(name="q")
	WebElement searchBox;
	
	public LoginPOM(WebDriver driver)
	{
		this.driver=driver;
	    PageFactory.initElements(driver, this);

	}

	
	public void SearchValue(String text)
	{
		searchBox.sendKeys(text);
	}
	
	public void Search()
	{
		searchBox.sendKeys(Keys.ENTER);
	}
}
