package myFirstPOM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginValid_TEST {
	
	private WebDriver driver;
	LoginValid loginValid;
	

	@Before
	public void setUp() throws Exception {
		
		loginValid = new LoginValid(driver);
		driver = loginValid.firefoxDriverConnection();
		loginValid.visit("https://juice-shop.herokuapp.com");
		driver.manage().window().maximize();
	}

	
	@Test
	public void test() {
		
		//Calling method Valid Login from y Class
		loginValid.validLogin();
		
		//Validating if the email displayed is my email
		assertEquals("li.ramoncr@gmail.com", loginValid.loginSuccessfully());
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}
