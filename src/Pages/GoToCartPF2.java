package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToCartPF2 {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	WebElement GoToCart1;
	


	public void  GoToCart1() {
		GoToCart1.click();
	}


	// Method to click on go to cart option
	public GoToCartPF2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
}
