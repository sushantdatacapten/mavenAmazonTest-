package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneFilter {
	
	WebDriver driver;
	
	  @FindBy(id="twotabsearchtextbox")
	  private WebElement searchBox;
	   @FindBy(xpath="//span[text()='Brand']/ancestor::div[@class='a-section a-spacing-none']//span[@class='a-size-base a-color-base']")
	   private WebElement filterBrandLocator;
	   @FindBy(xpath="//span[text()='Avg. Customer Review']/ancestor::div[@class='a-section a-spacing-none']//span[@class='a-size-base a-color-base']")
	   private WebElement filterRatingLocator;
	   
	   
	   public PhoneFilter(WebDriver driver) 
	   {
		   this.driver = driver;
	       PageFactory.initElements(driver, this);
	   }
	   
	   public void searchForPhone(String product) throws Exception
	    {
	    	Thread.sleep(3000);
	    	searchBox.sendKeys(product);
	    	searchBox.submit();
	    }
	   
	   public void applyBrandFilter(String brand) throws Exception 
	   {
	       WebElement brandFilter = driver.findElement(By.xpath("//span[text()='" + brand + "']"));
	       Thread.sleep(3000);
	       brandFilter.click();
	       
	   }
	   
	   public void applyRatingFilter(String rating) throws Exception 
	   {
	       WebElement ratingFilter = driver.findElement(By.xpath("//span[text()='" + rating + "']"));
	       Thread.sleep(3000);
	       ratingFilter.click();
	       
	   }

	   public int getNumberOfResults() throws Exception
	   {
	       // Assuming the number of results is displayed on the page
		   Thread.sleep(3000);
		   WebElement resultCountElement = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-bold']"));
	       return Integer.parseInt(resultCountElement.getText().replaceAll("[^0-9]", ""));
	   }

}
