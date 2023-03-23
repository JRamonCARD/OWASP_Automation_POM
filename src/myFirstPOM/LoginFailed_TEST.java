package myFirstPOM;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginFailed_TEST {
	
	private WebDriver driver;
	LoginFailed loginFailed;
	
	

	@Before
	public void setUp() throws Exception {
		
		loginFailed = new LoginFailed(driver);
		driver = loginFailed.firefoxDriverConnection();
		loginFailed.visit("https://juice-shop.herokuapp.com");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test() {
		
		//Caling the complete method Login User
		loginFailed.loginFailed();	
		
		//Validating the warning message text is correct
		assertEquals("Invalid email or password.", loginFailed.warningMessage());
	}
	
	
	
	

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
