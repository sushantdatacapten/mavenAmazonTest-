package PageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage 
{
 
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBoxLocator;
	
	public AmazonHomePage(WebDriver driver) 
	{
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void verifyTitle() throws InterruptedException
	{   
		Thread.sleep(3000);
		String title = driver.getTitle();
		if(title.equals("amazon"))
		{
			System.out.println("Amazon india opened");
		}
	}

    public void searchForProduct(String product) throws Exception
    {
    	Thread.sleep(3000);
    	searchBoxLocator.sendKeys(product);
    	searchBoxLocator.submit();
    }

	
}
