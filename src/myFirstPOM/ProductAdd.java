package myFirstPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductAdd extends Base{
	
	//LOCATORS
		By welcomeWindowLocator = By.xpath("//*[@id=\"mat-dialog-0\"]");
		By dismissButtonLocator = By.xpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]");
		By coockieBannerLocator = By.xpath("/html/body/div[1]");
		By weWantItButtonLocator = By.xpath("/html/body/div[1]/div/a");
		By accountButtonLocator = By.id("navbarAccount");
		By loginButtonLocator = By.id("navbarLoginButton");
		By loginContainerLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/mat-card");
		By emailTextFieldLocator = By.id("email");
		By passwordTextFieldLocator = By.id("password");
		By loginMasterLocator = By.id("loginButton");
		By firstProductLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button/span[3]");
		By nameFirstProductLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[1]/div[2]/div[1]");
		By yourBasketButtonLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]");
		By yourBasketContainerLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/app-purchase-basket");
		By productnameInsideContainerLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/app-purchase-basket/mat-table/mat-row/mat-cell[2]");
		
		
		String email = "li.ramoncr@gmail.com";
		String password = "Password123";
		String notEqual = "The name is not the same";

				
				
				
	public ProductAdd(WebDriver driver) 
	{
		super(driver);
		
	}
	
	//Method to add products on my basket
	public void addingProduct() throws InterruptedException 
	{
		//Verify welcome window is displayed
		if (isDisplayed(welcomeWindowLocator)) 
		{
			System.out.println("Welcome message window is present");
		}
		else 
		{
			System.out.println("Element is NOT present");
		}
				
		//Verify Dismiss  button is displayed and click
		if (isDisplayed(dismissButtonLocator)) 
		{
			System.out.println("Button is present");
			click(dismissButtonLocator);	
		}
		else 
		{
			System.out.println("Button is NOT present");
		}
		
		//Verify Cookie Banner is displayed and click
		if (isDisplayed(coockieBannerLocator)) 
		{
			System.out.println("Cookie banner is present");
		}
		else 
		{
			System.out.println("Cookie banner is NOT present");
		}
				
		//Verify Me Want it button is displayed and click
		if (isDisplayed(weWantItButtonLocator)) 
		{
			System.out.println("Accept button is present");
			click(weWantItButtonLocator);
		}
		else 
		{
			System.out.println("Accept button NOT present");
		}
		
		//Find Account button and click
		findElement(accountButtonLocator);
		click(accountButtonLocator);
				
		//Validate if Login button is displayed
		if (isDisplayed(loginButtonLocator)) 
		{
			click(loginButtonLocator);
		}
		else 
		{
			System.out.println("Login button not displayed");
		}
		
		//Verify Login box container is displayed enter credentials and validate warning message
		if (isDisplayed(loginContainerLocator)) 
		{
			System.out.println("Login container was displayed");
						
			//Validate VALID Email text box is displayed send email
			if(isDisplayed(emailTextFieldLocator)) 
			{
					type(email, emailTextFieldLocator);
			}
			else 
			{
				System.out.println("Email field not present");
			}
							
			//Validate Password field is present
			if (isDisplayed(passwordTextFieldLocator)) 
			{
				type(password, passwordTextFieldLocator);
			}
			else 
			{
				System.out.println("Password field not present");
			}
							
			//Validate Login button is enable and click
			if (isEnable(loginMasterLocator)) 
			{
				click(loginMasterLocator);
			}
			else 
			{
				System.out.println("Login button is not enable");
			}
		}
		Thread.sleep(1000);
										/*
										//Select one random product
										selectRandomProduct(productRandomNameLocator);
										
										//Get text and print from random product
										getText(productRandomNameLocator);
										System.out.println(productRandomNameLocator);
										*/
										
		//Fond First Product and click because I was not able to select random product
		if (isDisplayed(firstProductLocator))
		{
			click(firstProductLocator);
		}
		else
		{
			System.out.println("Add to Basket button is not displayed");
		}
		
		//Get text name from he product selected and print from the product selected
		String product = getText(nameFirstProductLocator);
		System.out.println(product);
		
		
		//Click on Your Basket button
		if (isDisplayed(yourBasketButtonLocator))
		{
			click(yourBasketButtonLocator);
		}
		else
		{
			System.out.println("Your Basket button was not displayed");
		}
		
		//Validate your basket container is loaded, verify product is displayed 
		if (isDisplayed(yourBasketContainerLocator))
		{
			System.out.println("Your Basket page is loaded properly");
		}
		else
		{
			System.out.println("Your Basket Page is NOT loading correctly");
			driver.quit();
		}

		
		
		
	}
	
	//Validate if name of product selected is equal inside Your Basket Page
	public String nameIsCorrect() 
	{
					
		//validate name of product is equal to the selection
		if (isDisplayed(productnameInsideContainerLocator))
		{
			WebElement productName = findElement(productnameInsideContainerLocator);
			return getText(productName);
		}
		else 
		{
			return notEqual;
		}
	
	}

}
