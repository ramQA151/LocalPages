package com.qa.Pages;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class Michales_LocatorsPage extends TestBase {
	WebDriver driver;

	@FindBy(xpath = "//a[@class='css-a159wg']")
	WebElement Logo;

	@FindBy(xpath = "//input[@placeholder='Enter city, state, zip']")
	WebElement Zip;

	@FindBy(xpath = "//button[@id='menu-button-21']")
	WebElement DDBtn;

	@FindBy(xpath = "//button[@role='menuitem']")
	List<WebElement> DDValues;

	@FindBy(xpath = "//div[@class='e1fktqnk6 css-qel9cl']")
	List<WebElement> Locations;

	@FindBy(xpath = "//div[@class='css-1jgp1kk']")
	WebElement HeaderOptions;

	@FindBy(xpath = "//div[@class='css-2imjyh']")
	WebElement StoreServices;

	public Michales_LocatorsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SearchLocation() throws Exception {
		Zip.clear();
		Thread.sleep(1000);
		Zip.sendKeys("50266");
		Thread.sleep(3000);
		Zip.sendKeys(Keys.ENTER);
	}

	public void Logo() {
	if(	Logo.isDisplayed()) {
		System.out.println("Logo is pesent");
		System.out.println("---------------------------");
		}
	}

	public void AllLocations() throws Exception {
		SearchLocation();
		System.out.println("Store Details: ");
		for (WebElement Location : Locations) {
			System.out.println(Location.getText());
			System.out.println("---------------------------");
		}
	}

	public void DDBtn() throws Exception {
		Thread.sleep(5000);
		for (WebElement DDVal : DDValues) {
			DDBtn.click();
			Thread.sleep(5000);
			DDVal.click();
			System.out.println("For " + DDVal.getText() + " Distance otal available Locations are: " + Locations.size());
			System.out.println(DDVal.getText());
			System.out.println("---------------------------");
		}
	}

	public void HeaderOptions() {
		System.out.println("Following opions are present at header: ");
		System.out.println(HeaderOptions.getText());
		System.out.println("---------------------------");
	}

	public void ServiceOptions() {
		System.out.println("Following are the services present at the store: ");
		System.out.println(StoreServices.getText());
	}
}
