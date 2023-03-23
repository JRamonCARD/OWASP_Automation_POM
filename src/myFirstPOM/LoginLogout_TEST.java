package myFirstPOM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginLogout_TEST {
	
	private WebDriver driver;
	LoginLogout loginLogout;

	@Before
	public void setUp() throws Exception 
	{
		loginLogout = new LoginLogout (driver);
		driver = loginLogout.firefoxDriverConnection();
		loginLogout.visit("https://juice-shop.herokuapp.com");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test() 
	{
		//Calling method Login Logout
		loginLogout.logOutProcess();
	}


	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}

	
}
