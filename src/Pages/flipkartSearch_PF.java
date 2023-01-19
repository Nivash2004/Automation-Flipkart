package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartSearch_PF {
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	WebElement popUp;
	@FindBy(name= "q")
	WebElement SearchBar;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement ClickOnProduct;
	
	
	
	// to Enter realme 9 pro in the search bar

public void search(String Keyword) {
		SearchBar.sendKeys("realme 9 Pro 5G (Sunrise Blue, 128 GB)");
		SearchBar.sendKeys(Keys.ENTER);
		
	}

//Close the popup
	public void closePopup() {
		popUp.click();
	}
	
	//Click on the realme 9 pro
	public void clickOnProduct() {
		ClickOnProduct.click();
	}
	
	public flipkartSearch_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	}