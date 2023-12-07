package PageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCreateAccountPage 
{
WebDriver driver;
	
	@FindBy(id="ap_customer_name")
	private WebElement nameInputLocator;
	@FindBy(id="ap_email")
	private WebElement emailInputLocator;
	@FindBy(id="ap_password")
	private WebElement passwordInputLocator;
	@FindBy(id="ap_password_check")
	private WebElement confirmPasswordInputLocator;
	@FindBy(id="continue")
	private WebElement createAccountButtonLocator;
	
	public AmazonCreateAccountPage(WebDriver driver) 
	{
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillRegistrationForm(String name, String email, String password) throws Exception  
    {
    	
    	Thread.sleep(3000);
        nameInputLocator.sendKeys(name);
        emailInputLocator.sendKeys(email);
        passwordInputLocator.sendKeys(password);
        confirmPasswordInputLocator.sendKeys(password);
        
    }

    public void submitRegistrationForm() throws Exception 
    {
    	Thread.sleep(3000);
    	createAccountButtonLocator.click();
        
    }
}


