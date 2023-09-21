package com.qa.Pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Nesbittburnslocator1 {

	public static WebDriver driver;
	
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
	
	public Nesbittburnslocator1() {
		super();
		PageFactory.initElements(driver, this);
	}

	public static final String AUTOMATE_USERNAME = "brandify2";
	  public static final String AUTOMATE_ACCESS_KEY = "W6Vg1fpe2sUbJtxWsvs2";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	 
	public static void initialization() {
		String baseurl = "https://nesbittburnslocator.bmo.com/index.y.html";
		System.setProperty("webdriver.chrome.driver", "E:\\NEDP Automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	 driver.get(baseurl);
	 
	}
	
	public static void BrowserStack_Invocation() throws MalformedURLException {
		String baseurl = "https://nesbittburnslocator.bmo.com/index.y.html";
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "79.0");
		caps.setCapability("resolution", "1366x768");
		caps.setCapability("project", "Local & Locators_Pages");
		caps.setCapability("build", "Locator-Page");
		caps.setCapability("name", "Nesbittburns1_locatorPage");
		//caps.setCapability("browserstack.local", "false");
		//caps.setCapability("browserstack.selenium_version", "3.14.0");

		    driver = new RemoteWebDriver(new URL(URL), caps);
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		    driver.get(baseurl);
	}
	
	public static void Edge_BrowsersStack_Invocation() throws MalformedURLException {
		String baseurl = "https://nesbittburnslocator.bmo.com/index.y.html";
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Edge");
		caps.setCapability("browser_version", "17.0");
		caps.setCapability("resolution", "1366x768");
		caps.setCapability("project", "Local & Locators_Pages");
		caps.setCapability("build", "Locator-Page");
		caps.setCapability("name", "Nesbittburns1_locatorPage");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.selenium_version", "3.14.0");

		    driver = new RemoteWebDriver(new URL(URL), caps);
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		    driver.get(baseurl);
	}
	
	public void verifyHomeDetails() {
		Assert.assertTrue(BMO_logo.isDisplayed());
		System.out.println("BMO Wealth Mangemnet logo is displayed");
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
		System.out.println("Name of Advisor:- "+advisor_name.getText());
		Assert.assertTrue(advisor_details.isDisplayed());
		System.out.println("Advisor post and address is:- "+advisor_details.getText());
		Assert.assertTrue(advisor_phone.isDisplayed());
		System.out.println("Advisor Phone number is:- "+advisor_phone.getText());	
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
		WebElement sendvia_email=driver.findElement(By.xpath("//a[@id='sendtoEmail26993']"));
		sendvia_email.click();
		Thread.sleep(8000);
		WebElement frame1=driver.findElement(By.xpath("//p[@id='dispPop']//iframe"));
		driver.switchTo().frame(frame1);
		WebElement details=driver.findElement(By.xpath("//div[@class='theAddress']"));
		Assert.assertTrue(details.isDisplayed());
		System.out.println("Investor Details:- "+ details.getText());
		Thread.sleep(3000);
		WebElement emailfield=driver.findElement(By.id("useremailaddress"));
		emailfield.sendKeys("ayadav@where2getit.com");
		Thread.sleep(3000);
		WebElement emailtextfield=driver.findElement(By.id("emailTextArea"));
		emailtextfield.sendKeys("Test Email");
		Thread.sleep(3000);
		WebElement emailsubmit_btn=driver.findElement(By.id("emailSubmitButton"));
		emailsubmit_btn.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement closebtn=driver.findElement(By.xpath("//a[@class='closeBtn']"));
		closebtn.click();
		//driver.navigate().to("https://nesbittburnslocator.bmo.com/index.y.html");
		//driver.manage().deleteAllCookies();
		
	}
	
	public void VerifySendToMobile() throws InterruptedException {
		Thread.sleep(3000);
		WebElement sendvia_mobile=driver.findElement(By.xpath("//a[@id='sendtoMobile26993']"));
		sendvia_mobile.click();
		Thread.sleep(5000);
		WebElement frame1=driver.findElement(By.xpath("//p[@id='dispPop']//iframe"));
		driver.switchTo().frame(frame1);
		WebElement details=driver.findElement(By.xpath("//div[@class='theAddress']"));
		Assert.assertTrue(details.isDisplayed());
		System.out.println("Investor Details:- "+ details.getText());
		Thread.sleep(3000);
		WebElement mobilefeild=driver.findElement(By.id("userPhone"));
		mobilefeild.sendKeys("3334445555");
		Thread.sleep(3000);
		WebElement mobilesubmit_btn=driver.findElement(By.id("smsSubmitButton"));
		mobilesubmit_btn.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement closebtn=driver.findElement(By.xpath("//a[@class='closeBtn']"));
		closebtn.click();
		//driver.navigate().to("https://nesbittburnslocator.bmo.com/index.y.html");
		//driver.manage().deleteAllCookies();
	}
	
	public void verify_profiledetails() throws InterruptedException {
		Thread.sleep(4000);
		WebElement profile_btn=driver.findElement(By.xpath("//span[@id='moreDetails26993-fr']"));
		profile_btn.click();
		Thread.sleep(5000);
		WebElement titlename=driver.findElement(By.xpath("//div[@class='desktop bold title']"));
		Assert.assertTrue(titlename.isDisplayed());
		System.out.println(titlename.getText());
		driver.navigate().back();
	}
}
