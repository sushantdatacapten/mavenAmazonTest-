package PageClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {
	
	WebDriver driver;
	@FindBy(xpath="//span[@id='priceblock_ourprice']")
	   private WebElement priceLocator;
	@FindBy(id="add-to-cart-button")
	   private WebElement addToCartButtonLocator;
	
	 public ProductDetailsPage(WebDriver driver) {
		 this.driver = driver;
	       PageFactory.initElements(driver, this);
	 }
	 
	 public String getPrice()  throws Exception 
	 {
		 Thread.sleep(3000);
		 String priceElement = priceLocator.getText().replaceAll("[^0-9]", ""); // Remove non-numeric characters;
		 return priceElement;
		 
	 }
	 
	 public void addToCart() throws Exception 
	 {
		 Thread.sleep(6000);
         addToCartButtonLocator.click();
         
	}
}
