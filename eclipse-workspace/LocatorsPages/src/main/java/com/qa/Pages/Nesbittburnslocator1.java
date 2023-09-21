package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.TestBase;

public class Nesbittburnslocator1 extends TestBase {

	WebDriver driver;

	@FindBy(xpath = "//a[@class='tl-header-secondary-logo']//img")
	WebElement BMO_logo;

	@FindBy(xpath = "//h3[contains(text(),'Find an Investment Advisor')]")
	WebElement bmo_heading;

	@FindBy(xpath = "//h4[contains(text(),'Search by Advisor Name')]")
	WebElement searchadvisorname_heading;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstname_field;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastname_field;

	@FindBy(xpath = "//button[@class='search-by-name']")
	WebElement searchbyname_btn;

	@FindBy(xpath = "//span[@id='Name26993']")
	WebElement advisor_name;

	@FindBy(xpath = "/descendant::li[@data-uid='1434422847']/div[2]/div[2]")
	WebElement advisor_details;

	@FindBy(xpath = "//span[@class='phone desktopPhone hideit519-669-4622']")
	WebElement advisor_phone;

	@FindBy(xpath = "//span[@id='getDirections26993']")
	WebElement getdirection;

	@FindBy(xpath = "//div[@class='section-hero-header-title-description']")
	WebElement direction_details;

	@FindBy(xpath = "//h1[contains(text(),'Greg Kurtz')]")
	WebElement profile_heading;

	@FindBy(xpath = "//a[@id='contactmeDesktop26993']")
	WebElement emailme_link;

	@FindBy(xpath = "//a[@id='sendtoEmail26993']")
	WebElement sendvia_email;

	@FindBy(xpath = "//p[@id='dispPop']//iframe")
	WebElement frame1;

	@FindBy(xpath = "//div[@class='theAddress']")
	WebElement details;

	@FindBy(id = "useremailaddress")
	WebElement emailfield;

	@FindBy(id = "emailTextArea")
	WebElement emailtextfield;

	@FindBy(id="emailSubmitButton")
	WebElement emailsubmit_btn;
	
	@FindBy(xpath="//a[@class='closeBtn']")
	WebElement closebtn;
	
	@FindBy(xpath="//p[@id='dispPop']//iframe")
	WebElement frame2;
	
	@FindBy(xpath="//a[@id='sendtoMobile26993']")
	WebElement sendvia_mobile;
	
	@FindBy(xpath="//div[@class='theAddress']")
	WebElement details2;
	
	@FindBy(id="userPhone")
	WebElement mobilefeild;
	
	@FindBy(id="smsSubmitButton")
	WebElement mobilesubmit_btn1;
	
	@FindBy(xpath="//a[@class='closeBtn']")
	WebElement closebtn1;
	
	@FindBy(xpath="//span[@id='moreDetails26993-fr']")
	WebElement profile_btn;
	
	@FindBy(xpath="//h1[contains(text(),'Greg Kurtz')]")
	WebElement titlename;
	
	public Nesbittburnslocator1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyHomeDetails() {
		Assert.assertTrue(bmo_heading.isDisplayed());
		System.out.println(bmo_heading.getText());
		Assert.assertTrue(searchadvisorname_heading.isDisplayed());
		System.out.println(searchadvisorname_heading.getText());
		Assert.assertTrue(firstname_field.isEnabled());
		System.out.println("First Name input field is Enabled");
		Assert.assertTrue(lastname_field.isEnabled());
		System.out.println("Last Name input field is Enabled");
		Assert.assertTrue(searchbyname_btn.isEnabled());
		System.out.println("Find an Advisor button is Enabled");
	}

	public void SearchByName() throws InterruptedException {
		Thread.sleep(3000);
		firstname_field.clear();
		lastname_field.clear();
		Thread.sleep(2000);
		firstname_field.sendKeys("Greg");
		Thread.sleep(2000);
		lastname_field.sendKeys("Kurtz");
		Thread.sleep(3000);
		searchbyname_btn.click();
		Thread.sleep(5000);
	}

	public void Advisor_info() throws InterruptedException {
		Assert.assertTrue(advisor_name.isDisplayed());
		System.out.println("Name of Advisor:- " + advisor_name.getText());
		Assert.assertTrue(advisor_details.isDisplayed());
		System.out.println("Advisor post and address is:- " + advisor_details.getText());
		Assert.assertTrue(advisor_phone.isDisplayed());
		System.out.println("Advisor Phone number is:- " + advisor_phone.getText());
	}

	public void VerifyGetdirection() throws InterruptedException {
		Thread.sleep(4000);
		getdirection.click();
		Thread.sleep(5000);
		Assert.assertTrue(direction_details.isDisplayed());
		System.out.println("Direction Address Details :- " + direction_details.getText());
		driver.navigate().to("https://nesbittburnslocator.bmo.com/index.y.html");
		driver.manage().deleteAllCookies();
	}

	public void verifySendToEmail() throws InterruptedException {
		sendvia_email.click();
		Thread.sleep(8000);
		driver.switchTo().frame(frame1);
		Assert.assertTrue(details.isDisplayed());
		System.out.println("Investor Details:- " + details.getText());
		Thread.sleep(3000);
		emailfield.sendKeys("ayadav@where2getit.com");
		Thread.sleep(3000);
		emailtextfield.sendKeys("Test Email");
		Thread.sleep(3000);
		emailsubmit_btn.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		closebtn.click();
		// driver.navigate().to("https://nesbittburnslocator.bmo.com/index.y.html");
		// driver.manage().deleteAllCookies();

	}

	public void VerifySendToMobile() throws InterruptedException {
		Thread.sleep(3000);
		sendvia_mobile.click();
		Thread.sleep(5000);
		driver.switchTo().frame(frame2);
		Assert.assertTrue(details2.isDisplayed());
		System.out.println("Investor Details:- " + details.getText());
		Thread.sleep(3000);
		mobilefeild.sendKeys("3334445555");
		Thread.sleep(3000);
		mobilesubmit_btn1.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		closebtn1.click();
		// driver.navigate().to("https://nesbittburnslocator.bmo.com/index.y.html");
		// driver.manage().deleteAllCookies();
	}

	public void verify_profiledetails() throws InterruptedException {
		Thread.sleep(4000);
		profile_btn.click();
		Thread.sleep(5000);
		Assert.assertTrue(titlename.isDisplayed());
		System.out.println(titlename.getText());
		driver.navigate().back();
	}
}
