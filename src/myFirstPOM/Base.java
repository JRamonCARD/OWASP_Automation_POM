package myFirstPOM;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	//Object
	WebDriver driver;
	
	
	//Constructor
	public Base(WebDriver driver) 
	{
		this.driver = driver;
			
	}
	
	//Constructor to call my browser
	public WebDriver firefoxDriverConnection() 
	{
		System.setProperty("webdriver.gecko.driver", "//Users/ramoncardenas/Documents/Drivers_Automation/geckodriver");
		driver = new FirefoxDriver();
		return driver;
	}
	
	//Method to find element
	public WebElement findElement (By locator) 
	{	
		return driver.findElement(locator);
		
	}
	
	//Method to find elements
	public List<WebElement> findElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	//Method to get text from element
	public String getText (WebElement element) 
	{
		return element.getText();
	}
	
	//Method to get text from one locator
	public String getText(By locator) 
	{
		return driver.findElement(locator).getText();
	}
	
	//Method to type text
	public void type (String inputText, By locator) 
	{
		driver.findElement(locator).sendKeys(inputText);
	}
	
	//Method to click 
	public void  click(By locator) 
	{
		driver.findElement(locator).click();
	}
	
	/*//Method to select one random element
	public void selectRandomProduct(By locator)
	{
		
		/*List<WebElement> allProducts = driver.findElements(locator);
		int maxProducts = allProducts.size();
	    Random random = new Random();
	    int randomProduct = random.nextInt(maxProducts);
	    allProducts.get(randomProduct).click();
	         
	}*/
	
	
	//Method to validate if element is displayed
	public Boolean isDisplayed(By locator) 
	{
		try 
		{
			return driver.findElement(locator).isDisplayed();
			
		}
		catch (org.openqa.selenium.NoSuchElementException e) 
		{
			return false;
		}
	}
	
	
	//Method to validate if element is enable
	public Boolean isEnable(By locator) 
	{
		try 
		{
			return driver.findElement(locator).isEnabled();
				
		}
		catch (org.openqa.selenium.NoSuchElementException e) 
		{
			return false;
		}
	}
		
		
	//Method get the URL and open the page
	public void visit(String url) 
	{
		driver.get(url);
	}
	
	
	//Method to close browser
	public void closeBrowser (By locator) 
	{
		driver.close();
	}


	
}