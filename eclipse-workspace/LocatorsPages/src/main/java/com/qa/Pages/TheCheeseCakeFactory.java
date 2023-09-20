package com.qa.Pages;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.qa.Base.TestBase;

public class TheCheeseCakeFactory extends TestBase {
	WebDriver driver;

	@FindBy(xpath = "//*[local-name()='svg' and @type='logo']")
	WebElement Logo;

	@FindBy(xpath = "//a[@class='link-sm']")
	List<WebElement> HeaderOptions;

	@FindBy(xpath = "//a[contains(text(),'Locations')]")
	WebElement Locations;

	@FindBy(xpath = "//a[contains(text(),'Browse Menu')]")
	WebElement Browsemenu;

	@FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
	WebElement GiftCards;

	@FindBy(xpath = "(//a[contains(text(),'Careers')])[1]")
	WebElement careers;

	@FindBy(xpath = "(//a[contains(text(),'Reservations')])[1]")
	WebElement Reservations;

	@FindBy(xpath = "(//a[contains(text(),'Rewards')])[1]")
	WebElement Rewards;

	@FindBy(xpath = "//*[local-name()='svg' and @type='user-24']")
	WebElement loginBtn;

	@FindBy(xpath = "//*[local-name()='svg' and @type='bag-24']")
	WebElement cartbtn;

	@FindBy(xpath = "//h3[@class='c-sign-in-page__title']")
	WebElement LoginPageTitle;

	@FindBy(xpath = "//*[@id='locationFinderBrandifyIframe']")
	WebElement iframe;
	@FindBy(xpath = "//input[@id='search_input']")
	WebElement SearchLocation;

	@FindBy(xpath = "//button[@class='button-search']")
	WebElement GoBtn;

	@FindBy(xpath = "//div[@class='card-front-inner']")
	List<WebElement> TotalLocations;

	@FindBy(xpath = "//a[@id='Reservation_58']")
	WebElement MakeReservation;

	@FindBy(xpath = "//h3[@class='c-reservation-sign-in-page__title']")
	WebElement ReservationPageTitle;

	@FindBy(id="Joinrewards_58")
	WebElement JoinRewards;
	
	@FindBy(xpath = "//h2[@class='loaded']")
	WebElement RewardsPagetitle;

	@FindBy(xpath = "//a[@id='Pickup_58']")
	WebElement OrderPickUp;

	@FindBy(xpath = "//h3[@class='c-menu__location__header--main']")
	WebElement OrderPickUppageTitle;

	@FindBy(xpath = "//a[@id='Delivery_58']")
	WebElement OrderDelivery;

	@FindBy(xpath = "(//div[@class='InlineChildren__StyledInlineChildren-sc-6r2tfo-0 kTAIig'])[2]")
	WebElement OrderDeliveryPageTitle;

	@FindBy(xpath = "//div[@class='c-footer__logo']")
	WebElement FooterLogo;

	@FindBy(xpath = "//div[@class='c-footer__content']") // Footer che all options
	WebElement FooterOptions;

	
	@FindBy(xpath="//button[@id='pickup_btn']")
	WebElement OrderPickup;
	
	@FindBy(xpath="//div[@class='card-front-inner']")
	List <WebElement> OrderPickupStores;
	
	@FindBy(xpath="//button[@id='delivery_btn']")
	WebElement OrderDeliveryOption;
	
	@FindBy(xpath="//div[@class='card-front-inner']")
	WebElement Doordash;
	
	@FindBy(xpath="//button[@class='dd_btn ']")
	WebElement DoordashLink;
	
	@FindBy(xpath="//span[@data-gaact='Click_to_Make_Reservation']")
	WebElement Narbylocations;
	
	public TheCheeseCakeFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void headerMenu() throws Exception {
		Assert.assertEquals(true, Logo.isDisplayed());
		System.out.println("\"The Cheese Cake Factory Logo\" is Pressent");

		for (WebElement option : HeaderOptions) {
			System.out.println(option.getText());
		}
		Assert.assertEquals(Browsemenu.getText(), "BROWSE MENU");
		System.out.println("BROWSE MENU option is present");
		Assert.assertEquals(GiftCards.getText(), "GIFT CARDS");
		System.out.println("BROWSE MENU option is present");
		Assert.assertEquals(careers.getText(), "CAREERS");
		System.out.println("GIFT CARDS option is present");
		Assert.assertEquals(Reservations.getText(), "RESERVATIONS");
		System.out.println("RESERVATIONS option is present");
		Assert.assertEquals(Rewards.getText(), "REWARDS");
		System.out.println("REWARDS option is present");
		Assert.assertEquals(true, loginBtn.isDisplayed());
		System.out.println("Login button is present");
		loginBtn.click();
		Thread.sleep(3000);
		System.out.println("Title of Login page is: " + LoginPageTitle.getText());
		driver.navigate().back();
		Thread.sleep(7000);
		Assert.assertEquals(true, cartbtn.isDisplayed());
		System.out.println("Cart button is present");

	}

	public void EnterLocation() throws Exception {
		Thread.sleep(10000);
		driver.switchTo().frame(iframe);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(SearchLocation));
		SearchLocation.click();
		SearchLocation.clear();
		SearchLocation.sendKeys("Santa clara");
//		SearchLocation.sendKeys("50266");
//		SearchLocation.sendKeys("50131");
		GoBtn.click();
		
		
	}
	public void Locations() throws Exception {
		EnterLocation();
		Thread.sleep(3000);
		
		for(WebElement location:TotalLocations) {
			System.out.println(location.getText());
		}
		driver.switchTo().parentFrame();
	}

	public void reservationPage() throws Exception {
		
		EnterLocation();
		Thread.sleep(7000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", MakeReservation);
		Thread.sleep(2000);
		MakeReservation.click();
		Thread.sleep(3000);
		System.out.println(ReservationPageTitle.getText());
		driver.navigate().back();
		Thread.sleep(7000);
	}

	public void RewardsPage() throws Exception {
		Thread.sleep(3000);
		EnterLocation();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", MakeReservation);
		Thread.sleep(2000);
		
		JoinRewards.click();
		Thread.sleep(15000);
		System.out.println(RewardsPagetitle.getText());
		driver.navigate().back();
		Thread.sleep(7000);
		driver.switchTo().parentFrame();
	}

	public void orderPickupPage() throws Exception {
		Thread.sleep(3000);
		EnterLocation();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", OrderPickUp);
		Thread.sleep(2000);
		OrderPickUp.click();
		Thread.sleep(4000);
		System.out.println(OrderPickUppageTitle.getText());
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(7000);
		
	}

	public void orderDeliveryPage() throws Exception {
		
		Thread.sleep(3000);
		EnterLocation();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", MakeReservation);
		OrderDelivery.click();
		System.out.println(OrderDeliveryPageTitle.getText());
		driver.navigate().back();
		Thread.sleep(7000);
		driver.switchTo().parentFrame();
	}
	public void FooterMenu() throws Exception {
		Thread.sleep(15000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", FooterLogo);
		Thread.sleep(2000);
		System.out.println("scroll down to bottom of the page");
		System.out.println(FooterLogo.isDisplayed());
		driver.navigate().refresh();
	}
	public void OrderPickupOption() throws Exception {
		EnterLocation();
		Thread.sleep(5000);
		OrderPickup.click();
		for(WebElement store:OrderPickupStores)
		{System.out.println(store.getText());
		
		}		System.out.println("Total stores available for Order pickup option are: "+OrderPickupStores.size());

		driver.switchTo().parentFrame();
		}
	public void OrderDeliveryOption() throws Exception {
		EnterLocation();
		Thread.sleep(8000);
		OrderDeliveryOption.click();
		System.out.println(Doordash.getText());	
		DoordashLink.isDisplayed();
		driver.switchTo().parentFrame();
	}
		
}
