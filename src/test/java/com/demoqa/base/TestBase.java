package com.demoqa.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	
	private String browser;
	private String url;
	WebDriver driver;
	
	public TestBase(String browser, String url)
	
	{
		this.browser=browser;
		this.url=url;
		
	}
	
	public WebDriver initWebDriver()
	{
		
		
		switch (browser){
		
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			break;
			
		case "InternetExplorer":
			
	
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "\\src\\test\\resources\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			//driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			break;
		
		case "FireFox":
			DesiredCapabilities cd=new DesiredCapabilities();
			cd.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			break;
			
		
		}
		
		return driver;
	}
		
	public void mouseOver(WebElement ele){
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
	}
	
	public void sendKeys(WebDriver driver,By element, String value) {
		driver.findElement(element).sendKeys(value);
	}

	public void click(WebDriver driver,By element) {
		driver.findElement(element).click();
	}
	
	public String getValue(WebDriver driver, By element){
		return driver.findElement(element).getText();
	}
	
	public WebElement getElement(WebDriver driver, By element){
		WebElement pp;
		return pp=driver.findElement(element);
		
	}
	
	public List<WebElement> getElements(WebDriver driver, By element){
		List<WebElement>productList;
		return productList = driver.findElements(element);
	}
	
	public void selectDropDown(WebDriver driver, WebElement element, String value){
		
		Select dropDown=new Select(element);
		dropDown.selectByValue(value);
		
		
	}
	
	public void eleDragAndDrop(WebDriver driver, WebElement from){
		
		Actions act=new Actions(driver);
		try{
			
			//Thread.sleep(1000);
			//Dimension dim=from.getSize();
			//int x=dim.width;
			//System.out.println(x);
			act.clickAndHold(from).moveByOffset(15,0).release().build().perform();
			//dd.perform();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
			
		}
	
	public void scrollToElement(WebDriver driver, By element){
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
		
		
	}
		
	
	
	
	



