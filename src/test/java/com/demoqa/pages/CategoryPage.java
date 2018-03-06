/**
 * 
 */
package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	private By searchedItemsRecords=By.xpath("//div[@class='products noo-row']/div");
	private By productPrice=By.xpath(".//*[@id='noo-site']/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/span/ins/span");
	private By productCategories=By.xpath(".//*[@id='woocommerce_price_filter-1']/form/div/div[2]/button");
	
	
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
	
	public By getsearchedItemsRecords(){
		return searchedItemsRecords;
	}
	
	public By getproductPrice(){
		return productPrice;
	}
	
	public By getproductCategories(){
		return productCategories;
	}
}
