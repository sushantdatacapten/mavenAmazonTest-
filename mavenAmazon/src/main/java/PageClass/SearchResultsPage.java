package PageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
	
   WebDriver driver;
	
   @FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
   private WebElement productLinkLocator;
   
   
   
   
   public SearchResultsPage(WebDriver driver) 
   {
	   this.driver = driver;
       PageFactory.initElements(driver, this);
   }

   public void selectProduct() throws Exception  
   {
	   Thread.sleep(3000);
	   productLinkLocator.click();
	   
   }
   
   
}
