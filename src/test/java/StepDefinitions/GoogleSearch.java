package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPOM;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class GoogleSearch {

	
	WebDriver driver= null;
	LoginPOM login;


public void browser_is_open() {
	System.out.println("Before Inside Step - browser is open");
	System.getProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	
   }


@When("User Lands on google search page")
public void user_lands_on_google_search_page() {
	System.out.println("Inside Step - User Lands on google search page");
   driver.navigate().to("https://www.google.com/");
   
}

@And("User enters {string} in search box")
public void user_enters_serach_value_in_search_box(String Value) {
	System.out.println("Inside Step - User enters value in search box");
	login= new LoginPOM(driver);
	login.SearchValue(Value);
	login.Search();
}

@Then("User Lands on search result page")
public void user_lands_on_search_result_page() {
	System.out.println("Inside Step - User Lands on search result page");
    driver.getPageSource().contains("AI Agents to Test in Minutes - Automated Testing Tools");
}


}
