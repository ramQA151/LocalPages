package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.TestBase;

public class Nesbittburnslocator extends TestBase{

	WebDriver driver;

@FindBy(xpath = "//a[@class='tl-header-secondary-logo']//img")
WebElement BMO_logo;

@FindBy(xpath = "//h3[contains(text(),'Find an Investment Advisor')]")
WebElement bmo_heading;

@FindBy(xpath = "//h4[contains(text(),'Match Me')]")
WebElement matchme_heading;

@FindBy(xpath = "//button[@class='match-me']")
WebElement getmatch_btn;

@FindBy(xpath = "//h4[contains(text(),'Search by Location')]")
WebElement searchlocation_heading;

@FindBy(xpath = "//input[@id='location-input']")
WebElement locationsearch_field;

@FindBy(xpath = "//button[@class='search-by-location']")
WebElement findcloestadvisor_btn;

@FindBy(xpath = "//h4[contains(text(),'Search by Advisor Name')]")
WebElement searchadvisorname_heading;

@FindBy(xpath = "//input[@placeholder='First Name']")
WebElement firstname_field;

@FindBy(xpath = "//input[@placeholder='Last Name']")
WebElement lastname_field;

@FindBy(xpath = "//button[@class='search-by-name']")
WebElement searchbyname_btn;

@FindBy(xpath = "//li[contains(text(),'N0G')]")
WebElement select_location;

@FindBy(xpath = "//span[@id='Name686']")
WebElement advisor_name;

@FindBy(xpath = "/descendant::li[@data-uid='1434420937']/div[2]/div[2]")
WebElement advisor_details;

@FindBy(xpath = "//span[@class='phone desktopPhone hideit416-359-7306']")
WebElement advisor_phone;

@FindBy(xpath = "//span[@id='getDirections686']")
WebElement getdirection;

@FindBy(xpath = "//div[@class='section-hero-header-title-description']")
WebElement direction_details;

@FindBy(xpath = "//h1[contains(text(),'Christopher Davies')]")	
WebElement profile_heading;

@FindBy(xpath = "//a[@id='contactmeDesktop685']")
WebElement emailme_link;

@FindBy(xpath="//a[@id='sendtoEmail686']")
WebElement sendvia_email;

@FindBy(xpath="//p[@id='dispPop']//iframe")
WebElement frame1;

@FindBy(xpath="//div[@class='theAddress']")
WebElement details;

@FindBy(id="useremailaddress")
WebElement emailfield;

@FindBy(id="emailTextArea")
WebElement emailtextfield;

@FindBy(id="emailSubmitButton")
WebElement emailsubmit_btn;

@FindBy(xpath="//a[@class='closeBtn']")
WebElement closebtn;

@FindBy(xpath="//a[@id='sendtoMobile686']")
WebElement sendvia_mobile ;

@FindBy(xpath="//p[@id='dispPop']//iframe")
WebElement frame11;

@FindBy(xpath="//div[@class='theAddress']")
WebElement details1;

@FindBy(id="userPhone")
WebElement mobilefeild;

@FindBy(id="smsSubmitButton")
WebElement mobilesubmit_btn;

@FindBy(xpath="//a[@class='closeBtn']")
WebElement closebtn1;

@FindBy(xpath="//a[@id='contactmeDesktop686']")
WebElement emailme;

@FindBy(xpath="//p[@id='dispPop']//iframe")
WebElement frame2;

@FindBy(xpath="//div[@id='content']/div[1]")
WebElement heading_top;

@FindBy(name="firstname")
WebElement firstnamefield;

@FindBy(name="lastname")
WebElement LastNameField;

@FindBy(name="emailaddress")
WebElement emailfeild;

@FindBy(name="homephone")
WebElement homephone;

@FindBy(name="info")
WebElement textarea;

@FindBy(id="update")
WebElement sendmail_btn;

@FindBy(xpath="//a[@class='closeBtn']")
WebElement closebtn2;

@FindBy(xpath="//span[@id='moreDetails686-fr']")
WebElement profile_btn;

@FindBy(xpath="//h1[contains(text(),'Daniel Gruchala')]")
WebElement titlename;

@FindBy(xpath="//div[@id='captcha_element']/div/div/iframe")
WebElement frame3;

@FindBy(id="rc-anchor-container")
WebElement check_box;

public Nesbittburnslocator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	
	public void verifyHomeDetails() throws InterruptedException {
		Thread.sleep(3000);
		
		Assert.assertTrue(bmo_heading.isDisplayed());
		System.out.println(bmo_heading.getText());
		Assert.assertTrue(matchme_heading.isDisplayed());
		System.out.println(matchme_heading.getText());
		Assert.assertTrue(getmatch_btn.isDisplayed());
		System.out.println("Get Matched Button is displayed");
		Assert.assertTrue(searchlocation_heading.isDisplayed());
		System.out.println("Serach by Location is dispayed");
		Assert.assertTrue(locationsearch_field.isEnabled());
		System.out.println("Location Search Field is Enabled");
		Assert.assertTrue(findcloestadvisor_btn.isEnabled());
		System.out.println("Find Closest Advisor is Enabled");
		Assert.assertTrue(searchadvisorname_heading.isDisplayed());
		System.out.println(searchadvisorname_heading.getText());
		Assert.assertTrue(firstname_field.isEnabled());
		System.out.println("First Name input field is Enabled");
		Assert.assertTrue(lastname_field.isEnabled());
		System.out.println("Last Name input field is Enabled");
		Assert.assertTrue(searchbyname_btn.isEnabled());
		System.out.println("Find an Advisor button is Enabled");
		Thread.sleep(3000);
	}
	
	public void searchbylocation() throws InterruptedException {
		Thread.sleep(3000);
		locationsearch_field.clear();
		Thread.sleep(1000);
		locationsearch_field.sendKeys("Toronto ON");
		Thread.sleep(1000);
		findcloestadvisor_btn.click();
		Thread.sleep(5000);
		 
		
	}
	
	public void investment_info() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(advisor_name.isDisplayed());
		System.out.println("Name of Advisor:- "+advisor_name.getText());
		Assert.assertTrue(advisor_details.isDisplayed());
		System.out.println("Advisor post and address is:- "+advisor_details.getText());
		Assert.assertTrue(advisor_phone.isDisplayed());
		System.out.println("Advisor Phone number is:- "+advisor_phone.getText());
		
	}
	
	public void VerifyGetDirection() throws InterruptedException {
		Thread.sleep(5000);
		searchbylocation();
		Thread.sleep(4000);
		getdirection.click();
		Thread.sleep(7000);
		
		System.out.println("Direction Address Details :- " + driver.getTitle());
		driver.navigate().back();
	}
	
	public void verifySendToEmail() throws InterruptedException {
		Thread.sleep(3000);
		sendvia_email.click();
		Thread.sleep(7000);
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
	}
	
	public void VerifySendToMobile() throws InterruptedException {
		Thread.sleep(5000);
		sendvia_mobile.click();
		Thread.sleep(8000);
		driver.switchTo().frame(frame11);
		Assert.assertTrue(details1.isDisplayed());
		System.out.println("Investor Details:- "+ details.getText());
		Thread.sleep(3000);
		mobilefeild.sendKeys("3334445555");
		Thread.sleep(3000);
		mobilesubmit_btn.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		closebtn1.click();
	}
	
	public void VerifyEmailMe() throws InterruptedException {
		Thread.sleep(4000);
		searchbylocation();
		Thread.sleep(4000);
		emailme.click();
		Thread.sleep(5000);
		driver.switchTo().frame(frame2);
		Assert.assertTrue(heading_top.isDisplayed());
		System.out.println("address Heading :- "+heading_top.getText());
		Thread.sleep(1000);
		Assert.assertTrue(firstnamefield.isEnabled());
		firstnamefield.sendKeys("Ajay");
		Thread.sleep(1000);
		Assert.assertTrue(LastNameField.isEnabled());
		LastNameField.sendKeys("Yadav");
		Thread.sleep(1000);
		Assert.assertTrue(emailfeild.isEnabled());
		emailfeild.sendKeys("ayadav@where2getit.com");
		Thread.sleep(1000);
		Assert.assertTrue(homephone.isEnabled());
		homephone.sendKeys("3334445555");
		Thread.sleep(1000);
		Assert.assertTrue(textarea.isEnabled());
		textarea.sendKeys("test message");
		Thread.sleep(1000);
	//	driver.switchTo().frame(frame3);
	//	check_box.click();
	//	driver.switchTo().frame(frame1);
	//	Thread.sleep(1000);
		Assert.assertTrue(sendmail_btn.isEnabled());
		//sendmail_btn.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		closebtn2.click();
	}
	
	public void verify_profiledetails() throws InterruptedException {
		Thread.sleep(5000);
		searchbylocation();
		Thread.sleep(4000);
		profile_btn.click();
		Thread.sleep(5000);
		Assert.assertTrue(titlename.isDisplayed());
		System.out.println(titlename.getText());
		driver.navigate().back();
	}
}
