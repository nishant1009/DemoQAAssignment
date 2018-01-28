package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTests {
	
	WebDriver driver=null;
	
	@Given("^WebDriver is Initialized for \"(.*?)\"$")
	public void webdriver_is_Initialized_for(String browser) throws Throwable {
		driver =new FirefoxDriver();
		driver.get("http://store.demoqa.com/");
		
	  
	}

	@Given("^DemoQA Website is Launched$")
	public void demoqa_Website_is_Launched() throws Throwable {
	   
	}

	@When("^User tries to loggin$")
	public void user_tries_to_loggin() throws Throwable {
	    
	}

	@Then("^Login should be successfull$")
	public void login_should_be_successfull() throws Throwable {
	    
	}



}
