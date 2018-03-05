package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		
		this.driver=driver;
	}
	
	//Locating Woman Category
	private By categoryWoman = By.xpath(".//*[@id='menu-item-2213']/a");
	private By subCategoryJackets = By.xpath(".//*[@id='menu-item-2235']/a");
	

		

	

	public By getsubCategoryJackets() {
		return subCategoryJackets;
	}
	
		
		
		
	
	

}
