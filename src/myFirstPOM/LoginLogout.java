package myFirstPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLogout extends Base {

	//Automatic constructor to manage driver
	public LoginLogout(WebDriver driver) 
	{
		super(driver);
	}
	
	
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
	By warningMessageLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/mat-card/div[1]");
	By myEmailLocator = By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[1]/span");
	By logoutButtonLocator = By.id("navbarLogoutButton");
	By yourbasketButtonLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]");
	String email = "li.ramoncr@gmail.com";
	String password = "Password123";

	
	//Method Login user
	public void logOutProcess() 
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
				
				//Click on Account button then verify Logout button is displayed then click
				findElement(accountButtonLocator);
				click(accountButtonLocator);
				
				
					if(isDisplayed(logoutButtonLocator)) 
					{
						click(logoutButtonLocator);
					}
					else
					{
						System.out.println("Logout button  is not displayed");
					
					}
				
				//Verify Your Basket is displayed
					
					if(isDisplayed(yourbasketButtonLocator))
					{
						System.out.println("Your Basket button is not displayed");
					}
					else
					{
						System.out.println("Your Basket button is NOT displayed");
					}
		
		}
	
	
	
}
