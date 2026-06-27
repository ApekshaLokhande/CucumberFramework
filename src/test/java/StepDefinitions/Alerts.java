package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class Alerts {
	
	WebDriver driver= null;
	
@Given("User Lands on {string} page")
public void user_lands_on__page(String url) {
	driver= new ChromeDriver();
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get(url);
    driver.manage().window().maximize();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alertButton")));
    
}

@When("User clicks on alert creation button")
public void user_clicks_on_alert_creation_button() {
    driver.findElement(By.id("alertButton")).click();
}

@Then("Click on alert button and accept the alert")
public void click_on_alert_button_and_accept_the_alert() {
	
	
	driver.switchTo().alert().accept();
	driver.quit();
}


}
