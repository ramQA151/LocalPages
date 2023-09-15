package com.qa.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TheNorthFaceStoreLocator {
	WebDriver driver;
	@FindBy(xpath = "//a[@class='large-only vf-header__logo-link vf-link active']//*[name()='svg']")
	WebElement TheNorthFaceLogo;

	@FindBy(xpath = "//div[contains(text(),'Order Status')]")
	WebElement orderstatus;

	@FindBy(xpath = "//div[contains(text(),'Live chat')]")
	WebElement LiveChat;

	@FindBy(xpath = "//div[contains(text(),'Join XPLR Pass™')]")
	WebElement joinvipeak;

	@FindBy(xpath = "//div[contains(text(),'Find a Store')]")
	WebElement findstore;

	@FindBy(xpath = "//div[contains(text(),'Gift Cards')]")
	WebElement GiftCards;

	@FindBy(xpath = "//div[normalize-space()='Sign In']")
	WebElement signin;

	@FindBy(xpath = "//div[contains(text(),'Help')]")
	WebElement help;

	@FindBy(xpath = "//a[@aria-label='Show cart']//*[name()='svg']")
	WebElement cart;

	@FindBy(id="search_input")
	WebElement SearchField;

	@FindBy(xpath = " //span[contains(text(),'Online Dealers')]")
	WebElement textOnlineDealers;
	
	@FindBy(xpath = "//button[@aria-label='Search']")
	WebElement SearchBtn;
	
	@FindBy(xpath = "//div[@class='poi_box']")
	List <WebElement> AddressCount ;

	@FindBy(xpath="//div[@class='filter_div']")
	WebElement Filters;
	
	
	public TheNorthFaceStoreLocator(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void VerifyHeaders() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(TheNorthFaceLogo.isDisplayed());
		System.out.println("The North Face Logo Is displayed");

		Assert.assertTrue(orderstatus.isEnabled());
		System.out.println("Order status is Enabled");

		Assert.assertTrue(LiveChat.isEnabled());
		System.out.println("Gift Cards is Enabled");

		Assert.assertTrue(joinvipeak.isEnabled());
		System.out.println("JoinVipeak is Enabled");

		Assert.assertTrue(findstore.isEnabled());
		System.out.println("Find Store is Enabled");

		Assert.assertTrue(signin.isEnabled());
		System.out.println("Signin is Enabled");

		Assert.assertTrue(help.isEnabled());
		System.out.println("Help is Enabled");

		Assert.assertTrue(cart.isEnabled());
		System.out.println("Cart is Enabled");

	}

	public void verifyFindstore() throws InterruptedException {

		Thread.sleep(3000);
		 WebElement iframe = driver.findElement(By.xpath("//iframe[@data-id='211436']"));
		driver.switchTo().frame(iframe);
		System.out.println("InputField is Enabled");
		SearchField.click();
		SearchField.sendKeys("Santa Clara");
		SearchBtn.click();
		
		for(WebElement Address:AddressCount) {
			System.out.println(Address.getText());
		}
		
		}

	
}
