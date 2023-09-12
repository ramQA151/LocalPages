package com.qa.Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.Base.TestBase;

public class OfficeDepot extends TestBase {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='inputaddress']")
	WebElement inputField;

	@FindBy(xpath = "//input[@id='locator_submit2']")
	WebElement SearchBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr")
	List<WebElement> locations;

	@FindBy(xpath = "//table[@id='toggleText']//td")
	List<WebElement> Filters;

	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> checkbox;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[5]/a[4]")
	WebElement Direction;
	
	@FindBy(xpath = "//a[@id='lightwindow_title_bar_close_link']")
	WebElement NoticeBoardClosebtn;
	
	@FindBy(xpath = "(//div[@class='addressWrapper bubble_leftCol'])[2]")
	WebElement Address;

	@FindBy(xpath = "(//div[@class='storeWrapper bubble_rightCol'])[2]")
	WebElement Timing;

	@FindBy(xpath = "(//input[@name='addressline'])[5]")
	WebElement ToName;

	@FindBy(xpath = "(//input[@type='submit'])[3]")
	WebElement GoBtn;

	@FindBy(xpath = "(//table[@id='collection_maneuvers']//tr[2])[2]")
	WebElement From;

	@FindBy(xpath = "(//table[@id='collection_maneuvers']//tfoot//td)[2]")
	WebElement To;
	
	@FindBy(xpath = "(//a[@class='lightwindow'])[5]")
	WebElement Email;
	
	@FindBy(xpath="//iframe[@id='lightwindow_iframe']")
	WebElement Frame;
	
	@FindBy(xpath="//div[@class='divmargin']//div")
	WebElement StartAddress;
	
	@FindBy(xpath="(//div[@class='divmargin'][2]//div)[6]")
	WebElement EndAddress;
	
	@FindBy(xpath="//input[@id='useremailaddress']")
	WebElement EmailAddress;
	
	@FindBy(xpath="//input[@title='Submit']")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//div[@class='divmargin']")
	WebElement ConformationMessage;
	
	@FindBy(xpath="//a[@id='lightwindow_title_bar_close_link']")
	WebElement CloseBtn;

	public OfficeDepot(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void EnterZip() throws Exception {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(10000);
		inputField.clear();
		inputField.sendKeys("50266");
		Thread.sleep(2000);
		SearchBtn.click();

	}

	public void TotalLocations() throws Exception {
		System.out.println("--------------------------------");
		EnterZip();
		for (WebElement location : locations) {
			System.out.println(location.getText());
		}

	}

	public void TotalFilters() throws Exception {
		System.out.println("--------------------------------");
		EnterZip();
		for (WebElement cb : checkbox) {
			try {
			cb.click();
			Thread.sleep(4000);
			System.out.println("Number of addresses are: " + locations.size());
			Thread.sleep(4000);
			cb.click();
			Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println("Zero Address Found");
				NoticeBoardClosebtn.click();
				Thread.sleep(4000);
				cb.click();
			}
		}
	}
	
	
	public void TotalFilterNames() throws Exception {
		System.out.println("--------------------------------");
		EnterZip();
		for (WebElement Fltr : Filters) {
		System.out.println("List of Filters: "+Fltr.getText());
	}
		}

	public void Direction() throws Exception {
		System.out.println("--------------------------------");
		EnterZip();
		Thread.sleep(3000);
		Direction.click();
		Thread.sleep(3000);
		System.out.println("Shop Address is: " + Address.getText());
		Thread.sleep(3000);
		System.out.println("-----------------------------");
		System.out.println("Shop timing is: " + Timing.getText());
		Thread.sleep(3000);
		ToName.clear();
		Thread.sleep(3000);
		ToName.sendKeys("50131");
		Thread.sleep(2000);
		GoBtn.click();
		Thread.sleep(10000);
		System.out.println("--------------------------------");
		System.out.println(From.getText());
		Thread.sleep(3000);
		System.out.println(To.getText());
		Thread.sleep(2000);
		System.out.println("--------------------------------");
		Email.click();
		Thread.sleep(4000);
		driver.switchTo().frame(Frame);
		Thread.sleep(2000);
		System.out.println(StartAddress.getText());
		Thread.sleep(2000);
		System.out.println(EndAddress.getText());
		EmailAddress.sendKeys("abc@gmail.com");
		SubmitBtn.click();
		Thread.sleep(2000);
		System.out.println("--------------------------------");
		System.out.println(ConformationMessage.getText());
		CloseBtn.click();
		
		
	}
}
