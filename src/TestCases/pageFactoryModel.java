package TestCases;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import Pages.GoToCartPF1;
import Pages.GoToCartPF2;
import Pages.flipkartSearch_PF;
import io.github.bonigarcia.wdm.WebDriverManager;

public class pageFactoryModel {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vakacharla.sri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		


	}
	@Test
	public void SearchPage() throws InterruptedException {
		Actions action=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//Creating a object of TestNG
		flipkartSearch_PF  Search = new flipkartSearch_PF(driver);
		GoToCartPF1 cart1 = new GoToCartPF1(driver);
		GoToCartPF2 cart2 = new GoToCartPF2(driver);
		//To close the popup
		Search.closePopup();

		//To maximize the window
		driver.manage().window().maximize();

		//To open the search bar
		Search.search("q");
		//To search the producr realme 9 pro
		Search.clickOnProduct();
		

		//navigate to another tab
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		// Click on Go to cart button
		cart1.cickOnGoToCart();

		// To scroll upto cilck on add item
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[4]")));

		// To click on another product in add to cart page
		//cart1.clickOnAddItem();
		

		// To scroll upto cilck on remove button
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[2]/div[1]/div[2]/p")));

		//To click on remove button
		//cart1.clickOnRemove();
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[2]")));


		//Click on cancel button
		//cart1.clickOnCancel();
		Thread.sleep(30000);
		// to search the APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)
		cart1.Search1("q");

		// Click on APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)
		cart1.clickOnProduct1();
		

		//Navigate to the another tab
		ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(2));

		// Click on the Go to the cart to add APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)
		cart2.GoToCart1();

		//Click on add item to add the insurance of iPhone
		//cart2.addItem1();


	}

	@AfterTest
	public void teardown() throws Exception {
		driver.quit();
	}}
