package myFirstPOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AccountPage extends Base {
	
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
	
	
	//Account
	By accountButton = By.xpath("//*[@id=\"navbarAccount\"]");
	By goUserProfileButton = By.xpath(" //*[@id=\"mat-menu-panel-0\"]/div/button[1]");
	By userProfileLabel = By.xpath(" //*[@id= \"card\"]/div/h1");
	By ordersAndpaymentButton = By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[2]/div");
	By orderHistoryButton = By.xpath("//*[@id=\"mat-menu-panel-3\"]/div/button[1]");
	By orderHistorySectionLabel = By.xpath("//*[@class= \"mat-card-title\"and contains(text(),'Order')]");
	
	//Data
	String email = "li.ramoncr@gmail.com";
	String password = "Password123";
	
	
	
	//Method constructor to manage driver
	public AccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	//FIRST SCENARIO LOAD USER PROFILE PAGE
	public void userProfile () throws InterruptedException
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
		
		
		//Find ACCOUNT button
		findElement(accountButtonLocator);
		click(accountButtonLocator);
		
		//Explicit wait function
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(goUserProfileButton));
		click(goUserProfileButton);
		
	}
	
	//Validate User Profile label is displayed
	public String userProfileSuccess()
	{
		
		//Save text from label
		WebElement labelUserProfileTitle = findElement(userProfileLabel);
		String content = getText(userProfileLabel);
		System.out.println("The label contain: " + content);
		
		//Return text from label
		return getText(labelUserProfileTitle);
		
	}
	
	//--------------SECOND SCENARIO ORDER HISTORY
	
	public void orderHistory () throws InterruptedException
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
		
		
		//Find ACCOUNT button
		findElement(accountButtonLocator);
		click(accountButtonLocator);
		
		//Mouse hover 
		MoveToElement(ordersAndpaymentButton);
		Thread.sleep(500);
		click(orderHistoryButton);
		

		
	}
	
	//Validate Order history label is displayed
	public String orderHistoryLabel()
	{
		findElement(orderHistorySectionLabel);
		String content = getText(orderHistorySectionLabel);
		System.out.println("The label contain: " + content);
		
		//Return text from label
		return getText(orderHistorySectionLabel);
	}
	

}
