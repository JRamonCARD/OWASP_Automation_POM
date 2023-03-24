package myFirstPOM;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ProductPage_TEST {
	
	private WebDriver driver;
	ProductPage addProduct;
	

	@Before
	public void setUp() throws Exception 
	{
		addProduct = new ProductPage(driver);
		driver = addProduct.firefoxDriverConnection();
		addProduct.visit("https://juice-shop.herokuapp.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException 
	{
		
		//Calling method to add product
		addProduct.addingProduct();
		
		//Validating the name of the product inside Your Basket Container
		assertEquals("Apple Juice (1000ml)", addProduct.nameIsCorrect());
		
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}

	

}
