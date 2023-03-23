package myFirstPOM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginNullValues_TEST {
	
	private WebDriver driver;
	LoginNullValues loginNullValues;
	

	@Before
	public void setUp() throws Exception 
	{
		
		loginNullValues = new  LoginNullValues (driver);
		driver = loginNullValues.firefoxDriverConnection();
		loginNullValues.visit("https://juice-shop.herokuapp.com");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test() throws InterruptedException 
	{
		
		//Calling method nullLogin from Class 
		loginNullValues.nullLogin();
		
		//Validating warning message from null email
		assertEquals("Please provide an email address.", loginNullValues.warningEmailMessage());
		
		//Validating warning from null password
		assertEquals("Please provide a password.", loginNullValues.warningPasswordlMessage());

	}
	
	

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
		
	}

	

}
