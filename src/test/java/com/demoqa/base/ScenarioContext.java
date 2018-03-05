package com.demoqa.base;

import org.openqa.selenium.WebDriver;

import com.demoqa.pages.CategoryPage;
import com.demoqa.pages.HomePage;
import com.demoqa.utlilities.ReadJson;
import com.demoqa.utlilities.ReadPropertyFile;
import com.demoqa.utlilities.ReadXls;

public class ScenarioContext {
	
	public ReadJson readJson;
	public ReadPropertyFile readPropertyFile;
	public ReadXls readxls;
	public TestBase testbase;
	public WebDriver driver;
	public HomePage homePage;
	public CategoryPage categoryPage;
	
	
	public ScenarioContext()
	{
		readJson=new ReadJson();
		readPropertyFile = new ReadPropertyFile();
		readxls = new ReadXls();
		testbase = new TestBase(readPropertyFile.getPropertyValue("Browser"),readPropertyFile.getPropertyValue("Url"));
		homePage= new HomePage(driver);
		categoryPage=new CategoryPage(driver);
		
	}

}
