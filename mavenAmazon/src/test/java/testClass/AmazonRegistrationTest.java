package testClass;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonRegistrationTest extends BaseTestClass {
	

	
	@Test
    public void testAmazonRegistration() throws Exception 
	{
        ac.fillRegistrationForm("John Doe", "john.doe@example.com", "securePassword");
        ac.submitRegistrationForm();
        Thread.sleep(3000);
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
