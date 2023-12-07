package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import PageClass.AmazonCreateAccountPage;
import PageClass.PhoneFilter;
import PageClass.ProductDetailsPage;
import PageClass.SearchResultsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import PageClass.AmazonHomePage;

public class BaseTestClass 
{
	static WebDriver driver;
	
	AmazonHomePage hm;
	ProductDetailsPage pd;
	SearchResultsPage sr;
	AmazonCreateAccountPage ac;
	PhoneFilter pf;
	
	@BeforeSuite
	public void launchURL() 
	{
		//System.setProperty("", )
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		
		
	}
	@BeforeClass
	public void creationObject()
	{
		
		hm=new AmazonHomePage(driver);
		pd=new ProductDetailsPage(driver);
		sr=new SearchResultsPage(driver);
		ac=new AmazonCreateAccountPage(driver);
		pf=new PhoneFilter(driver);
		
		
	}

}
