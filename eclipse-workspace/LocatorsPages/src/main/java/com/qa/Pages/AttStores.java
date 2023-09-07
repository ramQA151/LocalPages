package com.qa.Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.TestBase;

public class AttStores extends TestBase{
	WebDriver driver;
	@FindBy(xpath="//div[@id='fsrInvite']")
	String Feedback;
	
	@FindBy(id="fsrHeading")
	WebElement Fbheading1;
		
	@FindBy(xpath="//span[@id='location-name']")
	WebElement heading;
	
	@FindBy(css=".fsrAbandonButton.fsrButton.fsrButton__inviteClose")
	WebElement closeFbWindow;
	
	@FindBy(xpath="//div[normalize-space()='Pay your bill']")
	WebElement BillPay;
	
	@FindBy(xpath="//h2[@class='ProgressIndicator__title__n9daH pull-left color-ui-black font-medium']")
	WebElement BillPaymentPageTitle;
	
	@FindBy(xpath="//div[normalize-space()='Upgrade device']")
	WebElement UpgradeDevice;
	
	@FindBy(xpath="//strong[contains(text(),'Get up to five of your devices upgraded at once—in')]")
	WebElement UpgradeDevicePageTitle;
	
	@FindBy(xpath="//div[normalize-space()='Get Support']")
	WebElement GetSupport;
	
	//@FindBy(xpath="//h1[@class='GreetingText_headerTitle__937oD']")
	@FindBy(xpath="//h1[contains(text(),'Welcome to AT&T Support')]")
	WebElement GetSupportPageTitle;
	
	@FindBy(xpath="//div[normalize-space()='myAT&T app']")
	WebElement myATTApp;
	
	@FindBy(xpath="//h2[normalize-space()='Make everything easier with the myAT&T app']")
	WebElement GetmyATTAppPageTitle;
	
	@FindBy(xpath="//a[@class='ButtonRedesign--primary Core-cta--1 cta-track']")
	WebElement ShopNow;
	
	@FindBy(xpath="//h2[normalize-space()='Pick your device']")
	WebElement ShopNowPageTitle;
	
	@FindBy(xpath="//a[normalize-space()='Overview']")
	WebElement Overview;
	
	@FindBy(xpath="//div[@id='hoursAccordian']")
	List <WebElement> OverviewTime;
	
	@FindBy(css=".Core-address.Core-content.HeadingRedesign--info")
	WebElement OverviewAddress;
	
	@FindBy(xpath="//a[@class='c-get-directions-button Core-directions ButtonRedesign--secondary cta-track']")
	WebElement GetDirection;
	
	@FindBy(xpath="//a[contains(text(),'Offers')]")
	WebElement OffersSection;
	public AttStores(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		
	public void heading() {
		System.out.println(heading.getText());
	}
	public void FbWindow() {
		closeFbWindow.click();
}
	public void BillPayment() throws Exception {
		BillPay.click();
		System.out.println(BillPaymentPageTitle.getText());
		Assert.assertTrue(true, "Pay without signing in");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);

	}
	public void UpgradingDevice() throws InterruptedException {
		UpgradeDevice.click();
		System.out.println(UpgradeDevicePageTitle.getText());
		Assert.assertTrue(true, "Get up to five of your devices upgraded at once—in a single order. Upgrade now ");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);

	}
	
	public void GetSupport() throws Exception {
		GetSupport.click();
		Thread.sleep(4000);
		System.out.println(GetSupportPageTitle.getText());
		//Assert.assertTrue(true, "Get up to five of your devices upgraded at once—in a single order. Upgrade now ");
		Thread.sleep(4000);
		driver.navigate().back();
	}
	

	public void GetMyAttApp() throws Exception {
		myATTApp.click();
		Thread.sleep(4000);
		System.out.println(GetmyATTAppPageTitle.getText());
		Assert.assertTrue(true, "Make everything easier with the myAT&T app");
		Thread.sleep(4000);
		driver.navigate().back();
	}
	public void ShopNowBtn() throws Exception {
		ShopNow.click();
		Thread.sleep(4000);
		System.out.println(ShopNowPageTitle.getText());
		Assert.assertTrue(true, "Pick your devic");
		Thread.sleep(4000);
		driver.navigate().back();
	}
	
	public void OverviewTabTime() throws Exception {
		Overview.click();
		Thread.sleep(4000);
		for(WebElement OT: OverviewTime) {
			String Timing = OT.getText();
		     System.out.println("Open Until" +Timing);
		}
			}
		
		public void OverviewTabAddress() throws Exception {
			Overview.click();
			System.out.println(OverviewAddress.getText());
		}
		
		public void OverviewTabAddressMap() throws Exception {
			GetDirection.click();
			String parentWindowHandle = driver.getWindowHandle();

			Set<String> allWindowHandles = driver.getWindowHandles();

			for (String windowHandle : allWindowHandles) {
			    if (!windowHandle.equals(parentWindowHandle)) {
			        driver.switchTo().window(windowHandle);
			       
			    }
			}
			Thread.sleep(6000);
			System.out.println("Title of child window is: "+driver.getTitle());
			driver.close();
		}
		
		public void Offers() throws Exception {
			ShopNow.click();
			Thread.sleep(4000);
			System.out.println(ShopNowPageTitle.getText());
			Assert.assertTrue(true, "Pick your devic");
			Thread.sleep(4000);
			driver.navigate().back();
		}
	
}
