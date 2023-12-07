package testClass;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageClass.ProductDetailsPage;
import PageClass.SearchResultsPage;
import PageClass.AmazonHomePage;

public class AmazonAutomationTest extends BaseTestClass
{
	
	
	
	@Test(priority=0,enabled=true)
	public void searchProduct() throws Exception   
	{
	
	hm.searchForProduct("iPhone");
	
    }
	@Test
	public void verifyProduct() throws Exception  {
        sr.selectProduct();
        
	}
	
	@Test
	public void detailsProduct() throws Exception  
	{
		
		String price = pd.getPrice();
	    System.out.println("Price: " + price);
        
	}
	
	@Test
	public void addToCart() throws Exception 
	{
		
		pd.addToCart();
	}
        
    @AfterTest
    public void tearDown() 
    {
        if (driver != null) 
        {
            driver.quit();
        }
    }

}
