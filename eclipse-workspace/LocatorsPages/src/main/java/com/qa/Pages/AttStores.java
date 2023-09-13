package com.qa.Pages;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.qa.Base.TestBase;

public class AttStores extends TestBase {
	WebDriver driver;

	@FindBy(xpath = "//div[@id='fsrInvite']")
	String Feedback;

	@FindBy(id = "fsrHeading")
	WebElement Fbheading1;

	@FindBy(xpath = "//span[@id='location-name']")
	WebElement heading;

	@FindBy(css = ".fsrAbandonButton.fsrButton.fsrButton__inviteClose")
	WebElement closeFbWindow;

	@FindBy(xpath = "//div[normalize-space()='Pay your bill']")
	WebElement BillPay;

	@FindBy(xpath = "//h2[@class='ProgressIndicator__title__n9daH pull-left color-ui-black font-medium']")
	WebElement BillPaymentPageTitle;

	@FindBy(xpath = "//div[normalize-space()='Upgrade device']")
	WebElement UpgradeDevice;

	@FindBy(xpath = "//strong[contains(text(),'Get up to five of your devices upgraded at once—in')]")
	WebElement UpgradeDevicePageTitle;

	@FindBy(xpath = "//div[normalize-space()='Get Support']")
	WebElement GetSupport;

	// @FindBy(xpath="//h1[@class='GreetingText_headerTitle__937oD']")
	@FindBy(xpath = "//h1[contains(text(),'Welcome to AT&T Support')]")
	WebElement GetSupportPageTitle;

	@FindBy(xpath = "//div[normalize-space()='myAT&T app']")
	WebElement myATTApp;

	@FindBy(xpath = "//h2[normalize-space()='Make everything easier with the myAT&T app']")
	WebElement GetmyATTAppPageTitle;

	@FindBy(xpath = "//a[@class='ButtonRedesign--primary Core-cta--1 cta-track']")
	WebElement ShopNow;

	@FindBy(xpath = "//h2[normalize-space()='Pick your device']")
	WebElement ShopNowPageTitle;

	@FindBy(xpath = "//a[normalize-space()='Overview']")
	WebElement Overview;

	@FindBy(xpath = "//div[@id='hoursAccordian']")
	List<WebElement> OverviewTime;

	@FindBy(css = ".Core-address.Core-content.HeadingRedesign--info")
	WebElement OverviewAddress;

	@FindBy(xpath = "//a[@class='c-get-directions-button Core-directions ButtonRedesign--secondary cta-track']")
	WebElement GetDirection;

	@FindBy(xpath = "//a[contains(text(),'Offers')]")
	WebElement OffersSection;

	@FindBy(xpath = "//h2[@class='Products-title']")
	WebElement OffersSectnTitle;

	@FindBy(xpath = "//div[@id=\"Offers\"]")
	List<WebElement> AllOffers;

	@FindBy(xpath = "//a[@id='aboutJump']")
	WebElement AboutSection;

	@FindBy(xpath = "//h2[@class='About-title']")
	WebElement AboutSectnTitle;

	@FindBy(xpath = "//a[@class='Core-navLink js-nav-link LinkRedesign--header']")
	WebElement FAQSection;

	@FindBy(xpath = "//h2[@class='FAQ-title']")
	WebElement FAQSectionTitle;

	@FindBy(xpath = "//span[@class='FAQ-questionText']")
	List<WebElement> FAQQuestions;

	@FindBy(xpath = "//a[normalize-space()='Nearby Locations']")
	WebElement NearbyLocations;

	@FindBy(xpath = "//h2[@class='Nearby-title']")
	WebElement NearbyLocationTitle;

	@FindBy(xpath = "//li[@class='Nearby-loc js-nearby-loc showNearby']")
	WebElement NearbyAddress;

	@FindBy(xpath = "//h2[@class='Services-title']")
	WebElement AttServicesTitle;

	@FindBy(xpath = "//ul[@class='Services-list']//a[@class='Service-link']")
	List<WebElement> AttServices;

	@FindBy(xpath = "//div[@id='z5-footer-content']//a")
	List<WebElement> FooterMenu;

	@FindBy(xpath = "//li[@class='hide-sm hide-xsm']//a[contains(@aria-label,'Find a store')][normalize-space()='Find a store']")
	WebElement FindStore;

	@FindBy(xpath = "//font[contains(text(),'Find a store')]")
	WebElement FindStoreLink;

	@FindBy(xpath = "//form[@id='locator_search']//h1")
	WebElement ATTPage;
	
	@FindBy(xpath="//div[@class='bannerT']")
	WebElement AttStores;

	public AttStores(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void heading() throws Exception {
		
		System.out.println(heading.getText());
	}
	public void NavigatetoMainPage() {
		driver.navigate().back();
	}
	public void FbWindow() throws Exception {
		Thread.sleep(8000);
		if (Fbheading1.isDisplayed()) {
			System.out.println(Fbheading1.getText());
			closeFbWindow.click();
			System.out.println("Closed the feedback window.");
		} 
		else{
			System.out.println("Feedback window is not displayed.");
		}
	}

	public void BillPayment() throws Exception {
		//FbWindow();
		
		BillPay.click();
		System.out.println("Heading: " + BillPaymentPageTitle.getText());
		String title = BillPaymentPageTitle.getText();
		Assert.assertEquals(title, "Pay without signing in");
		
		NavigatetoMainPage();
		
	}

	public void UpgradingDevice() throws Exception {
		//FbWindow();
		UpgradeDevice.click();
		
		System.out.println("Heading: " + UpgradeDevicePageTitle.getText());
		// String title=UpgradeDevicePageTitle.getText();
		// Assert.assertEquals(title, "Get up to five of your devices upgraded at
		// once—in a single order. Upgrade now ");
		
		NavigatetoMainPage();
	
	}
	public void GetSupport() throws Exception {
		//FbWindow();
		GetSupport.click();
		
		System.out.println("Heading: " + GetSupportPageTitle.getText());
		
		NavigatetoMainPage();
		
	}

	public void GetMyAttApp() throws Exception {
		//FbWindow();
		myATTApp.click();
		
		System.out.println("Heading: " + GetmyATTAppPageTitle.getText());
		String title = GetmyATTAppPageTitle.getText();
		Assert.assertEquals(title, "Make everything easier with the myAT&T app");
		
		NavigatetoMainPage();
	
	}

	public void ShopNowBtn() throws Exception {
		//FbWindow();
		ShopNow.click();
		
		System.out.println("Heading: " + ShopNowPageTitle.getText());
		String title = ShopNowPageTitle.getText();
		Assert.assertEquals(title, "Pick your device");
		
		NavigatetoMainPage();
		
	}

	public void OverviewTabTime() throws Exception {
		Overview.click();
		
		for (WebElement OT : OverviewTime) {
			String Timing = OT.getText();
			System.out.println("Open Until" + Timing);
		}
	}

	public void OverviewTabAddress() throws Exception {
		
		Overview.click();
		System.out.println("Heading: " + OverviewAddress.getText());
	}

	public void OverviewTabAddressMap() throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		String parentWindowHandle = driver.getWindowHandle();
		GetDirection.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
			driver.switchTo().window(winHandle);
			if (!winHandle.equals(parentWindowHandle)) {
		        driver.switchTo().window(winHandle);
			Thread.sleep(5000);
			System.out.println("Child title: "+driver.getTitle());
			}
			driver.switchTo().window(parentWindowHandle);
			}
		
		}

	public void Offers() throws Exception {
		OffersSection.click();
		
		System.out.println("Heading: " + OffersSectnTitle.getText());
		Thread.sleep(2000);
		for (WebElement Alloffrs : AllOffers) {
			String Text = Alloffrs.getText();
			System.out.println("Open Until" + Text);
			String OfferNeeded = "Find out how everyone gets Samsung Galaxy S23 Ultra for ";
			Assert.assertTrue(Text.contains(OfferNeeded), OfferNeeded);
		}
	}

	public void About() throws Exception {
		
		AboutSection.click();
		
		System.out.println("Heading: " + AboutSectnTitle.getText());
		Thread.sleep(2000);
		Assert.assertEquals(AboutSectnTitle.getText(), "About the Westfield Store");
	}

	public void FAQ() throws Exception {
		
		FAQSection.click();
////		Thread.sleep(2000);
		int TotalQuestions = FAQQuestions.size();
		Assert.assertEquals(TotalQuestions, 9);
		System.out.println("Heading: " + FAQSectionTitle.getText());
		for (WebElement FAQ : FAQQuestions) {
			String text = FAQ.getText();
			System.out.println(text);
		}
	}

	public void NearbyLocations() throws Exception {
		
		NearbyLocations.click();
		
		System.out.println("Heading: " + NearbyLocationTitle.getText());
		Thread.sleep(2000);
		Assert.assertEquals(NearbyLocationTitle.getText(), "More locations in the Westfield area");
		System.out.println(NearbyAddress.getText());
		String Actaddress = NearbyAddress.getText();
		Assert.assertTrue(Actaddress.contains("1690 Route 22 East"));
	}

	public void AttServices() throws Exception {
		
		System.out.println("Heading: " + AttServicesTitle.getText());
		Thread.sleep(2000);
		System.out.println("Total Number of Services provided=" + AttServices.size());
		for (WebElement Attserv : AttServices) {
			String serv = Attserv.getText();
			System.out.println("Service Provided by AT&T: " + serv);
		}
	}

	public void FooterServices() throws Exception {
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		for (WebElement Ftmenu : FooterMenu) {
			String fmenu = Ftmenu.getText();
			System.out.println("Footer Menues: " + fmenu);
		}

		for (int i = 0; i < FooterMenu.size(); i++) {
			if (FooterMenu.get(i).getText().equalsIgnoreCase("Find a store")) {
				FooterMenu.get(i).click();
				System.out.println("Clicked on link successfully");
							}
			
		}System.out.println(AttStores.getText());
		Thread.sleep(3000);
		System.out.println(ATTPage.getText());
		NavigatetoMainPage();

	}
	
}
