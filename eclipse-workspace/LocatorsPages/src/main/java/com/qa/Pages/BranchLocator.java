package com.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.Base.TestBase;

public class BranchLocator extends TestBase {

	WebDriver driver;

	@FindBy(xpath = "(//button[contains(text(),'Bank Accounts')])[2]")
	WebElement BankAccount;

	@FindBy(xpath = "(//button[contains(text(),'Credit Cards')])[2]")
	WebElement CreditCard;

	@FindBy(xpath = "(//button[contains(text(),'Mortgages')])[2]")
	WebElement Mortgage;

	@FindBy(xpath = "(//button[contains(text(),'Loans')])[3]")
	WebElement Loans;

	@FindBy(xpath = "(//button[contains(text(),'Investing')])[2]")
	WebElement Investing;

	@FindBy(xpath = "(//button[contains(text(),'Insurance')])[4]")
	WebElement Insurance;

	@FindBy(xpath = "(//button[contains(text(),'Offers & Programs')])[2]")
	WebElement OffersPrograms;

	@FindBy(xpath = "//input[@id='inputaddress']")
	WebElement SearchTextBox;

	@FindBy(css = "input#inputaddress")
	WebElement inputBox;

	@FindBy(css = "button#search_button")
	WebElement SearchBtn;

	@FindBy(xpath = "//div[@class='poi_address']")
	List<WebElement> TotalLocations;

	@FindBy(xpath = "(//a[@role='button'])[1]")
	WebElement FilterOptn;

	@FindBy(xpath = "//select[@id='languages']")
	WebElement LanguageDropdown;

	@FindBy(xpath = "//div[@class='filter-toggles']//fieldset")
	List<WebElement> BranchLocationCriteria;

	@FindBy(xpath = "//a[@id='email-b0033']")
	WebElement Email;

	@FindBy(xpath = "//p[@id='dispPop']//iframe")
	WebElement frame;

	@FindBy(xpath = "//input[@id='useremailaddress']")
	WebElement Emailidbox;

	@FindBy(xpath = "//textarea[@id='emailTextArea']")
	WebElement TextArea;

	@FindBy(xpath = "//input[@ID='emailSubmitButton']")
	WebElement SubmitBtn;

	@FindBy(xpath = "//div[@class='divmargin' or contains(text(),'The location has been sent to your e-mail address.')]")
	WebElement ConformationMsg;

	@FindBy(xpath = "//span[@class='zmdi zmdi-close']")
	WebElement CloseWindow;
	
	@FindBy(xpath="(//a[@class='lightwindow mobileicon'])[1]")
	WebElement Mobile;

	@FindBy(id="userPhone")
	WebElement mobileNumber;
	
	@FindBy(id="smsSubmitButton")
	WebElement Submitbtnmobile;
	
	@FindBy(xpath="//div[@class='divmargin']")
	WebElement Confrmationmsg;
	
	
	public BranchLocator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void VerifyHeaderMenu() {
		if (BankAccount.isDisplayed()) {
			System.out.println("Bank Account option is available");
		}
		if (CreditCard.isDisplayed()) {
			System.out.println("Credit card option is available");
		}
		if (Mortgage.isDisplayed()) {
			System.out.println("Mortgage option is available");
		}
		if (Loans.isDisplayed()) {
			System.out.println("Loans option is available");
		}

		if (Investing.isDisplayed()) {
			System.out.println("Investing option is available");
		}

		if (Insurance.isDisplayed()) {
			System.out.println("Insurance option is available");
		}

		if (OffersPrograms.isDisplayed()) {
			System.out.println("Offers & Programs option is available");
		}

	}

	public void EnterCity() throws Exception {
		Thread.sleep(8000);
		inputBox.click();
		inputBox.clear();
		inputBox.sendKeys("st. Catharines ON");
		Thread.sleep(2000);
		SearchBtn.click();
	}

	public void TotalLocations() throws Exception {
		EnterCity();

		for (WebElement Location : TotalLocations) {
			System.out.println("City name: " + Location.getText());
			System.out.println(" ");
		}
		System.out.println("Total city details are provided successfully");
	}

	public void FilterOptions() throws Exception {
		EnterCity();
		Thread.sleep(3000);
		FilterOptn.click();
		Thread.sleep(3000);
		LanguageDropdown.click();
		Select sel = new Select(LanguageDropdown);

		List<WebElement> op = sel.getOptions();
		int size = op.size();
		for (int i = 0; i < size; i++) {
			String options1 = op.get(i).getText();
			System.out.println(options1);
		}
	}

	public void verifyMailandPhone() throws Exception {
		EnterCity();
		Thread.sleep(5000);
		Email.click();
		driver.switchTo().frame(frame);
		Thread.sleep(5000);
		Emailidbox.click();
		Emailidbox.sendKeys("abc@gmail.com");
		TextArea.sendKeys("Test message");
		SubmitBtn.click();

		Thread.sleep(4000);
		System.out.println(ConformationMsg.getText());
		driver.navigate().refresh();
		Thread.sleep(4000);
		EnterCity();
		Thread.sleep(3000);
		Mobile.click();
		Thread.sleep(3000);
		driver.switchTo().frame(frame);
		Thread.sleep(5000);
		mobileNumber.sendKeys("8956231457");
		Submitbtnmobile.click();
		Thread.sleep(5000);
		System.out.println(Confrmationmsg.getText());
		driver.navigate().refresh();
	}
}
