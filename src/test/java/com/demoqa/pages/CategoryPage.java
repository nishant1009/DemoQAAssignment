/**
 * 
 */
package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Nishant
 *This class if the Page class for Product Category like Jackets
 */
public class CategoryPage {
	
	WebDriver driver;
	
	public CategoryPage(WebDriver driver){
		
	}
	
	private By defaultSorting=By.xpath(".//*[@id='noo-site']/div[2]/div[1]/div/form/select");
	private By newness=By.xpath("//select[@class='orderby']/option[@value='date']");
	private By filterColor=By.xpath(".//*[@id='noo-site']/div[2]/div[1]/div/div[1]/form[1]/select");
	private By priceFilter=By.xpath(".//*[@id='woocommerce_price_filter-1']/form/div/div[1]/div");
	private By filterButton=By.xpath(".//*[@id='woocommerce_price_filter-1']/form/div/div[2]/button");
	private By countOfSearchResults=By.xpath(".//*[@id='noo-site']/div[2]/div[1]/div/p");
	
	public By getDefaultSorting(){
		return defaultSorting;
	}
		
	public By getnewness(){
		return newness;
		
		}
	public By getFilterColor(){
	return filterColor;
	}
	
	public By getFilterPrice(){
		return priceFilter;
	}
	
	public By getFilterButton(){
		return filterButton;
	}
	
	public By getcountOfSearchResults(){
		return countOfSearchResults;
	}
}
