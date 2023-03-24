package myFirstPOM;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ProductPage_TEST {
	
	private WebDriver driver;
	ProductPage addProductTest;
	
	

	@Before
	public void setUp() throws Exception 
	{
		addProductTest = new ProductPage(driver);
		driver = addProductTest.firefoxDriverConnection();
		addProductTest.visit("https://juice-shop.herokuapp.com");
		driver.manage().window().maximize();
	}
	
	/*@Test
	public void Test1_AddProduct() throws InterruptedException 
	{
		
		//Calling method to add product
		addProductTest.addingProduct();
		
		//Validating the name of the product inside Your Basket Container
		assertEquals("Apple Juice (1000ml)", addProductTest.nameIsCorrect());
		
	}*/
	
	/*@Test
	public void Test2_DeleteProduct () throws InterruptedException {
		
		//Calling method delete product
		addProductTest.deleteProduct();
		
	}*/
	
	@Test
	public void Test3_CompleteOrder() throws InterruptedException
	{
		//Calling method complete order
		addProductTest.completeOrder();
	}
	
	
	

	@After
	public void tearDown() throws Exception 
	{
		//driver.quit();
	}

	

}
