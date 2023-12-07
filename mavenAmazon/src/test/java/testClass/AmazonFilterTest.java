package testClass;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonFilterTest extends BaseTestClass 
{

	
	
	@Test(priority=4,enabled=true)
    public void testAmazonSearchAndFilter() throws Exception {
		pf.searchForPhone("phone");
        Thread.sleep(3000);
        pf.applyBrandFilter("Samsung");
        Thread.sleep(3000);
        pf.applyRatingFilter("4 Stars & Up");
        Thread.sleep(3000);
        int numberOfResults = pf.getNumberOfResults();
        Thread.sleep(3000);

        // Validate that the number of results is greater than 0
        Assert.assertTrue(numberOfResults > 0, "Number of results is greater than 0");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
