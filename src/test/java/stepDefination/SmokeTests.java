package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.demoqa.base.ScenarioContext;
import com.demoqa.base.TestBase;
import com.demoqa.pages.HomePage;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import org.junit.Assert;

public class SmokeTests {
	
	ScenarioContext scenarioContext;
	int beforeCount;
	
	public SmokeTests(ScenarioContext scenarioContext){
	
		this.scenarioContext=scenarioContext;
		
	}
	
	@After
	public void tearDown(){
		scenarioContext.driver.quit();
	}
	
	
	
	@Given("^WebDriver is Initialized for Browser and DemoQA Website is launched$")
	public void webdriver_is_Initialized_for_Browser_and_DemoQA_Website_is_launched() throws Throwable {
		
		//scenarioContext=new ScenarioContxt();
		scenarioContext.driver=scenarioContext.testbase.initWebDriver();
	   
	}

	
	@Given("^User Navigates to Womens Jackets Page$")
	public void user_Navigates_to_Womens_Jackets_Page() throws Throwable {
		
		//scenarioContext.testbase.getValue(scenarioContext.driver, scenarioContext.homePage.getcategoryWoman());
		//System.out.println(scenarioContext.testbase.getValue(scenarioContext.driver, scenarioContext.homePage.getcategoryWoman()));
		//scenarioContext.testbase.mouseOver(scenarioContext.homePage.getcategoryWoman());
		Actions act=new Actions(scenarioContext.driver);
		WebElement local=scenarioContext.driver.findElement(By.xpath(".//*[@id='menu-item-2213']/a"));
		act.moveToElement(local).perform();
		scenarioContext.testbase.click(scenarioContext.driver, scenarioContext.homePage.getsubCategoryJackets());	
		}
		
		

		//scenarioContext.testbase.mouseOver(scenarioContext.homePage.categoryWoman, scenarioContext.driver);
		//scenarioContext.homePage.subCategoryJackets.click();
	

	@When("^User applies color filter$")
	public void user_applies_color_filter() throws Throwable {
	   //WebElement colorFilter=scenarioContext.testbase.getElement(scenarioContext.driver, scenarioContext.categoryPage.getFilterColor());
	   //scenarioContext.testbase.selectDropDown(scenarioContext.driver, colorFilter, scenarioContext.readxls.readXlsValue(1, 1));
	}

	@When("^Sort by Newness option$")
	public void sort_by_Newness_option() throws Throwable {
		
		WebElement local=scenarioContext.testbase.getElement(scenarioContext.driver, scenarioContext.categoryPage.getDefaultSorting());
	   scenarioContext.testbase.selectDropDown(scenarioContext.driver, local, scenarioContext.readxls.readXlsValue(1, 0));
	}

	@When("^Change the Price filter$")
	public void change_the_Price_filter() throws Throwable {
		WebElement resultCountLabel=scenarioContext.testbase.getElement(scenarioContext.driver, scenarioContext.categoryPage.getcountOfSearchResults());
		String resultText=resultCountLabel.getText();
		char digit= resultText.charAt(12);
		int beforeCount=Character.getNumericValue(digit);
		System.out.println(beforeCount);
		WebElement priceFilterScroll=scenarioContext.testbase.getElement(scenarioContext.driver, scenarioContext.categoryPage.getFilterPrice());
		scenarioContext.testbase.eleDragAndDrop(scenarioContext.driver, priceFilterScroll);
		WebElement filterButton=scenarioContext.testbase.getElement(scenarioContext.driver, scenarioContext.categoryPage.getFilterButton());
		scenarioContext.testbase.click(scenarioContext.driver, scenarioContext.categoryPage.getFilterButton());
		Thread.sleep(5000);
	}

	@Then("^results matching the search criteria should be displayed$")
	public void results_matching_the_search_criteria_should_be_displayed() throws Throwable {
		
		WebElement resultCountLabel=scenarioContext.testbase.getElement(scenarioContext.driver, scenarioContext.categoryPage.getcountOfSearchResults());
	   String resultText=resultCountLabel.getText();
	   char digit= resultText.charAt(12);
	   int afterCount=Character.getNumericValue(digit);
	   System.out.println(afterCount);
	   Assert.assertNotEquals(beforeCount, afterCount);
	  
	}




}
