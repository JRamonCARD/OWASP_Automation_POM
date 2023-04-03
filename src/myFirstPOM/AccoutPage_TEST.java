package myFirstPOM;

import static org.testng.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AccoutPage_TEST {
	
	private WebDriver driver;
	AccountPage accountPageTest;

	@Before
	public void setUp() throws Exception 
	{
		accountPageTest = new AccountPage(driver);
		driver = accountPageTest.firefoxDriverConnection();
		accountPageTest.visit("https://juice-shop.herokuapp.com");
		driver.manage().window().maximize();
	}
	

	/*
	@Test
	public void Test1_Account_UserProfile() throws InterruptedException 
	{
		//Calling method userProfile
		accountPageTest.userProfile();
		
		//Validate text from user label/title
		assertEquals("User Profile", accountPageTest.userProfileSuccess());

	}
	*/
	
	
	@Test
	public void Test2_Account_OrderHistory() throws InterruptedException 
	{
		//Calling method orderHistory
		accountPageTest.orderHistory();
		
		//Validate title of Order History section
		assertEquals("Order History", accountPageTest.orderHistoryLabel());
	}
	
	
	
	@After
	public void tearDown() throws Exception 
	{
		driver.close();
	}


}