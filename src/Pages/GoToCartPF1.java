package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToCartPF1 {
	WebDriver driver;
	//Actions action=new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	

	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	WebElement cickOnGoToCart;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[2]/div[2]/div[3]/button")
	WebElement clickOnAddItem;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[3]/div/div[2]")
	 WebElement clickOnRemove;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div/div[3]/div/div[1]")
	 WebElement clickOnCancel;
	 
	 @FindBy(name="q")
	 WebElement  SearchBox1;
	 
	 @FindBy(xpath ="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div")
	 WebElement clickOnProduct1;
	 
	 
	// method  To click on go to cart button
	public void cickOnGoToCart() {
		cickOnGoToCart.click();
	}
  //method To click on add to button to add the phone insurance
	public void clickOnAddItem() {
		clickOnAddItem.click();
	}
	
	// method to click on remove button to remove the cart product
	public void clickOnRemove() {
		clickOnRemove.click();
	}
	
	public void clickOnCancel() {
		clickOnCancel.click();
		
		

	}
	// method  enter apple i phone in the search to search the product
	public void Search1(String Keyword) {
		SearchBox1.sendKeys("APPLE iPhone 14 Pro Max (Deep Purple, 128 GB");
		SearchBox1.sendKeys(Keys.ENTER);
	}
	
	//method  click on visible i phone product
	public void clickOnProduct1() {
		clickOnProduct1.click();
	}




	public GoToCartPF1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}

