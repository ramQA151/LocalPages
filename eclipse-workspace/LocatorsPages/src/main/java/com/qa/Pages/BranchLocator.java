package com.qa.Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.TestBase;

public class BranchLocator extends TestBase {
	WebDriver driver;
	@FindBy(xpath = "//input[@id='inputaddress']")
	WebElement SearchTextBox;

	@FindBy(xpath = "//button[@id='submit-button']")
	WebElement FindStore;

	@FindBy(xpath = "//li[@class='poi-item default']")
	List<WebElement> TotalAddressCount;

	@FindBy(xpath = "//div[@class='address_row']")
	List<WebElement> TotalAddress;

	@FindBy(xpath = "//a[@class='ga_w2gi_loc']")
	WebElement DirectionsLink;

	@FindBy(xpath = "//a[@id='sendtoMobile7829']")
	WebElement TextBtn;

	@FindBy(xpath = "//div[@id='modalPop']")
	WebElement Textbox;

	@FindBy(xpath = "//*[@id='modalPop']")
	WebElement frame;

	@FindBy(xpath = "//span[contains(text(),'Send to a Mobile Device')]")
	WebElement FrameHeading;

	@FindBy(xpath = "//input[@name='usermobile']")
	WebElement MobNumber;

	@FindBy(xpath = "//input[@class='go_button']")
	WebElement SubmitBtn;

	@FindBy(xpath = "//div[contains(text(),'Your results have been sent to your mobile device.')]")
	WebElement ConformationMsg;

	@FindBy(xpath = "//a[@id='sendtoEmail7829']")
	WebElement Email;

	@FindBy(xpath = "//input[@name='useremail']")
	WebElement EnterEMail;

	@FindBy(xpath = "//textarea[@name='usercomments']")
	WebElement PersonalMessage;

	@FindBy(xpath = "//span[contains(text(),'Send to an E-mail Address')]")
	WebElement FrameTitle;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement SubmitButton;

	@FindBy(xpath = "//div[contains (text(), 'Your results have been sent to your e-mail address.')]")
	WebElement Conformationmsg;

	@FindBy(xpath = "//select[@id='country']")
	WebElement DropDown;

	@FindBy(xpath = "//div[@class='dropdown__item custom-checkbox']")
	List<WebElement> Filter;

	@FindBy(xpath = "//span[contains(text(),' Kempkers True Value and Rental, Inc.')]")
	WebElement address;

	@FindBy(xpath = "//a[contains(text(),'Store Info')][1]")
	WebElement TrueValueHardwareSite;

	@FindBy(xpath = "//*[contains(text(),'True Value Hardware')]//parent::td")
	WebElement verifyaddressonMap;

	@FindBy(xpath = "//a[@aria-label='Close Send Details via Email Window']")
	WebElement CloseBtn;

	public BranchLocator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SearchLocation() throws Exception {
		SearchTextBox.click();
		Thread.sleep(2000);
		SearchTextBox.clear();
		Thread.sleep(2000);
		SearchTextBox.sendKeys("50266");
		Thread.sleep(3000);
		FindStore.click();
		Thread.sleep(3000);
		DirectionsLink.click();
		System.out.println("Title of parent window is: " + driver.getTitle());
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String windowHandle : allWindowHandles) {
			if (!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
			}
		}
		Thread.sleep(6000);
		System.out.println("Title of child window is: " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowHandle);
	}

	public void TextWindow() throws Exception {
		SearchTextBox.click();
		Thread.sleep(2000);
		SearchTextBox.clear();
		Thread.sleep(2000);
		SearchTextBox.sendKeys("50266");
		Thread.sleep(3000);
		FindStore.click();
		Thread.sleep(3000);
		TextBtn.click();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		System.out.println(FrameHeading.getText());
		MobNumber.sendKeys("9259876543");
		SubmitBtn.click();
		Thread.sleep(3000);

		System.out.println(ConformationMsg.getText());
		driver.navigate().refresh();

	}

	public void Address() throws Exception {
		SearchTextBox.click();
		Thread.sleep(2000);
		SearchTextBox.clear();
		Thread.sleep(2000);
		SearchTextBox.sendKeys("50266");
		Thread.sleep(3000);
		FindStore.click();
		Thread.sleep(3000);
		List<WebElement> Address = TotalAddress;

		for (WebElement adr : Address) {
			String Addresses = adr.getText();
			System.out.println(Addresses);
			// Assert.assertEquals(Addresses, Addresses, "All Address are correct");
		}

	}

	public void Email() throws Exception {
		SearchTextBox.click();
		Thread.sleep(2000);
		SearchTextBox.clear();
		Thread.sleep(2000);
		SearchTextBox.sendKeys("50266");
		Thread.sleep(3000);
		FindStore.click();
		Email.click();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		Thread.sleep(4000);
		System.out.println("Title of the frame is: " + FrameTitle.getText());
		String ActAddress = verifyaddressonMap.getText();
		System.out.println(ActAddress);
		String ExpectedAddress = "True Value Hardware";
		Assert.assertTrue(ActAddress.contains(ExpectedAddress));
		EnterEMail.click();
		EnterEMail.sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		PersonalMessage.sendKeys("This is test message please ignore");
		SubmitButton.click();
		String ConfrmationMesage = Conformationmsg.getText();

		System.out.println(ConfrmationMesage);

		Assert.assertTrue(ConfrmationMesage.contains("Your results have been sent to your e-mail address"));
		driver.navigate().refresh();
	}

	public void CountryDropdown() throws Exception {
		SearchTextBox.click();
		Thread.sleep(2000);
		SearchTextBox.clear();
		Thread.sleep(2000);
		SearchTextBox.sendKeys("50266");
		Thread.sleep(3000);
		FindStore.click();
		Thread.sleep(3000);
		DropDown.click();
		String value = DropDown.getText().toString();
		System.out.println(value);
		Assert.assertTrue(value.contains("USA"));
		System.out.println("Dropdown contains USA Value");

	}

	public void filterOptions() throws Exception {
		SearchTextBox.click();
		Thread.sleep(2000);
		SearchTextBox.clear();
		Thread.sleep(2000);
		SearchTextBox.sendKeys("50266");
		Thread.sleep(3000);
		FindStore.click();

		for (WebElement ft : Filter) {
			ft.click();
			String FilterName = ft.getText();
			System.out.println("Total address for: " + FilterName + "are: " + TotalAddressCount.size());
			Thread.sleep(5000);
			ft.click();
		}
	}

	public void AddressVerify() throws Exception {
		SearchTextBox.click();
		Thread.sleep(2000);
		SearchTextBox.clear();
		Thread.sleep(2000);
		SearchTextBox.sendKeys("50266");
		Thread.sleep(3000);
		FindStore.click();
		String actAddress = address.getText();
		// TotalAddress.contains(address);
		String ExpectedAddress = ("KEMPKERS TRUE VALUE AND RENTAL, INC.");
		Assert.assertEquals(actAddress, ExpectedAddress);
		System.out.println("Expected and Actual Address Matched");

	}

	public void RedirecttoStore() throws Exception {
		SearchTextBox.click();
		Thread.sleep(2000);
		SearchTextBox.clear();
		Thread.sleep(2000);
		SearchTextBox.sendKeys("50266");
		Thread.sleep(3000);
		FindStore.click();
		TrueValueHardwareSite.click();
		String parentWindowHandle = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String windowHandle : allWindowHandles) {
			if (!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);

			}
		}
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//h1[@class='storename ']")).getText());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindowHandle);

	}

}
