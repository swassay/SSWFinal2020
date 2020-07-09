package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import util.BrowserFactory;
import junit
public class LoginSteps {
static WebDriver driver;

@BeforeTest
@Given("^launch browser site$")
public void launch_browser_site() {
	BrowserFactory.LaunchBrowser();
	System.out.println("First");
}
@Test
@Then("^Goes to Site$")
public void Goes_to_Site() {
	driver.get("http://techfios.com/test/101/index.php");
}

@Test
@Then("^clicks Blue Page changes to Blue$")
public void Blue_Page_should_be_displayed() throws Throwable {
		 WebElement COLORBLUE = driver.findElement(By.tagName("button"));
			COLORBLUE.click();
			Thread.sleep(3000);
}

@Test
@Then ("^click white page changes to white$")
public void White_Page_should_be_displayed() throws Throwable {
	  WebElement WHITE = driver.findElement(By.xpath("/html/body/div[4]/span/button[2]"));		 
			 WHITE.click();	
			 Thread.sleep(3000); 		
}}